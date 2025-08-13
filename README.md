# IDS API – Technical Test Submission

A simple backend API built with Java and Jetty to serve transaction data over HTTP.

## ✅ Requirements Fulfilled

- **Language**: Java 17 (OOP-based)
- **Protocol**: HTTP (via embedded Jetty)
- **Method**: GET
- **Response Format**: JSON (matches `viewData.json`)
- **Data Source**: MySQL database
- **Endpoint**: `/view-data`

## 🔧 Tech Stack

- Java 17
- Jetty 11 (embedded)
- MySQL 8
- Gson (JSON serialization)
- Maven (build + dependency management)

## 📦 How to Run

1. Ensure MySQL is running and accessible.
2. Initialize the database by running the SQL setup files:
    ```bash
    mysql -u root -p ids_db < filename.sql
3. Update `application.properties` with your DB credentials.
4. Build the project:
   ```bash
   mvn clean package
5. Run the API:
    ```bash
    java -jar target/ids-api-1.0.0-jar-with-dependencies.jar
6. Access the endpoint:
    ```bash
    http://localhost:8080/view-data
