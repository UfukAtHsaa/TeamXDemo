FROM openjdk:17-alpine as build
RUN apk add --no-cache maven
WORKDIR /java
COPY . /java
RUN mvn package -Dmaven.test.skip=true
EXPOSE 8080:8080

ENTRYPOINT ["java","-jar","/java/target/TeamX-0.0.1-SNAPSHOT.jar"]