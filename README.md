# Vertical Scroll Automation using Selenium & Java

This project demonstrates how to perform vertical scrolling on a webpage using Selenium WebDriver and JavaScriptExecutor in Java.
The automation opens the Demo Web Shop website and performs different vertical scroll actions using JavaScript.


## Features
* Launch Chrome Browser
* Maximize browser window
* Open Demo Web Shop website
* Scroll down vertically
* Scroll further down
* Scroll upward
* Close browser automatically


## Tech Stack
* Java
* Selenium WebDriver
* ChromeDriver
* JavaScriptExecutor
* Eclipse / IntelliJ IDEA

## Project Structure

```bash
Vertical_Scroll/
│── src/
│   └── learning_JavascriptExecutor_Interface/
│       └── Vertical_Scroll.java
│
│── drivers/
│   └── chromedriver.exe
│
│── README.md
```


## How It Works

The project uses:

```java
JavascriptExecutor js = (JavascriptExecutor) driver;
```

to execute JavaScript scrolling commands like:

```java
js.executeScript("window.scrollBy(0,300)");
```


## Sample Scroll Actions

### Scroll Down

```java
js.executeScript("window.scrollBy(0,300)");
```

### Scroll More Down

```java
js.executeScript("window.scrollBy(0,150)");
```

### Scroll Up

```java
js.executeAsyncScript("window.scrollBy(0,-200)");
```

---

## Website Used

🔗 [https://demowebshop.tricentis.com/](https://demowebshop.tricentis.com/)

## Run the Project

### Prerequisites

* Java JDK installed
* Selenium WebDriver added
* Chrome browser installed
* ChromeDriver configured

### Steps

1. Clone the repository

```bash
git clone <your-github-repo-link>
```

2. Open project in Eclipse or IntelliJ

3. Run:

```bash
Vertical_Scroll.java
```

---

## Automation Flow

1. Launch Browser
2. Open Website
3. Scroll Down
4. Scroll Further
5. Scroll Up
6. Close Browser

---

## Learning Outcome

This project helps understand:

* Selenium JavaScriptExecutor
* Browser scrolling automation
* Handling page navigation using JavaScript
* Basic Selenium automation concepts


## Author
MANI
Aspiring QA Automation Engineer

GitHub:  https://github.com/manishakthi25
LinkedIn: https://www.linkedin.com/in/maniyarasi-s
