# 🚀 Cucumber Selenium BDD Framework

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Selenium](https://img.shields.io/badge/Selenium-4.x-green?style=for-the-badge&logo=selenium)
![Cucumber](https://img.shields.io/badge/Cucumber-7.x-23D18B?style=for-the-badge&logo=cucumber)
![Maven](https://img.shields.io/badge/Build-Maven-C71A36?style=for-the-badge&logo=apachemaven)
![GitHub Actions](https://img.shields.io/badge/CI%2FCD-GitHub%20Actions-2088FF?style=for-the-badge&logo=github-actions)

## 📝 Overview
This is a robust, scalable, and fully automated **BDD (Behavior Driven Development)** testing framework designed for the **ToDo Application**. The project is built from scratch using **Java 21**, **Selenium WebDriver**, and **Cucumber**, incorporating industry-standard design patterns to ensure maintainability and efficiency.

---

## 🏗️ Architecture & Design Patterns
* **Page Object Model (POM):** Separates page locators and actions.
* **Singleton Pattern:** Implemented in `EnvUtil` for config management.
* **Factory Pattern:** For WebDriver initialization.
* **Dependency Injection:** Using PicoContainer.

---

## 📂 Project Structure
```text
src
├── main
│   └── java
│       └── com.qacart.todo
│           ├── pages       # Page Objects
│           └── utils       # Utilities
└── test
    └── java
        └── com.qacart.todo
            ├── runners     # Test Runners
            └── steps       # Step Definitions
```

## 🚀 How to Run Locally

1. Prerequisites
Java JDK 21 installed.

Maven installed and configured.

Chrome or Edge browser installed.

2. Clone the Repository
git clone [https://github.com/arkan2320/cucumber-todo-project.git](https://github.com/arkan2320/cucumber-todo-project.git)
cd cucumber-todo-project


3. Run Tests
Run on Default (Chrome + Staging):
mvn clean test


## Run on Production Environment:

mvn clean test -Denv="production"


## ⚙️ CI/CD Pipeline (GitHub Actions)
The project includes a fully functional workflow defined in .github/workflows/maven.yml:

Trigger: Activates on every push to the master branch.

Environment: Spins up a Windows-latest runner.

Setup: Installs Java 21 and Maven dependencies.

Browser: Installs Google Chrome automatically.

Execution: Runs the Maven test goal using relative paths for cross-platform compatibility.


## 👨‍💻 Author
Arkan Essam

Software QA Automation Engineer

Specializing in Selenium, API Testing, and CI/CD pipelines.

Made with ❤️ and Java.

