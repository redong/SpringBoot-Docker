# tell docker to use openjdk as build-base
FROM openjdk:8-jdk-alpine
VOLUME /tmp
# use buildArgs we defined in the pom file.
ARG JAR_FILE

# add the jar file to the container as app.jar
ADD ${JAR_FILE} app.jar

# to execute the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container","-jar","/app.jar"]