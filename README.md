# Playwright-quarkus-quickstart

This README file provides an overview and instructions for the project created using Quarkus, Playwright, JUnit 5, and Allure Report. The project aims to automate end-to-end tests for a web application using Playwright for browser automation, JUnit 5 for test organization, and Allure Report for test reporting and visualization.

## Project Overview
The project is a Java-based automation testing framework that utilizes Quarkus as the underlying framework, Playwright for browser automation, JUnit 5 for test organization, and Allure Report for generating test reports.


## Prerequisites

- Java 11
- Maven 3.6.2+
- Allure command line tool
- Node.js (For Playwright)

## Getting Started

Clone the repository using the following command:

```bash
git clone <https://github.com/veerpatil/playwright-quarkus-quickstart.git>
```

Navigate to the project directory:

```bash
cd <playwright-quarkus-quickstart>
```

## Build & Run Project

To build the project using Maven, run the following command:

```bash
mvn clean package
```


## Running Tests

Our tests are based on JUnit5 and Playwright. To run them, use:

```bash
mvn test
```

The test results will be stored in the `target/surefire-reports` directory.

## Allure Report

We use Allure for reporting. To generate and open Allure report after tests, you need to perform:

```bash
allure serve target/allure-results
```

This command will generate a report and immediately open it in your default web browser.

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
