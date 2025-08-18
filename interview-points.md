
# 考察点

## web开发基础

### HTML
- 手写一个简单的html页面
  - 考察功能性标签作用
    - html页面结构是否正确
    - `<!doctype html>`
    - html、head、body、script、link
    - script标签作用及属性
    - link标签作用及属性

### CSS
- 盒模型
  - 内边距、外边距、边框、内容区
  - `box-sizing`
- `display`属性，不同值对于显示的不同效果和区别
  - `inline`
  - `block`
  - `inline-block`
  - `flex`
  - html元素的默认`display`属性取值：div，p，a，span
- 定位
  - `position`
    - `absolute`
    - `relative`
    - `static`
  - 居中（纵向、横向）
    - 文本
    - 元素
- `flex`（css3）

### JS
- 变量作用域
  - 函数作用域
  - 块级作用域
  - 变量声明提升
- 对象
  - 方法
  - 属性
- 原型
- `this`关键字
  - `call`、`apply`、`bind`
- ES6
  - 箭头函数
  - `let`、`const`

#### 手写bind
```javascript
// 示例代码位置
```

#### 事件循环
```javascript
setTimeout(function(){
  console.log(2);
});
console.log(1);
// 输出：1, 2
```

#### this与原型链
```javascript
function test() {
}
function a () {
  console.log(this.age);
}
function b () {
  setTimeout(function() {
    console.log(this.age);
  });
}
test.prototype.a = a;
test.prototype.b = b;

var t = new test();
t.age = 10;
t.a();
t.a = function() {console.log(2);}
t.a()
t.b();
a();
输出：
10
2
undefined
undefined
```

#### 作用域
```javascript
var a = 1;
function test() {
  var c = 3;
  console.log(a);
  a = 2;
  console.log(a);
  b = 4;
}
test();
console.log(a);
console.log(b);
console.log(c);
输出
1
2
2
4
ReferenceError: c is not defined
```

#### 变量定义提升
```javascript
var a = 1;
function test() {
  console.log(a);
  var a = 2;
  console.log(a);
}
test();

在浏览器中运行输出是什么：
undefined
2
```

#### 闭包
```javascript
var v1 = 1
function a() {
  var v1 = 2;
	function b() {
    console.log(v1);
  }
  return b;
}
var t = a();
t();

输出：
2
```

## 实际开发
### 版本控制工具使用
#### git命令
- `add`
- `commit`
- `clone`
- `pull`
- `push`

### 模块化

### 前后端通信
- 数据格式
  - JSON
    - `js`内置对象`parse`，`stringify`
- 如何通信
  - 原生`XMLHttpRequest`对象
  - `jQuery ajax`
  - `Axios`

### 异步处理
- 回调
- `promise`

## 框架
### React
### 引深
- 使用`react`（`vue`）与之前的开发方式有什么区别？
```
