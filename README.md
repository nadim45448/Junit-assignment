#  Web Form Automation using Selenium and JUnit
This repository contains automation solutions for three tasks using **JUnit**, **Selenium WebDriver**, and **Java**.

---

##  Overview
 
The automation scripts are designed to complete all required form fields, manage file uploads, submit the forms, and confirm that the appropriate success messages are displayed
upon submission. The goal is to simplify the web form submission process and ensure that each form is executed and validated correctly.
In the third task, the script also scrapes data from a web table and stores the extracted information in a text file for further use or validation.

1.  Web Form Automation – [Digital Unite](https://www.digitalunite.com/practice-webform-learners)  
2.  Web Form Automation – [Everest Guest Registration](https://demo.wpeverest.com/user-registration/guest-registration-form/)  
3.  Table Data Scraping – [DSEBD Share Price](https://dsebd.org/latest_share_price_scroll_by_value.php)

---

##  Task 1: Automate Digital Unite Form

 **URL:** [Digital Unite Practice Form](https://www.digitalunite.com/practice-webform-learners)

###  Steps:
1. Fill all required fields
2. Upload a file (≤ 2MB)
3. Click **Submit**
4. Assert success message:  
    _“Thank you for your submission!”_
  
 **Video Demo:** [ Watch Demo](https://drive.google.com/file/d/1SkXhhI0Y62Kz4SOS4cIcO_wxiykFSb7I/view?usp=sharing)  
 
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
   - Password
   - Date of Birth  
   - Nationality  
   - Phone Number  
   - Country → `Bangladesh`  
   - Agree to Terms & Conditions
2. Click **Submit**
3. Assert registration success
  
 **Video Demo:** [ Watch Demo](https://drive.google.com/file/d/1wDo-20uNkeFkOYIxFoUFl-TqgGPtuqmB/view?usp=sharing)
 
 **Report Screenshot:**  
![image](https://github.com/user-attachments/assets/249b7dfd-d4e7-4542-bdcc-5735048f96c3)


---

##  Task 3: Scrape DSEBD Stock Table

 **URL:** [DSEBD Latest Share Price](https://dsebd.org/latest_share_price_scroll_by_value.php)

###  Steps:
1. Scrape all table cell values
2. Print them to the console
3. Save all values to `value.txt`
  
 **Text Output:** [`outputs/value.txt`](./src/test/resources/value.txt)  
 **Video Demo:** [Watch Demo](https://drive.google.com/file/d/1WDxkU2b8aE86uCNPjtnr_Nb6SEL8gs5W/view?usp=sharing)  
 
 **Report Screenshot:**  
![image](https://github.com/user-attachments/assets/3c0e489c-ed64-40a4-be4e-f7d5b728c088)

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

##  How to Run the Tests

###  Option 1: Using IntelliJ IDEA

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/nadim45448/junit-assignment.git
   cd junit-assignment

---




