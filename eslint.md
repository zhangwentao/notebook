ESLint
======

## what is linting
Linting 就是运行一个程序，这个程序会分析指定的源代码，以发现潜在的问题的过程或者说是一种操作。

现在的linting工具还可以检查被分析的代码是否符合某种特定的编码风格。这是一种静态分析，通常编译型语言会在编译阶段执行linting操作，javascript是动态弱类型非编译型语言，没有编译阶段的检查，很多问题只能到运行阶段才会发现，linting工具可以作为补充，在不运行js代码的情况下对代码进行检查。

> https://stackoverflow.com/questions/8503559/what-is-linting

## ESLint
ESLint 就是一种专门用来linting JavaScript 语言的linting工具。

初创作者:[Nicholas C. Zakas](http://nczonline.net/)

### 特点
+ 开源
+ 可插拔的(插件化)
+ 使用 Node.js 编写
+ 使用 npm 安装
> https://eslint.org/

### 哲学
+ 所有东西都可插拔
    - 规则接口 

### 概念

#### Rules 规则
+ ESlint 中的规则都按照类别分组了，以便理解它的目的
+ 规则默认都是不开启的

### 使用

#### 安装

``` bash
npm install eslint
```
#### 配置

+ 配置文件 
    - ```.eslintrc.*```中json格式或者js代码,一般来说就是 ```.eslintrc```文件
    - ```package.json```文件中的```eslintConfig```字段
    - 作用范围: 作用于配置文件所在目录及其所有子目录
    - 注意：如果在运行```eslint```的目录中不存在配置文件，eslint会尝试在home目录（```~/```）,寻找eslint 的配置文件。
+ 配置项目
    - env 代码预计要运行的环境,不同的运行环境会预定义不同的全局变量
    - globals 其他需要自定义的全局变量
    - rules 规则
    - parserOptions 指定需要支持的 ecmascript的版本,默认是es5.注意这只是设置支持相应ecma语言的语法，并不会自动设置不同语言版本中的全局变量,语言内的全局变量需要在env中设置,包含如下子项
        * ecmaVersion: 5,6,7 ...
        * sourceType: 'script' 'module'
        * ecmaFeatures: 
            + globalReturn
            + impliedStrict
            + jsx
