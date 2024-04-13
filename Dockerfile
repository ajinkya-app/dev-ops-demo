FROM openjdk:17
EXPOSE 8080
ADD /target/firstdocker.jar firstdocker.war
ENTRYPOINT 	[ "java" ,"-jar" ,"firstdocker.war" ]