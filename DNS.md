# DNS 

_Domain Name System_ for short is DNS.

use to map human-friendly domain name to service on internet.

## Domain Name Space

is a tree structure.

Each _node_ or _leaf_ has a _label_ and zero or more _Resource Record(RR)_  

# CONCLUTION
_DNS_ 即 _Domain Name System_ 即 _域名系统_.
## 功能
简单来说这个系统的目的是提供通过*域名*查询到域名*对应的ip地址*的能力。
## 域名语法结构
A domain name consists of some label and delimiter. For example, `www.github.com`, as the below diagram. `com` is top level domain(TLD), `github` is second level domain(SLD),`www` is sub level domain(SLD). `www`,`github`,`com` are labels, the dot between them in domain name,are delimiter.
| sub domain name   |  second domain name | top domain name|
|-------------------|---------------------|----------------|
|                www|               github|             com|
## 实现
*域名系统*由很多*域名服务器*组成。并以由上至下的分层结构组织。

### Authorative Name Server
*域名系统*把分配域名及映射这些域名到互联网资源的权力代理给各域的*权威域名服务器*。这些服务器管理员可以把被授权的域名空间的子域代理给其他域名服务器。这个机制提供的分布式、容错能力避免了单一庞大的中央数据库。一个*域名服务器*存储了对应域的DNS记录，并使用这些记录对域名检索请求做出回应。

#### DNS 记录格式
主要包括 SOA、A、AAAA、SMTP、NS、PTR、CNAME，这些记录被存储在一个结构化的文本文件中，这个文件也被称为Zone file。
##### SOA(Start Of Authority)
包含对应域的管理信息，



