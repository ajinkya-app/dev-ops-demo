FROM openjdk:17
EXPOSE 8080
ADD /target/firstdocker.war firstdocker-image.war
ENTRYPOINT 	[ "java" ,"-jar" ,"firstdocker-image.war" ]
