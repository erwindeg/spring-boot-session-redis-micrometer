# Example Spring Boot application with Spring Session (Redis) and Micrometer.
The application is a REST application with one endpoint:
```http://localhost:8080/hello-world``` 
It uses spring security with form login (admin/password).

## Usage
Use maven to build the application:
```mvn clean install```

Start the application with docker-compose:
```docker-compose up --build```

This will start the following services:
* demo-app instance 1:
```http://localhost:8080/hello-world```
* demo-app instance 2:
```http://localhost:8081/hello-world```
* Redis
* Prometheus:
```http://localhost:9090```
* Grafana:
```http://localhost:3000```

The application instances will share their session data through Redis with help of Spring Session.
You can try this by navigating to instance 1, logging in and then navigating to instance 2. You will still be logged in.

## Micrometer
Micrometer is configured to publish data in a promotheus format on:
```http://localhost:8080/actuator/prometheus```

The prometheus server is configured to consume this data in the prometheus.yml.
You can use Grafana to visualize this data by adding a prometheus endpoint pointing to:
```http://promotheus:9090```