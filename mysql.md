# Basic Concepts

+ user management
    + privileges management
+ database management
+ table management

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

6. 
