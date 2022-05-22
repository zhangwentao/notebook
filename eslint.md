ESLint
======

## 什么是 Linting
Linting 是通过运行一个用于分析源代码的程序，从而发现被分析的源代码中可能存在的错误的过程。
> https://stackoverflow.com/questions/8503559/what-is-linting

Linting 是对代码的静态分析，经常被用作发现代码中的容易导致问题的编码模式以及是否违背了某种特定的源代码书写规范或风格。
> https://eslint.org/docs/about/

## Linting重要性之于JS 
JavaScript是动态松散类型编程语言，特别容易出现开发人员错误。其他编译型语言可以把linting过程集成到编译过程中，但JS是解释型语言，没有编译过程。所以为了发现源代码中的语法错误或其他错误，需要将源代码运行。linting工具可以在不运行源代码的情况下，对代码进行[静态代码分析](https://en.wikipedia.org/wiki/Static_program_analysis)，从而在运行之前发现错误。
> https://eslint.org/docs/about/

## 什么是ESLint
ESLint是一个开源的JavaScript linting工具,最初由[Nicholas C. Zakas](http://nczonline.net/)在2013年6月创作。

### 特点
+ 开源
+ 插件化,允许开发者编写自己的linting规则(以下简称规则)插件
+ 附带内置规则，开箱即用
+ 每个规则，可以独立的“开启”或“关闭”, 独立设置为“警告”或“错误”
+ 使用 Node.js 编写
+ 使用 npm 安装
> https://eslint.org/docs/about/ 

### 使用
#### 环境要求
+  Node.js (>=6.14), npm version 3+
#### 安装
#### 局部安装
``` bash
npm install eslint --save-dev
```
#### 全局安装
``` bash
npm install eslint --global
```
#### 使用方式
##### 命令行
``` 
eslint filepath.js
```
##### 编辑器插件

简单来说如果你使用vscode编写js代码，将ESLint配合下面的插件使用，那么你会感觉自己真正的拥有了一个写js代码的IDE，它可以做到在你编写代码的同时，对你的代码进行静态分析，发现你代码中的错误，并**友好**的进行提示，甚至可以自动修复ESLint指定为可以自动修复的错误。在代码运行之前发现并修复错误，这可以大大提高你的开发效率。绝对是一个开发利器。
> ESLint Plugin for [vscode](https://marketplace.visualstudio.com/items?itemName=dbaeumer.vscode-eslint)

## 结语
这里仅对ESLint进行了一个粗略的介绍和本人亲身的使用感受，因为官方文档对ESLint的概念使用进行了非常完善的描述，所以就不在赘述。
> [官方文档](https://eslint.org/) 