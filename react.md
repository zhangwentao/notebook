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
```javascript  {
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
