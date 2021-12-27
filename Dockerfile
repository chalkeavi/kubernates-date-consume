FROM openjdk:8-jdk-alpine
VOLUME /app
EXPOSE 8200
ADD target/*.jar app.jar
ENTRYPOINT [ "sh","-c","java -jar /app.jar" ]
