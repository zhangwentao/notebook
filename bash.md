bash 常用命令
============

1. 查看端口占用

    ```bash
    lsof -i :portnumber
    ```
2. 实时查看一些日志（如ngxin log)

    ```bash
    tail -f log_file_path
    ```
3. macOS 清除DNS缓存

    ```bash
    sudo dscacheutil -flushcache; sudo killall -HUP mDNSResponder
    ```
