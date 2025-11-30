大模型API
=========

## 顶层结构字段

### model 

模型版本(模型能力)

```json
"model": "gpt-4.1-mini"
```
作用：指定调用的大模型及具体版本，不同模型及同模型的不同版本决定了以下方面：
+ 上下文长度（context size）
+ 推理能力(训练数据不同)
+ 是否支持多模态
+ 是否支持工具调用、思维链
+ 计费方式


### message

```json
"messages": [
  { "role": "user", "content": "你好" }
]
```

#### role
作用：用于提供给大模型区分意图理解上下文，通常枚举值有：

+ system：规则、角色、能力约束
+ user：用户指令
+ assistant：模型回复
+ tool：工具执行结果

#### content

```json
"content": [
  { "type": "text", "text": "你好" }
]
```
注意这个字段数据类型是数组，考虑到扩展性这样设计，目前主要用于支持多模态：

+ text
+ image
+ audio
+ tool_call

#### stream
流式输出开关
本质原因，大模型生成内容是逐 token 生成的，所以如果需要即时得到相应降低用户等待时间，需要开启。

## 输出控制字段

### max_tokens
大模型输出内容长度限制。

### temperature
大模型输出内容的创意性，数据类型数字
值越小：确定性越强，适合生成代码的场景
值越大：更加发散和丰富，适合头脑风暴创意的场景

### 工具调用字段

#### tools
定义模型可调用的函数,告诉大模型可以调用哪些函数
常用的数据结构如下：
```json
{
  "type": "function",
  "function": {
    "name": "search",
    "parameters": { ...schema... }
  }
}

```
#### tool_calls
模型输出的指令
大模型调用调用方提供的工具的指令,即大模型说我要调用哪个工具。
```json
"tool_calls": [
  {
    "id": "abc",
    "function": {
      "name": "search",
      "arguments": "{}"
    }
  }
]
```

#### usage
当前大模型调用统计信息
```json
"usage": {
  "prompt_tokens": 100,
  "completion_tokens": 50,
  "total_tokens": 150
}
```
















+ stream
