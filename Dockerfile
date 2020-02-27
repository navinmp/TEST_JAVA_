FROM java:8
VOLUME /tmp
ADD target/spring-security-oauth2-aot-0.0.1-SNAPSHOT.war app.jar
EXPOSE 8080
RUN sh -c 'touch /app.jar'
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/app.jar"]


