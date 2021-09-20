# Limit-service-Spring-cloud-config-server
This project consists of limits-service and spring cloud server with Github repo

We have two projects:

1: Limits-service
It has controller class to class Rest endpoint. 

We have created one endpoint: http://localhost:8081/limits
Using this endpoint we are getting values from application.properties file.

2: Spring-cloud-config-server
We have created a config server for limits-service project.

http://localhost:8888/limits-service/default

I have put the limits-service.properties file in Github repo and calling the property from there which is getting reflected in limits-service.

Follow the steps from here: https://amirahmad786.blogspot.com/2021/09/spring-cloud-config-server-with-github.html
