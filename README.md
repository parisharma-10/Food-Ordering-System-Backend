# Food-Ordering-System-Backend

This is the backend implementation of an **Online Food Ordering System**, built using **Spring Boot**, **MySQL**, and **Hibernate JPA**.

Features
- List restaurants via REST API
- Add new restaurant entries
- Connected to MySQL database
- JSON API responses
- Built using Java + Spring Boot

Tech Stack used
- Java (JDK 17)
- Spring Boot 3.4.11
- MySQL
- Hibernate JPA
- Maven

-outputs
Configure application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/food_ordering
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

-Run the project:
mvn spring-boot:run

-Access the API:(locally)
http://localhost:8080/api/restaurants
