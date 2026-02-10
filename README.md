# 🚀 Cucumber Selenium Automation Framework

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Selenium](https://img.shields.io/badge/Selenium-4.x-green?style=for-the-badge&logo=selenium)
![Cucumber](https://img.shields.io/badge/Cucumber-7.x-23D18B?style=for-the-badge&logo=cucumber)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven)
![GitHub Actions](https://img.shields.io/badge/CI%2FCD-GitHub%20Actions-2088FF?style=for-the-badge&logo=github-actions)

## 📝 Overview
This project is a robust **BDD (Behavior Driven Development)** automation framework designed to test the To-Do Application. It is built from scratch implementing industry standard design patterns and integrated with a **CI/CD pipeline** using GitHub Actions.

## 🏗️ Architecture & Design Patterns
* **Page Object Model (POM):** To enhance code maintainability and reduce code duplication.
* **Singleton Pattern:** Implemented in `EnvUtil` class to ensure a single instance of configuration properties is loaded (Thread-Safe).
* **Factory Pattern:** For efficient WebDriver initialization.
* **Dependency Injection (DI):** Using PicoContainer to share state between steps.

## 🛠️ Tech Stack
* **Language:** Java 21
* **Automation Tool:** Selenium WebDriver
* **BDD Framework:** Cucumber (Gherkin Syntax)
* **Build Tool:** Maven
* **Assertions:** JUnit / Hamcrest
* **CI/CD:** GitHub Actions (Running on Windows-latest runner)

## 📂 Project Structure
```text
src
├── main
│   └── java
│       └── com.qacart.todo
│           ├── pages       # Page Objects (Locators & Methods)
│           └── utils       # Utilities (ConfigUtil, EnvUtil)
└── test
    ├── java
    │   └── com.qacart.todo
    │       ├── runners     # Test Runners
    │       └── steps       # Step Definitions
    └── resources
        ├── features        # .feature files
        └── properties      # Staging.properties, Production.properties
