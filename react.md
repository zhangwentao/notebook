# react

## feature

1. Declarative
>  “telling what to do instead of how to do it”
>
> [doc](https://medium.com/trabe/why-is-react-declarative-a-story-about-function-components-aaae83198f79#:~:text=%E2%80%9CDeclarative%E2%80%9D%2C%20at%20least%20in%20the%20programming%20sense%2C%20is,and%20just%20let%20React%20handle%20it%20from%20there.)

2. Component-Based

## JSX

### definition
* it is a syntax extension to JavaScript.
* not tempalte language, it come with full power of javascript.
> The main difference is that JSX functions are never used in the actual HTML file, while Vue templates are.
>
> [doc](https://www.freecodecamp.org/news/reacts-jsx-vs-vue-s-templates-a-showdown-on-the-front-end-b00a70470409/)

## React vs VUE
react is more approaching javascript syntax, basically is javascript syntax, not bring in other template language to learn. once you understand the react concept.

vue is more get started. because using it needn't to understand it concept.

### jsx eg.
``` jsx 
const element = <h1>Hello, world!</h1>;
```
> An expression is a phrase of JavaScript that a JavaScript interpreter can evaluate to produce a value. 
>
> Quote from \<\<The javascript definition guide \>\>

1. embeding expressions in JSX
```jsx
const name = 'Josh Perez';
const element = <h1>Hello, {name}</h1>;
```
2. specifying Attributes with JSX

    1. string literals attribute value
    ``` jsx
    const element = <a href="https://www.reactjs.org"> link </a>;
    ```
    2.
    ``` jsx
    const element = <img src={user.avatarUrl}></img>;
    ```

3.  JSX is expression too

>After compilation, JSX expressions become regular JavaScript function calls and evaluate to JavaScript objects.``` React.createElement() ```
this calls return a Object ,called ``` React Element ```,it like this 
```javascript  
{
  type: 'h1',
  props: {
    className: 'greeting',
    children: 'Hello, world!'
  }
};
```
> [react doc](https://reactjs.org/docs/introducing-jsx.html#jsx-is-an-expression-too)

so, we can use jsx like other js expressions. because jsx is just js expression.

## React Element
1. React Elements are  plain JavaScript Object, more cheap to create than Browser DOM Element.
2. React Elements are smallest building block of React App.
3. React Elements are immutable. Component's render() function or functional Components produce React Elements, also include JavaScript function. They are "factory" to produce React Elements.

## Hooks

## Add _React_ to a HTML page

### two js file
+ react 
+ react-dom

# some understanding
## 逻辑 
React.createElement() 如其参数，关注：生成‘什么组件’，及要生成的’组件‘的’输入参数‘是什么。这个函数的主要参数就是组件名称，组件的props，此外还有这个组件的childrens（子组件数组）。

React.createElement() 函数一般情况是又babel编译器将JSX语法的代码转译生成的。其返回值是ReactElement对象，就是普通的js对象。经过层层调用的React.createElement()函数的掉用，最终生成的ReactElement是一个树状结构，父组件->子组件们->孙组件们。这个树最终会作为参数给ReactDom.render()函数，这个函数会根据传入的组件树状结构定义生成浏览器中的DOM树。当组件状态改变时，也会自动更新DOM树。
## 什么是组件
刚接触React时，直觉上会认为一个React组件经过React渲染后，最终肯定会对应到页面中的某个显示出来的视觉元素。比如定义一个Button组件,用于定义一个按钮组件，当把这个Button在某个页面实例化之后，在页面中就可以看到这个按钮。

当我们在使用Redux 或 ReactRouter 时，就会发现这些库中，的 Router、Route 、Provider等组件，并不会在页面中有视觉呈现。可能就会感到比较迷惑，这些怎么也是组件。之后我们会发现，在使用这些组件时，往往都是把我们的组件作为这些组件的children。其实这些组件封装的是逻辑而不是视觉呈现，它们的内部逻辑，通常会影响，作为这些组件children的组件是否展示，被传入额外参数等等逻辑。比如 Context.Provider 组件。

## 其他
react组件的children 不一定是 组件，可以是任何表达式。
