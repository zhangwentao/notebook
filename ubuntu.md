# config

## nginx
+ where: /etc/nginx

## mysql
### install

``` bash
sudo apt-get update
sudo apt-get upgrade
```

``` bash
sudo apt-get install mysql-server
```

### login
``` bash
sudo mysql
```

### status check
``` bash
sudo systemctl status mysql

```

### create new user 
``` bash
create user 'username'@'host' identified by 'password';
```
and then apply privileges by run below code in mysql;
``` bash
flush privileges;
```
