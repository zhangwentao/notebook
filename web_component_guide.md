# Web Components 学习分享

## 一、Web Components 基础概念

Web Components 是一套用于构建可复用前端 UI 组件的原生浏览器标准，包含三个核心部分：

1. **Custom Elements**：自定义 HTML 标签，定义组件行为与生命周期。
2. **Shadow DOM**：提供 DOM 和样式的封装隔离。
3. **HTML Templates**：定义组件的结构模板。

### 核心技术
- Custom Elements 负责「定义组件」
- Shadow DOM 负责「封装实现」
- HTML Templates 用于定义组件的结构模板，通常配合 `<template>` 标签使用。模板内容不会直接渲染到页面，而是可通过 JS 克隆并插入到 DOM。

#### 自定义组件及封装
```js
class MyCard extends HTMLElement {
  constructor() {
    super();
    const shadow = this.attachShadow({ mode: 'open' });
    shadow.innerHTML = `
      <style>
        div { color: blue; }
      </style>
      <div>我是内部内容</div>
    `;
  }
}
customElements.define('my-card', MyCard);
```

#### 使用 HTML Template
```html
<template id="card-template">
  <style>
    .card { border: 1px solid #ccc; padding: 8px; border-radius: 4px; }
  </style>
  <div class="card">
    <slot></slot>
  </div>
</template>
```

```js
class MyCard extends HTMLElement {
  constructor() {
    super();
    const shadow = this.attachShadow({ mode: 'open' });
    const template = document.getElementById('card-template');
    shadow.appendChild(template.content.cloneNode(true));
  }
}
customElements.define('my-card', MyCard);
```

#### 使用自定义组件
``` html
<my-button></my-button>
```
---

## 二、Web Components 在实际开发中的使用

### 初始化与组织方式
1. 在项目中定义每个组件的类文件。
2. 通过 `customElements.define()` 注册标签。
3. 在页面中直接使用该标签。
4. 若组件间有交互，可通过自定义事件或属性传值
#### 示例代码

**1. 定义组件类文件（如 `my-button.js`）：**
```js
class MyButton extends HTMLElement {
  static get observedAttributes() {
    return ['label'];
  }
  constructor() {
    super();
    const shadow = this.attachShadow({ mode: 'open' });
    shadow.innerHTML = `
      <style>
        button { background: #409eff; color: #fff; border: none; padding: 8px 16px; border-radius: 4px; cursor: pointer; }
      </style>
      <button></button>
    `;
    this.buttonEl = shadow.querySelector('button');
    this.buttonEl.addEventListener('click', () => {
      this.dispatchEvent(new CustomEvent('clicked', { detail: '按钮被点击', bubbles: true }));
    });
  }
  connectedCallback() {
    this._updateLabel();
  }
  attributeChangedCallback(name, oldValue, newValue) {
    if (name === 'label') {
      this._updateLabel();
    }
  }
  _updateLabel() {
    this.buttonEl.textContent = this.getAttribute('label') || '点击我';
  }
}
customElements.define('my-button', MyButton);
```

**2. 在页面中注册并使用组件（带属性传递）：**
```html
<!-- 引入组件类文件 -->
<script src="./my-button.js"></script>

<!-- 页面中直接使用自定义标签，并传递 label 属性 -->
<my-button label="自定义文案"></my-button>

<script>
  document.querySelector('my-button').addEventListener('clicked', e => {
    console.log(e.detail); // 输出：按钮被点击
  });
</script>
```

组件逻辑（JS）通常放在组件类内部，或通过模块引入。

---

## 三、Web Components 与 iframe 对比

| 对比点 | Web Component | iframe |
|---------|----------------|--------|
| 隔离性 | 样式与DOM可局部隔离（Shadow DOM） | 完全隔离（独立文档上下文） |
| 通信 | 自定义事件、属性传递 | postMessage |
| 性能 | 轻量，不需要浏览器多开文档 | 较重，每个 iframe 都是完整渲染上下文 |
| 使用场景 | 微前端、内嵌组件 | 外部系统嵌入、跨域隔离 |

结论：如果只想封装局部 UI 模块，用 Web Component；如果要嵌入完整外部页面或跨域安全隔离，用 iframe。

---

## 四、Web Components 与 React / Vue 对比

| 特性 | Web Components | React / Vue |
|------|----------------|--------------|
| 响应式数据 | 手动维护 | 内置响应系统 |
| 生命周期 | 原生 DOM 生命周期 | 框架生命周期 |
| 样式作用域 | Shadow DOM 隔离 | scoped / CSS Modules |
| 虚拟 DOM | 无（浏览器原生） | 有（框架管理） |
| 跨框架使用 | ✅ 支持 | ❌ 限制在框架内 |

**总结**：
- 如果希望组件跨框架可复用 → Web Component
- 如果主要在 React/Vue 内部开发 → 用框架原生组件更方便

---

## 五、在 Vue 中使用 Web Components

Vue 从 2.6+ / Vue 3 开始原生支持 Web Components。

### 引入使用
```js
import './my-button.js';
createApp(App).mount('#app');
```

```vue
<template>
  <my-button @clicked="handleClick"></my-button>
</template>

<script setup>
function handleClick(e) {
  console.log('web component 点击', e.detail);
}
</script>
```

### 注意点
1. 传递对象需通过 ref 设置 property。
2. 事件名建议小写（Vue 会转小写）。
3. 插槽 slot 可直接使用。

---

## 六、在 React 中使用 Web Components

React 视自定义元素为普通 DOM 标签。

### 示例

```js
import React, { useRef, useEffect } from 'react';
import './my-counter.js';

export default function App() {
  const ref = useRef();
  useEffect(() => {
    const el = ref.current;
    const handler = e => console.log(e.detail);
    el.addEventListener('count-changed', handler);
    return () => el.removeEventListener('count-changed', handler);
  }, []);

  return <my-counter ref={ref}></my-counter>;
}
```

### 注意事项
- 必须用 `addEventListener` 监听事件（React 不支持 CustomEvent）。
- 复杂属性需通过 ref 设置 property。
- 插槽可正常渲染。

### 推荐封装
将 Web Component 封装成 React 组件（Wrapper），以简化使用体验。

---

## 七、常用 Web Components 融合库

| 库名 | 作用 | 适用场景 | 优点 | 缺点 |
|------|------|-----------|------|------|
| **@r2wc/react-to-web-component** | React → Web Component | 跨框架复用 React 组件 | 简单直接 | 运行时封装层 |
| **@lit/react** | Web Component → React | 在 React 中使用 Lit / WC | 自动事件 & 属性映射 | 有 wrapper 成本 |
| **vue-web-component-wrapper** | Vue2 → Web Component | 把 Vue2 组件导出成 WC | 官方出品 | Vue3 不完全兼容 |
| **Vue defineCustomElement** | Vue3 原生 API | Vue3 直接输出 WC | 原生支持 | 无法在 React 内直接绑定响应式 |

---

## 八、结论

- ✅ **如果目标是跨框架复用组件** → 使用 Web Component。
- ✅ **如果项目以 Vue/React 为核心** → 在框架内部使用其组件体系更高效。
- ⚙️ **结合场景**：可以用 Web Component 封装通用模块，在不同框架应用中引入。
- 🧰 **生态工具**：@lit/react、r2wc、vue-web-component-wrapper 等可帮助桥接差异。

## 九、兼容性

### 一、Web Components 的 4 大核心规范
| 模块                  | 功能                                       | 标准状态   |
| ------------------- | ---------------------------------------- | ------ |
| **Custom Elements** | 定义自定义 HTML 元素（`customElements.define()`） | ✅ 已标准化 |
| **Shadow DOM**      | 样式和 DOM 封装（`attachShadow()`）             | ✅ 已标准化 |
| **HTML Templates**  | `<template>` 定义可复用 DOM 片段                | ✅ 已标准化 |
| **ES Modules**      | 模块化加载组件脚本                                | ✅ 已标准化 |

### 二、浏览器兼容性总览（截至 2025）

| 浏览器                                   | 版本支持情况        | 备注                            |
| ------------------------------------- | ------------- | ----------------------------- |
| **Chrome**                            | ✅ 完全支持（≥ v54） | 原生支持所有特性                      |
| **Edge (Chromium)**                   | ✅ 完全支持（≥ v79） | 与 Chrome 一致                   |
| **Firefox**                           | ✅ 完全支持（≥ v63） | 曾有 Shadow DOM 性能问题，已优化        |
| **Safari (macOS/iOS)**                | ✅ 支持（≥ v10.1） | 现版本已较稳定，但仍有小 bug（如 slot 样式继承） |
| **Opera**                             | ✅ 完全支持        | Chromium 内核                   |
| **Samsung Internet / Android Chrome** | ✅ 支持良好        | 与 Chromium 一致                 |
| **老版 Edge (EdgeHTML)**                | ❌ 不支持         | 已淘汰                           |
| **IE11 / IE 系列**                      | ❌ 不支持         | 只能靠 polyfill                  |

结论：现代浏览器（Chrome / Edge / Firefox / Safari / Opera）全部原生支持。
只有 IE11 和老 Edge 需要 polyfill。

---

# 实际业务场景
商业分析助手，大模型生成图表嵌入实现分析

## 现状

1. 服务端返回 完整 HTML 页面字符串，包含html,head,style,script 标签。
2. 当前方案：动态写入 iframe.contentDocument, 还可以`<iframe srcdoc="...">` 方式引入

## 使用 web component 实现分析
在大多数场景下，Web Component 性能显著优于 iframe，但它们的隔离级别和应用边界不同，不能简单替代。

### 一、底层机制差异

| 对比项     | **Web Component**              | **iframe**                    |
| ------- | ------------------------------ | ----------------------------- |
| 渲染上下文   | 共享同一个浏览器上下文（同一 DOM、同一 JS 引擎实例） | 独立浏览器上下文（独立 DOM 树、独立 JS 引擎实例） |
| 样式隔离    | Shadow DOM 局部隔离                | 完全隔离（独立 CSSOM）                |
| JS 运行环境 | 共享主页面 JS 线程                    | 独立 JS 引擎、独立全局对象               |
| 通信方式    | 属性、事件、方法直接交互                   | postMessage（跨文档消息）            |
| 内存消耗    | 轻量（共用主线程）                      | 重（每个 iframe 相当于一个迷浏览器）       |
| 安全隔离    | 弱（主页面能直接访问子组件）                 | 强（完全隔离）                       |


### 二、性能对比分析

1. 启动开销
    - iframe：浏览器要为每个 iframe 启动新的文档加载、解析 HTML/CSS/JS，几乎等同于打开一个独立页面。
    - Web Component：仅需创建自定义元素、插入 DOM，属于同一个页面上下文。

    Web Component 启动性能高数十倍以上，特别是在多实例场景（几十个子模块）时。

2. 内存与线程开销
    - iframe 会分配独立的内存空间（含 JS 引擎堆栈、样式树、布局树等）。
    - Web Component 共用宿主页面的渲染和执行上下文，仅有少量 DOM 和样式节点。

    Web Component 更节省内存，浏览器资源占用低

3. 通信性能
    - iframe → 主页面通信需 postMessage（异步、序列化），性能损耗明显。
    - Web Component → 可通过属性或事件同步通信（无需跨上下文）。

    Web Component 的交互通信延迟更低

4. 隔离成本与风险

    Web Component 的隔离是“逻辑层面的”：
    - Shadow DOM 隔离样式，但 JS 仍可直接访问组件内容。
    - 如果组件中执行外部脚本（尤其是服务端注入 HTML + JS），会共享宿主页面的执行上下文，存在 XSS、污染全局变量的风险。

    而 iframe：自带 安全沙箱（sandbox）可以彻底防止子页面修改主页面环境。

    所以如果的注入内容是第三方服务端生成的整页 HTML + JS， iframe 安全性高得多， Web Component 反而危险（可能污染宿主环境）。

### 三、适用场景建议

| 目标                | 推荐技术                   |
| ----------------- | ---------------------- |
| 嵌入完全独立、第三方生成的完整页面 | ✅ iframe（安全、隔离）        |
| 嵌入受控的模块内容（自己生成）  | ✅ Web Component（轻量高效）  |
| 需要跨系统安全通信（跨域）     | ✅ iframe + postMessage |
| 内嵌组件要与宿主紧密交互      | ✅ Web Component        |
| 微前端架构             | 可根据需要混合使用（见下）          |

### 性能对比

| 指标     | iframe            | Web Component   |
| ------ | ----------------- | --------------- |
| 初始加载时间 | ≈ 800~1200ms × 10 | ≈ 50~100ms × 10 |
| 内存占用   | 高（每个 20~50MB）     | 低（共享上下文）        |
| 通信延迟   | ~3–5ms（异步）        | <1ms（同步）        |
| 安全隔离   | 强                 | 弱               |
| 样式隔离   | 强                 | 中等（Shadow DOM）  |

### 结论总结

| 维度                   | 推荐                        |
| -------------------- | ------------------------- |
| **性能**               | ✅ Web Component 优势明显      |
| **隔离性 / 安全性**        | ✅ iframe 胜出               |
| **开发灵活性**            | ✅ Web Component           |
| **加载完整页面（含 JS/CSS）** | ⚠️ iframe（WC 无法安全执行外部 JS） |
| **嵌入同域、自控页面**        | ✅ Web Component 最优        |

- Web Component 性能更优，但安全性与隔离不如 iframe。
- 如果注入内容是外部系统输出的完整 HTML + JS 页面，仍建议使用 iframe。
- 若是控制的组件或模块内容，Web Component 是更现代、更高效的替代方案。