# tell docker to use openjdk as build-base
FROM openjdk:8-jdk-alpine

# use buildArgs we defined in the pom file.
ARG JAR_FILE

# add the jar file to the container as app.jar
ADD ${JAR_FILE} app.jar

# to execute the jar file
ENTRYPOINT ["java","-jar","/app.jar"]