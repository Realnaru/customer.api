# Spring Boot Interview Task

## Overview
In this task, you will work on a Spring Boot project that is pre-configured with the necessary base dependencies. Your objective is to add functionality according to the requirements below.

## Instructions

1. **Fork the Repository**: Start by forking this project repository to your own GitHub account.
2. **Project Structure**: Follow the existing project structure, adhering to best practices.
3. **Dependencies**: The base dependencies are already pre-installed. Feel free to add any additional dependencies if required.
4. **Database**: Use PostgreSQL as the database for this task.
5. **Entity Creation**: Use Hibernate to create the database entities and tables based on the `Customer` class structure outlined below.

## Task Requirements

### 1. Customer Class

Create a `Customer` entity with the following fields:

- `firstName`: `String` (required)
- `lastName`: `String` (required)
- `phoneNumber`: `String` (required)
- `email`: `String` (required, must be a valid format)
- `age`: `int`
- `address`: `String` (required)
- `isActive`: `boolean` (default value should be `false`)

### 2. Service Layer

Implement a service layer that handles the business logic for managing customers.

### 3. Database Layer

Set up the database layer using Hibernate to manage the persistence of `Customer` entities.

### 4. Validation

- Apply validation to the `Customer` entity:
    - All required fields must be validated.
    - Ensure that the `email` field contains a valid email format.

### 5. DTO

Use a Data Transfer Object (DTO) to represent the `Customer` class in REST API requests and responses.

### 6. Mapping

Use a mapper to map the `Customer` entity to a `CustomerDto` and vice versa. The project has a mapping package installed, but you may use another if preferred.

### 7. RESTful API

Implement a RESTful API structure with endpoints to create, update, retrieve, and delete customers. Ensure the controller responses return the appropriate HTTP status codes (e.g., `201 Created` for successful creation).

### 8. Error Handling

Add appropriate error handling and custom exceptions as needed. Error responses should return the proper HTTP status code and a clear error message.

### 9. Global Error Filter (Optional)

Consider implementing a global error filter to handle exceptions across the entire application.

### 10. Unit Tests (Optional)

If possible, add unit tests for the service and controller layers.

## Task Submission

Once the task is complete:

1. Create a feature branch from the `develop` branch.
2. Push your changes to your feature branch.
3. Open a pull request targeting the `develop` branch.

---

Good luck with the task!
