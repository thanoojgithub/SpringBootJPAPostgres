FROM openjdk:21
WORKDIR /app
CMD ["./gradlew", "clean", "bootJar"]
COPY build/libs/SpringBootWithPostgres-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "/app/app.jar"]