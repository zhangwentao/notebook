vue-router
==========

# keywords
+ route -> view mapping
+ build Single Page Application

# 理解
+ route 即 【路径】
+ vue-router 的功能就是，将特定的路径或路径规则，对应到程序的特定view

思考
====
前端路由(router) 与 之前的使用ajax技术在前端进行界面转换的方式(old) 的比较

old的方式，通常触发ajax请求伴随之后的界面切换，都是通过与页面元素的交互发生的。界面切换后，页面url不发生改变，界面切换后的状态，无法通过访问特定url访问到。界面切换后，也无法通过浏览器的后退按钮，返回上个界面。这种操作没有修改window的history列表。优点，只需要通过一个ajax请求，只进行与后端进行很少的数据交互，就可以模拟出页面切换的效果。相应快速。

