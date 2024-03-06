# Basic Concepts

## user management

+ create user
    ```bash
    CREATE USER 'username'@'hostname' IDENTIFIED BY 'password';
    ```
+ privileges management
    ```bash
    GRANT [privilege1,previlige2,...] ON [database_name].* TO 'user_name'@'host_name';
    ```
    privilege types:
    - select
    - update
    - insert
    - delete
## database management

+ create a database

    ``` bash
    create database [database_name];
    ```
+ import data from dump file

    ``` bash
    mysql [database_name] < [dumpfile.sql];
    ```

## table management

# Basic Operations

1. login at local machine use CLI.

    ``` bash
    mysql -u [username] -p
    ```
2. list all databases that current login user privileged.(_after login mysql_)

    ``` bash
    show databases;
    ```

3. enter one database.

    ``` bash
    use [database_name];
    ```

4. list all tables in one database that was entered.

    ``` bash
    show tables;
    ```

5. list data row in one table;
    ``` bash
    select [*[column1[,column2]] from [table_name];
 
    ```

# local run 
To connect run:
```
    mysql -uroot
```
