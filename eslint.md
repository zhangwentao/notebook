ESLint
======

## 什么是 linting

Linting 是通过运行一个用于分析源代码的程序，从而发现被分析的源代码中可能存在的错误的过程。
> https://stackoverflow.com/questions/8503559/what-is-linting

Linting 是对代码的静态分析，经常被用作发现代码中的容易导致问题的编码模式以及是否违背了某种特定的源代码书写规范或风格。
> https://eslint.org/docs/about/

## linting重要性之于JS 
JavaScript是动态松散类型编程语言，特别容易出现开发人员错误。其他编译型语言可以把lint过程集成到编译过程中，但JS是解释型语言，没有编译过程。所以为了发现源代码中的语法错误或其他错误，需要将源代码运行。lint工具可以在不运行源代码的情况下，对代码进行[静态代码分析](https://en.wikipedia.org/wiki/Static_program_analysis)，发现错误。
> https://eslint.org/docs/about/

## ESLint
ESLint是一个开源的JavaScript linting工具,最初由[Nicholas C. Zakas](http://nczonline.net/)在2013年6月创作。

### 特点
+ 开源
+ 插件化，允许开发者编写自己的linting规则
+ 附带预制规则，开箱即用
+ 每个规则，可以独立的开关
+ 使用 Node.js 编写
+ 使用 npm 安装
> https://eslint.org/

### 如何使用

#### 环境要求
+  Node.js (>=6.14), npm version 3+

#### 安装
``` bash
npm install eslint
```


### 概念

#### Rules 规则
+ ESlint 中的规则都按照类别分组了，以便理解它的目的
+ 规则默认都是不开启的

### 使用

#### 配置

+ 配置文件 
    - ```.eslintrc.*```中json格式或者js代码,一般来说就是 ```.eslintrc```文件
    - ```package.json```文件中的```eslintConfig```字段
    - 作用范围: 作用于配置文件所在目录及其所有子目录
    - 注意：如果在运行```eslint```的目录中不存在配置文件，eslint会尝试在home目录（```~/```）,寻找eslint 的配置文件。
+ 配置项目
    - env 代码预计要运行的环境,不同的运行环境会预定义不同的全局变量
    - globals 其他需要自定义的全局变量
    - rules 规则
    - parserOptions 指定需要支持的 ecmascript的版本,默认是es5.注意这只是设置支持相应ecma语言的语法，并不会自动设置不同语言版本中的全局变量,语言内的全局变量需要在env中设置,包含如下子项
        * ecmaVersion: 5,6,7 ...
        * sourceType: 'script' 'module'
        * ecmaFeatures: 
            + globalReturn
            + impliedStrict
            + jsx
