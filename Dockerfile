FROM openjdk:22-jdk
LABEL authors="Ashish"
ADD target/student-app.jar student-app.jar
ENTRYPOINT ["java", "-jar", "student-app.jar"]