Selenium + Cucumber + Java + Maven BDD Automation Framework

Project Overview:
This repository contains a BDD (Behavior Driven Development) Automation Framework built using Selenium WebDriver, Cucumber, Java, and Maven, following the Page Object Model (POM) design pattern.

The framework is designed to deliver:

* Readable test scenarios (Gherkin syntax)
* Maintainable and scalable automation code
* Reusable page objects
* CI/CD-ready execution

Application Under Test (AUT): https://www.saucedemo.com

The following tools are defined and used in the project (aligned with the CI/CD YAML configuration):
Tool -	Purpose
Java -	Automation programming language
Selenium WebDriver - Browser automation
Cucumber - BDD framework (Gherkin syntax)
Maven - Build & dependency management
JUnit - Test execution & reporting
Page Object Model	- Clean architecture design

Prerequisites & Environment Setup:

Install JDK using SDKMAN
* SDKMAN: https://sdkman.io/
* Amazon Corretto JDK: https://sdkman.io/jdks/amzn/

Download and install Maven:
https://maven.apache.org/install.html


Create a Maven Project in IntelliJ IDEA.
Add required dependencies to pom.xml:
* Selenium Java
* Cucumber Java
* Cucumber JUnit

Cucumber JUnit Dependency:
https://mvnrepository.com/artifact/io.cucumber/cucumber-junit/7.16.1

Reload Maven after adding dependencies.

Install the following plugins:
* Cucumber
* Selenium

Project Structure:
selenium-cucumber-bdd-framework
│
├── src
│ └── test
│ ├── java
│ │ ├── features
│ │ ├── stepDefinition
│ │ ├── pages
│ │ ├── runner
│ │ └── utility
│ │
│ └── resources
│
├── pom.xml
└── README.md
CI/CD Integration (YAML Execution Flow)
This framework is designed to run seamlessly in CI/CD pipelines such as Jenkins or GitHub Actions using a YAML configuration.

1. Pipeline Trigger
    * Pipeline is triggered on events like:
        * Code push
        * Pull request
        * Manual trigger
2. Environment Setup
    * CI runner installs:
        * Java (JDK)
        * Maven
        * Project dependencies (via pom.xml)
3. Maven Test Execution
The YAML file executes the following command:
   mvn test
   This command:
* Compiles the project
* Downloads dependencies
* Triggers the Cucumber TestRunner
* Executes feature files based on:
    * Tags
    * Glue configuration
    * Plugin setup
4.Cucumber Execution Flow in CI
      mvn test
      ↓
      TestRunner (JUnit)
      ↓
      Cucumber Feature Files
      ↓
      Step Definitions
      ↓
      Page Objects
      ↓
      Selenium WebDriver 
5.Report Generation
After execution, Cucumber generates reports automatically:
    * HTML Report → target/cucumber-html-report/index.html
    * JSON Report → target/cucumber.json
    * JUnit XML → target/cucumber.xml
