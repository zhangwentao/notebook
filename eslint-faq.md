# vscode eslint 配置
1. Q: 项目中的 `.ts` 文件不被eslint检查
   步骤1：需要配置 vscode ESlint 插件的 probe 属性，这个属性控制着项目路中的哪些类型文件会被检查。如需要检查 `.ts`文件就需要在这个配置中加入 `typescript`，注意这里配置的是编程语言对应的字符串名称而不是语言对应的后缀名，所以这里填写的不是`.ts`。具体语言对应的名称是什么，需要去ESLint插件主页去查看。

   步骤2：但是配置了这个属性后，发现`.ts`文件还是不被检查，尝试了修改.`eslintrc.json`中的parser属性：` "parser": "@typescript-eslint/parser"`

   经过以上2个步骤的配置，`.ts`文件成功的被ESlint进行检查了，并可以在vscode 的 problem 面板中可以看到这些文件中“问题”的提示。

   步骤2为什么起作用目前还不清楚。
   