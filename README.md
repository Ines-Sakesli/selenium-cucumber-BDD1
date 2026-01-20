
# 🧪 Selenium WebDriver Automation Framework

This project is a **test automation framework** built with:
- [Selenium WebDriver](https://www.selenium.dev/)
- [Cucumber](https://cucumber.io/) (BDD)
- [JUnit](https://junit.org/)
- **Page Object Model (POM)** design pattern
- **Factory Design Pattern** for browser management

The goal of this framework is to provide a scalable, maintainable, and easy-to-use structure for end-to-end UI test automation.

---

## 🚀 Features

- Cross-browser execution (Chrome, Firefox, Edge) via **Factory Pattern**.
- Test scenarios written in **Gherkin** syntax for readability.
- Structured with **Page Object Model** for reusability and maintainability.
- Test execution and reporting with **JUnit**.
- Easily extendable for additional browsers and environments.
- Logging support for better traceability.

---

## 🏗️ Project Structure

```

selenium-cucumber-junit-pom-factory
│── src
│   ├── main
│   │   └── java
│   │       ├── factory
│   │       │   └── BrowserFactory.java      # Factory Pattern for WebDriver
│   │       └── pages
│   │           └── LoginPage.java           # Example Page Object
│   │
│   └── test
│       └── java
│           ├── stepDefinitions
│           │   └── LoginSteps.java          # Cucumber step definitions
│           └── runners
│               └── TestRunner.java          # JUnit test runner
│
│── src/test/resources
│   ├── features
│   │   └── login.feature                    # Example Gherkin feature
│   └── config.properties                    # Config file (browser, baseUrl, etc.)
│
│── pom.xml                                  # Maven dependencies
│── README.md

````

---

## ⚙️ Prerequisites

- **Java 11+**
- **Maven 3.6+**
- Browser drivers (e.g. ChromeDriver, GeckoDriver, EdgeDriver)
- IDE (IntelliJ, Eclipse, or VS Code with Java support)

---

## 📦 Installation

Clone the repository:

```bash
git clone https://github.com/your-username/selenium-cucumber-junit-pom-factory.git
cd selenium-cucumber-junit-pom-factory
````

Install dependencies:

```bash
mvn clean install
```

---

## ▶️ Running Tests

Run all tests with default browser (Chrome):

```bash
mvn test
```

Run tests with a specific browser:

```bash
mvn test -Dbrowser=firefox
mvn test -Dbrowser=edge
```

---

## 🧩 Example Usage

### Feature File (`login.feature`)

```gherkin
Feature: Login functionality

  Scenario: Successful login
    Given I am on the login page
    When I enter valid credentials
    And I click on the login button
    Then I should see the dashboard
```

### Step Definition (`LoginSteps.java`)

```java
@Given("I am on the login page")
public void i_am_on_the_login_page() {
    driver.get("https://example.com/login");
    loginPage = new LoginPage(driver);
}
```

---

## 🏗️ Design Patterns Used

### Page Object Model (POM)

* Each page of the application has a dedicated Java class.
* Encapsulates elements and actions to promote reusability.
* Example: `LoginPage.java`

### Factory Design Pattern

* Centralized **BrowserFactory** to manage different WebDriver instances.
* Makes it easy to switch browsers without modifying test logic.
* Example:

  ```java
  WebDriver driver = BrowserFactory.getDriver("chrome");
  ```

---

## 📊 Reporting

JUnit generates test results automatically.
You can also integrate with **Allure Reports** or **Extent Reports** for enhanced visualization.

---

## 🤝 Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m "Add new feature"`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a Pull Request

---

## 📜 License

This project is licensed under the MIT License.

```
```
