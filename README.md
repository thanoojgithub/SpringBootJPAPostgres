# SpringBootJPAPostgres
A sample Spring Boot JPA with Postgres


https://hub.docker.com/r/thanoojdocker/springbootpostgres


Build on:

- OpenJDK 21
- Postgres latest image
- Spring Boot 3.3.4
- Gradle 8.10.1

Created a Docker image, using below steps:

- git clone https://github.com/thanoojgithub/SpringBootJPAPostgres.git⁠
- .\gradlew clean build
- docker build -t thanoojdocker/springbootpostgres .
- docker login -u "thanoojdocker" -p "password" docker.io
- docker push thanoojdocker/springbootpostgres:latest
