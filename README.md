# SpringBoot-Docker
Demo project for Spring-Boot and docker

You need to have docker installed in your computer to run this project. 
Run ```./run.sh``` to start the project.

## What is AOP?
Aspect Oriented Programming addresses the problem of cross-cutting concerns which would be any kind of code that is repeated in your application and cannot normally be completely refactored into its own module, like logging, error handling, and transaction. 

### AOP Terminology
* Aspect: The class that contains advice and pointcut. (ex. ControllerAspect and ServiceAspect are the aspects.)
* Pointcut: Defines which methods the advice is to be weaved with.(ex. logging in the ServiceAspect)
* Advice: The method to be run when program execution reaches the joint points in the pointcut. (ex. methods in the Aspect other than pointcut)

## What is Docker?
Docker makes your application run on a Docker engine which might or might not consist several images. A container image is a lightweight, stand-alone, executable package of a piece of software that includes everything needed to run it: code, runtime, system tools, system libraries, settings. One of the advanatage of the docker is that once its built, you can run it on any OS with docker.
