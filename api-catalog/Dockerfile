FROM openjdk:21-slim

COPY src/conf application/

COPY target/api-catalog-*.jar application/api-catalog.jar

CMD java -jar application/api-catalog.jar --spring.config.location=application/docker/application.yml

EXPOSE 6070 
