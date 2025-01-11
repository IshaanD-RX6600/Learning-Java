# My Java App

This project is a simple Java application that demonstrates the use of Maven for building and managing dependencies.

## Project Structure

```
my-java-app
├── src
│   ├── main
│   │   └── java
│   │       └── App.java
│   └── test
│       └── java
│           └── AppTest.java
├── pom.xml
└── README.md
```

## Requirements

- Java 11 or higher
- Maven 3.6 or higher

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

## Running the Application

After building the project, you can run the application using the following command:

```
java -cp target/my-java-app-1.0-SNAPSHOT.jar App
```

## Running Tests

To run the tests, use the following command:

```
mvn test
```

## License

This project is licensed under the MIT License.