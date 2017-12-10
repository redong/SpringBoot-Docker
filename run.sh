#!/bin/bash

./mvnw install dockerfile:build
docker run -p 8080:8080 -t spring-boot-docker