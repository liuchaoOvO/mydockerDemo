FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE
ADD target/${JAR_FILE} /lctest-app.jar
ENTRYPOINT ["java", "-jar","/lctest-app.jar"]