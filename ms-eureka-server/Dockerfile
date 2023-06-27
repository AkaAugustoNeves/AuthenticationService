FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/ms-eureka-server.jar /app/ms-eureka-server.jar

EXPOSE 8761

CMD ["java", "-jar", "ms-eureka-server.jar"]