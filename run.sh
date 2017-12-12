#!/bin/bash

docker run -d --name demo-mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=springbootdemo mysql

./mvnw install dockerfile:build

docker run -d --name spring-boot-docker \
    --link demo-mysql:mysql \
    -p 8080:8080 \
    -e DATABASE_HOST=demo-mysql \
    -e DATABASE_PORT=3306 \
    -e DATABASE_NAME=springbootdemo \
    -e MYSQL_ROOT_PASSWORD=root \
    spring-boot-docker