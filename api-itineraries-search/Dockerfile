FROM openjdk:21-slim

COPY src/conf application/

COPY target/api-itineraries-search-*.jar application/api-itineraries-search.jar

CMD java -jar application/api-itineraries-search.jar --spring.config.location=application/docker/application.yml

EXPOSE 7070 
