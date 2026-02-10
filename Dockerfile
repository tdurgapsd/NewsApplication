FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

EXPOSE 8081

CMD java -Dserver.port=$PORT -jar target/newsApp-0.0.1-SNAPSHOT.jar
