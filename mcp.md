MCP
===

## 3 parts

### Host
### Client
### Server

## 2 layers

### Data Layer
Defines the JSON-RPC based protocol for client-server communication, including lifecycle management, and core primitives, such as tools, resources, prompts and notifications.

#### lifecycle management
+ connection initialization between Client and server
+ capability negotiation
+ connection termination between Client and server

#### server features
enable server to provide tool,data,prompt template

#### client features
enable server to ask client to sample form host LLM.

#### Utility features
supports other capabilities like notification for real-time updates and progress tracking for long-running operations.

### Transport Layer
Defines the communication mechanisms and channels that enable data exchange between clients and servers, including transport-specific connection establishment, message framing, and authorization.

#### stdio transport

#### Streamable HTTP transport




## related terms

### RPC
a programming pattern or protocal that let calling remote  procedure be same as calling local procedure(function).
this pattern hidden the client server connecting process and other operation detail, make it easy.

### JSON-RPC
just like a business logic data structure in daily programming, it define RPC Requst's JSON structure, and Response Structure, also Error.
only this is a common data structure for RPC, so it is a protocal. and this protocol can be extends.

## refs
[JSON-RPC](https://www.jsonrpc.org/specification)


