# 🚚 Shipment Tracking API

This repository contains a Spring Boot backend for a shipment tracking application. The current implementation includes user authentication, JWT-based security, and shipment management APIs.

## ✅ Current Status

The project is currently buildable and runnable. The latest verification included:

- Maven test run: passed
- Spring Boot application startup: successful on port 8080

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.5.15
- Spring Security
- Spring Data JPA
- JWT Authentication
- MySQL
- Maven

## ✨ Implemented Features

- User registration and login
- Password hashing with BCrypt
- JWT token generation and validation
- Protected API endpoints with role-based access support
- Shipment CRUD endpoints

## Week 2 Features

- Shipment CRUD APIs
- Carrier Load Board
- Shipment Status Management
- DTO Validation
- Global Exception Handling
- MySQL Persistence
- REST API Testing using Postman

## week 3 and 4 Features

- Shipment Management
- REST APIs
- JWT Security
- Real-Time WebSocket Tracking
- Dashboard Statistics
- Pagination & Search
- Swagger API Documentation

## Technologies

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- WebSocket
- Maven
- Lombok

## API Documentation

Swagger UI:
http://localhost:8080/swagger-ui/index.html

## 📁 Project Structure

controller
AuthController.java
ShipmentController.java

service
AuthService.java
AuthServiceImpl.java
ShipmentService.java
ShipmentServiceImpl.java

repository
ShipmentRepository.java
UserRepository.java

entity
Shipment.java
User.java

security
JwtAuthenticationFilter.java
JwtService.java
CustomUserDetailsService.java

config
PasswordConfig.java
SecurityConfiguration.java

dto
LoginRequest.java
RegisterRequest.java
ShipmentRequest.java
ShipmentResponse.java
AuthResponse.java

exception
GlobalExceptionHandler.java

resources
application.properties

## ⚙️ Setup Instructions

1. Make sure Java 17 and Maven are installed.
2. Create a MySQL database named `shipment_tracking`.
3. Update your database credentials in `src/main/resources/application.properties` if needed.
4. Run the application:

```bash
./mvnw spring-boot:run
```

The API will be available at:

```text
http://localhost:8080
```

## 🔐 API Endpoints

### Authentication

- `POST /api/auth/register`
- `POST /api/auth/login`

### Shipments

- `GET /api/shipments`
- `POST /api/shipments`
- `GET /api/shipments/{id}`
- `PUT /api/shipments/{id}`
- `DELETE /api/shipments/{id}`

## 🧪 Verification

Run the following command to verify the project:

```bash
./mvnw test
```

## 👩‍💻 Author

Sinduluri Tejasree

Java | Spring Boot | MySQL | React | Full Stack Development
