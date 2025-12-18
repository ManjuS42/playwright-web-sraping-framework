# 🚀 Playwright Web Data Scraper

A clean, scalable, and configuration-driven **Playwright (Java)** framework for automated web data extraction.
This project demonstrates robust automation practices including structured scraping, reusable utilities, externalized configuration, and CSV export with proper error handling.

---

## 📌 Overview

This framework automates the extraction of tabular market data from a public website and exports the required fields into a CSV file.
It is designed with **maintainability, reusability, and clarity** in mind, following best practices commonly used in production-grade automation frameworks.

---

## ✨ Key Features

✅ Automated web data extraction using **Playwright (Java)**
✅ Scrapes structured table data (Low, High, Last, Weight Avg)
✅ Exports extracted data into a **CSV file**
✅ Externalized configuration using `config.properties`
✅ Centralized Playwright lifecycle management
✅ Robust waits and defensive checks
✅ Clean separation of concerns (core, utils, scraper, tests)
✅ Test execution managed via **TestNG**
✅ Easily extensible for additional markets or datasets

---

## 🧱 Project Structure

```
playwright-web-data-scraper
│
├── pom.xml
├── testng.xml
├── README.md
├── .gitignore
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org/automation/playwrightwebscrapingframework
│   │   │       ├── config
│   │   │       │   └── ConfigReader.java
│   │   │       ├── core
│   │   │       │   └── PlaywrightFactory.java
│   │   │       ├── utils
│   │   │       │   ├── CsvWriterUtil.java
│   │   │       │   ├── DateUtil.java
│   │   │       └── scraper
│   │   │           └── MarketDataScraper.java
│   │   └── resources
│   │       └── config
│   │           └── config.properties
│   │
│   └── test
│       └── java
│           └── org/automation/playwrightwebscrapingframework/tests
│               └── MarketDataScraperTest.java
│
└── output
│   └── market-data.csv
```

---

## ⚙️ Technology Stack

🟦 **Language:** Java 21
🟩 **Automation Library:** Playwright
🧪 **Test Framework:** TestNG
📦 **Build Tool:** Maven
📊 **CSV Handling:** OpenCSV
⚙️ **Configuration:** Properties file

---

## 🔧 Configuration

All runtime configuration is externalized in:

```
src/main/resources/config/config.properties
```

### 🔍 Configuration Highlights

* 📅 Dynamic date support
* 🖥️ Headless / headed execution toggle
* ⏱️ Configurable timeouts
* 📂 Configurable output location

---

## 🧠 Design Approach

### 🔹 Separation of Concerns

* **ConfigReader** – Centralized configuration access
* **PlaywrightFactory** – Browser lifecycle management
* **MarketDataScraper** – Data extraction logic only
* **Utils** – CSV writing, date handling, and waits
* **Test Layer** – Minimal orchestration logic

### 🔹 Robustness & Stability

* Explicit waits for table visibility
* Defensive checks on table structure
* Clean resource teardown
* Meaningful runtime exceptions

---

## ▶️ Execution

### ▶️ Run using Maven

```bash
mvn clean test
```

### ▶️ Run using TestNG XML

```bash
mvn test -DsuiteXmlFile=testng.xml
```

### 🧾 TestNG Suite

```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Playwright Web Data Scraper Suite">
    <test name="Market Data Scraper Test">
        <classes>
            <class name="org.automation.playwrightwebscrapingframework.tests.MarketDataScraperTest"/>
        </classes>
    </test>
</suite>
```

---

## 📄 Output

After successful execution, a CSV file is generated at:

```
output/market-data.csv
```

### 📊 Sample CSV Output

```
Low,High,Last,Weight Avg
70.77,93.00,90.00,80.24
71.15,92.01,89.00,82.77
...
```

---

## 🚀 Extensibility

This framework can be easily extended to:

➕ Support additional market areas
➕ Scrape other table-based datasets
➕ Add retry and fallback logic
➕ Integrate logging (Logback / SLF4J)
➕ Integrate CI pipelines (GitHub Actions / Jenkins)
➕ Add schema validation for CSV output

---

## ✅ Quality Practices Followed

✔ No hard-coded values
✔ No `Thread.sleep()`
✔ Config-driven execution
✔ Reusable utilities
✔ Clean and readable code
✔ Production-style folder structure

---

## 👩‍💻 Author

**Manju S**

| Senior Software Development Engineer in Test (SDET) |
🔗 GitHub: https://github.com/ManjuS42

---

## 🏁 Summary

This project demonstrates a practical and maintainable approach to automated web data extraction using Playwright with Java.
It focuses on clarity, robustness, and scalability, making it suitable for real-world automation scenarios.
