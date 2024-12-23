# Java 23 Spring Boot PostgreSQl Liquibase Project

This project is built using **Java 23**, **Spring Boot**, **Swagger**, **Liquibase**, and **PostgreSQL**. It demonstrates how to set up a PostgreSQL database using Docker Compose and how to generate the database schema from JPA entities.

## Prerequisites

Before running the application, make sure you have the following installed on your machine:

- [Java 23](https://adoptopenjdk.net/) or a compatible version of JDK.
- [Docker](https://www.docker.com/) installed and running.
- [Maven](https://maven.apache.org/) (optional if you are using `./mvnw`).


## Project Structure
The project is organized into the following directories:
 - postgres
 - Project
Inside the postgres directory is docker-compose
Inside the Project directory is Springboot Project

## Running the Postgres Database with Docker

To start the Postgres database, follow these steps:

1. Navigate to the `postgres` directory:

    ```bash
    cd postgres
    ```

2. Run the Docker Compose command to start the Postgres container:

    ```bash
    docker-compose up
    ```

This will set up and run the Postgres locally, which the Spring Boot application will connect to.

## Generating changelog to create database 
After the Postgres database is running, you can screate the database:
1. Navigate to the root directory of the Spring Boot project.
2. Run the application using Maven:
    ```bash
    mvn clean install -DskipTests -U
    ```
3. Then run this command to generate the changelogs
    ```bash
    mvn liquibase:diff
    ```
4. Inside the directory Project/src/main/resources/db/changelog  a new yml file would be created
5. Open file db.changelog-master.yaml and include the name of the new file generated by liquibase
6. Finally you can run the command to create the database 
    ```bash
    mvn liquibase:update
    ```
   


## Running the Application

After creating the database, you can start the Spring Boot application:

1. Navigate to the root directory of the Spring Boot project.

2. Run the application using Maven:

    ```bash
    ./mvnw spring-boot:run
    ```

   Alternatively, if Maven is installed globally, you can use:

    ```bash
    mvn spring-boot:run
    ```

The application should now be running locally. You can access it at `http://localhost:8080/swagger-ui/index.html#/`.
