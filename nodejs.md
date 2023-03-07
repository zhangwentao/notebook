## keywords
* asynchronous 异步
* event-driven 事件驱动
* JavaScript runtime js运行时

## simple tutorial

### Simple http server creation

Two method to create http server,below:

1. use http.createServer() function
    ``` javascript
    const http = require('http');
    const server = http.createServer((req,res) => {
        console.log(req.headers);
        console.log(req.url);
        res.end('success');
    });
    server.listen(3000);
    ```

2. use http.Server constructor 
    ``` javascript
    const http = require('http');
    const server = new http.Server();
    server.on('request',(req,res) => {
        console.log(req.headers);
        console.log(req.url);
        res.end('success');
    });
    server.listen(3000);
    ```


