Spring Boot Interview Task Description
Task Overview: You will be working on a Spring Boot project that is pre-configured with the necessary base dependencies. Your objective is to add functionality according to the task details outlined below.

Instructions:
Fork the Repository: Start by forking the existing project repository provided.
Project Structure: Follow the existing project structure, adhering to best practices.
Dependencies: The base dependencies are already preinstalled. Feel free to add new dependencies if required.
Database: Use PostgreSQL as the database for this task.
Entity Creation:
Use Hibernate to create database entities and tables based on the specifications below.
Requirements:
Customer Class: Create a Customer entity with the following fields:

firstName: String (required)
lastName: String (required)
phoneNumber: String (required)
email: String (required, must be a valid format)
age: int
address: String (required)
isActive: boolean (default value should be false)
Service Layer: Implement a service layer that handles business logic for managing customers.

Database Layer: Set up the database layer using Hibernate to manage the persistence of Customer entities.

Validation:

Apply validation to the Customer entity:
All required fields must be validated.
Ensure the email field contains a valid email format.
DTO:

Use a Data Transfer Object (DTO) to represent the Customer class for REST API requests and responses.
Mapping:

Use a mapper to map the Customer entity to a CustomerDto and vice versa. The project has a mapping package installed, but you may use another if preferred.
RESTful API:

Implement a RESTful API structure with endpoints to create, update, retrieve, and delete customers.
Ensure that the controller responses return the appropriate HTTP status codes (e.g., 201 Created for successful creation).
Error Handling:

Add appropriate error handling and custom exceptions as needed.
Error responses should return an appropriate HTTP status code and a clear error message.
Global Error Filter:

(Optional) Implement a global error filter to handle exceptions across the entire application.
Unit Tests:

(Optional) Add unit tests for the service and controller layers if you can.
Task Completion:
Once the task is complete, create a pull request targeting the develop branch. Be sure to create a feature branch off of develop for your work.
Good luck!
