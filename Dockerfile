FROM openjdk:8
ADD target/demoproject-1.jar demoproject-1.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","demoproject-1.jar"]