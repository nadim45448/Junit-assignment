#  JUnit Automation Assignment

---

##  Overview

This repository includes three JUnit automation tasks:  
The automation scripts are designed to complete all required form fields, manage file uploads, submit the forms, and confirm that the appropriate success messages are displayed
upon submission. The goal is to simplify the web form submission process and ensure that each form is executed and validated correctly.
In the third task, the script also scrapes data from a web table and stores the extracted information in a text file for further use or validation.

1.  Web Form Automation – [Digital Unite](https://www.digitalunite.com/practice-webform-learners)  
2.  Web Form Automation – [Everest Guest Registration](https://demo.wpeverest.com/user-registration/guest-registration-form/)  
3.  Table Data Scraping – [DSEBD Share Price](https://dsebd.org/latest_share_price_scroll_by_value.php)

---

##  Prerequisites

Before running the automation scripts, ensure the following are installed:

-  Java JDK 8 or above  
-  Gradle  
-  IntelliJ IDEA 
-  Google Chrome Browser  
-  ChromeDriver (added to system PATH)  
-  Git (for cloning the repository)

---

##  Tools & Technologies Used

| Tool/Tech             | Purpose                         |
|-----------------------|----------------------------------|
| **Java**              | Core programming language       |
| **JUnit**             | Unit testing framework          |
| **Selenium WebDriver**| Browser automation              |
| **Gradle**            | Dependency & project management |
| **Git & GitHub**      | Version control & hosting       |
| **ChromeDriver**      | Automates Google Chrome         |
| **Extent Reports** *(Optional)* | Test reporting        |

---

##  Task 1: Automate Digital Unite Form

 **URL:** [Digital Unite Practice Form](https://www.digitalunite.com/practice-webform-learners)

###  Steps:
1. Fill all required fields
2. Upload a file (≤ 2MB)
3. Click **Submit**
4. Assert success message:  
    _“Thank you for your submission!”_
  
 **Video Demo:** [ Watch Demo](https://drive.google.com/file/d/1Ho67syMJPSV8pqThn8Drw1Bf7BQvFbB7/view?usp=sharing)  
 
 **Report Screenshot:**  
![image](https://github.com/user-attachments/assets/3a15c486-15e3-4657-ae2d-f0470ccc2c7d)


---

##  Task 2: Automate Guest Registration Form

 **URL:** [Everest Forms Demo](https://demo.wpeverest.com/user-registration/guest-registration-form/)

###  Steps:
1. Fill in the following fields:
   - First Name  
   - Last Name  
   - Email  
   - Gender  
   - Date of Birth  
   - Nationality  
   - Phone Number  
   - Country → `Bangladesh`  
   - Agree to Terms & Conditions
2. Click **Submit**
3. Assert registration success
  
 **Video Demo:** [ Watch Demo on Google Drive](https://drive.google.com/file/d/143DiQ7s4C3R1H2j2H54NKEah3AKvDJ6n/view?usp=sharing)  
 **Report Screenshot:**  
![Task 2 Report](./task2-guest-registration-form/screenshots/report.png)

---

##  Task 3: Scrape DSEBD Stock Table

 **URL:** [DSEBD Latest Share Price](https://dsebd.org/latest_share_price_scroll_by_value.php)

###  Steps:
1. Scrape all table cell values
2. Print them to the console
3. Save all values to `share_prices.txt`
  
 **Text Output:** [`outputs/share_prices.txt`](./task3-dsebd-scraper/outputs/share_prices.txt)  
 **Video Demo:** [📺 Watch Demo on Google Drive](https://drive.google.com/file/d/143DiQ7s4C3R1H2j2H54NKEah3AKvDJ6n/view?usp=sharing)  
 **Report Screenshot:**  
![Task 3 Report](./task3-dsebd-scraper/screenshots/report.png)

---




