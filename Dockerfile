FROM openjdk:8-jre

ADD build/libs/*.jar /tmp/app.jar

CMD java -jar /tmp/app.jar