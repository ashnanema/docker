FROM openjdk:11
EXPOSE 8088
COPY target/demo.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]