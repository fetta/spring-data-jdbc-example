FROM java:8-jre
MAINTAINER Jan Siekierski <pan.siekierski@gmail.com>

ADD ./target/team-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/team-service.jar"]

EXPOSE 8080