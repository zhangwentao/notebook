# target
sharing statefull logic

# key concept

+ Hooks are special functions that are only available while React is rendering. They let you “hook into” different React features.

# pitfall

+ Hooks—functions starting with use
+ can only be called at the top level of your components or your own Hooks. 
+ You can’t call Hooks inside conditions, loops, or other nested functions.
+ Hooks are functions, but it’s helpful to think of them as unconditional declarations about your component’s needs.
+ You “use” React features at the top of your component similar to how you “import” modules at the top of your file
+ react will wait all event hanlder codeing run complete ,then run next re-render

# useEffect

+ By default, your Effect will run after every commit
+ Effects run at the end of a commit after the screen updates.
+ Unlike events, Effects are caused by rendering itself rather than a particular interaction.
+ Effects let you synchronize a component with some external system (third-party API, network, etc).
+ By default, Effects run after every render (including the initial one).
+ React will skip the Effect if all of its dependencies have the same values as during the last render.
+ You can’t “choose” your dependencies. They are determined by the code inside the Effect.
+ Empty dependency array ([]) corresponds to the component “mounting”, i.e. being added to the screen.
+ In Strict Mode, React mounts components twice (in development only!) to stress-test your Effects.
+ If your Effect breaks because of remounting, you need to implement a cleanup function.
+ React will call your cleanup function before the Effect runs next time, and during the unmount.
