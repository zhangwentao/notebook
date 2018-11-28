# 特性
+ 数据绑定
    + dom与数据绑定: 以模板占位符的形式在dom结构代码中将界面与数据进行绑定
    + dom与数据的绑定是响应式的: dom会根据数据的变化自动更新
    + 可以将数据绑定到dom的以下方面：
        - dom 内容
        - dom 属性
        - dom 结构
    + 功能和优点:
        - 将程序开发者从 “对dom的操作中” 解放出来。对dom操作一般情况下都由vue自动操作.如果不使用vue这样的框架，通常开发人员会通过dom API或jQuery对dom进行的操作。
+ 组件
    + 组件是实质上就是拥有若干预制选项的Vue实例
+ Vue实例
    + ```javascript
        var vm = new Vue(OptionsObject);
      ```
    + 数据对象 - ```OptionObject``` 中的 ```data``` 选项
    + 生命周期 - 生命周期钩子（回调函数） 
        - beforeCreate
        - created
        - beforeMount
        - mounted
        - beforeUpdate
        - updated
        - beforeDestroy
        - destroyed
        - ![lifecycle](https://vuejs.org/images/lifecycle.png)
+ 模板语法 
    + [插值](https://vuejs.org/v2/guide/syntax.html#Text)
        - **插值** 可以使用 **js表达式** 
        - 表达式中可以使用白名单中的一些全局变量，如 Math，Data._(注：这是使用 new Function方式实现，在执行时，将Math、Date等白名单内的对象作为参数传入)_
        - 插值的类型
            + html 标签内容-文本  
              ```html
              <div>{{text}}<div>
              ```
            + html 标签内容-html代码
              ```html
              <div v-html="fieldInData"></div>
              ```
            + html 标签属性
              ```html
              <div v-bind:attributename="fieldInData"></div>
              ```
              简写
              ```html
              <div :attributename="fieldInData"></div>
              ```
    + [指令](https://vuejs.org/v2/guide/syntax.html#Directives)
        - vue的指令是一类由```v-```为前缀的html标签属性
            + **与html属性类似，它之后可以跟随一个使用等号连接的值,也可以没有而是只有一个属性名**
        - 指令参数
            + 某些指令可以跟随一个参数，使用```:```与作为前缀，如：
                ```html
                <div v-bind:id="filedInData"></div>
                <div v-on:click="handleClicked"></div>
                ```
                | 指令名|指令参数 |等号|引号|    值      |引号|
                |------|:------:|:-:|---:|-----------|:--|        
                |v-bind| :id    | = |   "|filedInData|"  |
        - 指令修饰符
            + 以```.```作为前缀，表示指令的一些特殊功能 
              ```html
              <div v-on:click.prevent="handleClicked"></div>
              ```
        - 简写
            | 指令名 | 简写|
            |-------|----|
            |v-bind | :  |
            |v-on   | @  |

            ```html
            <div v-bind:id="filedInData"></div>
            <div :id="filedInData"></div>
            ```
            ```html
            <div v-on:click="handleClicked"></div>
            <div @click="handleClicked"></div>
            ```
         
    


