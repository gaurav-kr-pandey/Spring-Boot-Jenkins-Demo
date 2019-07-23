FROM openjdk:8
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
CMD ["java","-jar","target/docker-springboot-mysql-demo.jar"]
