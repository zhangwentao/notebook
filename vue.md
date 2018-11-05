# 特性
+ 数据绑定
    + dom与数据绑定: 以模板占位符的形式在dom结构代码中将界面与数据进行绑定
    + dom与数据的绑定是响应式的: dom会根据数据的变化自动更新
    + 可以将数据绑定到dom的以下方面：
        - dom 内容
        - dom 属性
        - dom 结构
    + 功能和优点:
        - 将程序开发者从 “对dom的操作中” 解放出来。对dom操作一般情况下都由vue自动操作,对dom的操作是指，通过dom API或jQuery对dom进行的操作。
+ 组件
    + 组件是实质上就是拥有若干预制选项的Vue实例
+ Vue实例
    + ```var vm = new Vue(OptionsObject);```
    + 数据对象 - data 选项
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
    + 插值
    + js表达式作为插值的值 (使用 new Function方式实现，在执行时，将Math、Date等白名单内的对象作为参数传入)

         
    


