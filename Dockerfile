FROM openjdk:8-jdk-alpine
COPY target/fastdelivery-geocode-2.0.0.jar fastdelivery-geocode.jar
ENTRYPOINT ["java","-jar","/fastdelivery-geocode.jar"]