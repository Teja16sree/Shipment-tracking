# 🚚 Real-Time Shipment Tracking Portal & Logistics Marketplace

A full-stack logistics platform that enables shippers to post freight loads, carriers to bid on shipments, and customers to track deliveries in real time.

This project is being developed as a **4-week engineering project** following an incremental development approach with clear Git commits after every milestone.

---

## 📌 Project Overview

The logistics industry often faces challenges such as:

- Manual freight booking
- Lack of transparency between shippers and carriers
- No real-time shipment visibility for customers

This application aims to solve these problems by providing:

- 🔐 Secure user authentication
- 📦 Shipment marketplace
- 💰 Carrier bidding system
- 📍 Real-time shipment tracking using WebSockets
- 🗺️ Live map visualization
- 👥 Role-based dashboards

---

# 🛠️ Technology Stack

### Backend

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- JWT Authentication
- Maven

### Database

- MySQL

### Frontend (Upcoming)

- React
- Tailwind CSS
- Axios
- Leaflet Maps

### Real-Time Communication (Upcoming)

- Spring WebSocket
- STOMP

---

# 📁 Project Structure

```
shipmenttracking/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/tejasree/shipmenttracking/
│   │   │       ├── config/
│   │   │       ├── controller/
│   │   │       ├── dto/
│   │   │       ├── entity/
│   │   │       ├── enums/
│   │   │       ├── exception/
│   │   │       ├── repository/
│   │   │       ├── security/
│   │   │       └── service/
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

---

# 👥 User Roles

### 🚛 Shipper

- Register/Login
- Create shipment
- View carrier bids
- Award shipment
- Track shipment

### 🚚 Carrier

- Register/Login
- Browse available shipments
- Place bids
- Update shipment location

### 📦 Customer

- Track shipment using Tracking ID
- View live shipment location

---

# 🗓️ Development Roadmap

## ✅ Week 1 – Authentication & Project Setup

- [x] Spring Boot project initialization
- [x] MySQL database configuration
- [ ] User Entity
- [ ] Role Management
- [ ] Registration API
- [ ] JWT Authentication
- [ ] Role-Based Authorization

---

## ⏳ Week 2 – Logistics Marketplace

- Shipment CRUD
- Carrier Bidding
- Award Shipment Logic
- Shipment Status Management

---

## ⏳ Week 3 – Real-Time Tracking

- WebSocket Configuration
- GPS Location Updates
- STOMP Messaging
- Live Shipment Tracking

---

## ⏳ Week 4 – Frontend Dashboard

- React Dashboard
- Interactive Maps
- WebSocket Integration
- Deployment
- Documentation

---

# 🚀 Current Progress

### Completed

- Spring Boot project created
- Maven configured
- MySQL database connected
- Project folder structure created

### In Progress

- User Authentication Module

---

# ⚙️ Getting Started

## Clone the Repository

```bash
git clone <your-repository-url>
```

## Navigate to the Project

```bash
cd shipmenttracking
```

## Configure Database

Create a MySQL database named:

```sql
CREATE DATABASE shipment_tracking;
```

Update `application.properties` with your MySQL credentials.

## Run the Application

```bash
mvn spring-boot:run
```

The application will start on:

```
http://localhost:8080
```

---

# 📌 Git Commit Progress

| Commit | Description                                          | Status |
| ------ | ---------------------------------------------------- | ------ |
| 1      | Initialize Spring Boot logistics marketplace project | ✅     |
| 2      | Configure MySQL datasource and JPA                   | ✅     |
| 3      | Create user entity and role definitions              | ⏳     |
| 4      | Add repository layer                                 | ⏳     |
| 5      | Implement registration workflow                      | ⏳     |
| 6      | Implement JWT authentication                         | ⏳     |
| 7      | Enable role-based authorization                      | ⏳     |

---

# 📄 License

This project is developed for educational purposes as part of a software engineering internship and learning initiative.

---

## 👩‍💻 Author

**Sinduluri Tejasree**

Java | Spring Boot | MySQL | React | Full Stack Development
