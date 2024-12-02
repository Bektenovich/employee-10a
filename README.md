# Employee Management System

## Project Overview

The **Employee Salary Management System** is a JavaFX-based application designed to manage and calculate employee salaries based on their employment type. The system uses an **abstract class** `Employee` with different **subclasses** for Full-time, Part-time, and Contractor employees, each having specific salary calculation logic.

This application allows users to:
- View a list of employees and their calculated salaries.
- Add new employees (Full-time, Part-time, or Contractor).
- Remove employees from the list.
- Calculate and update employee salaries.

---

## Features

### Core Features:
- **Add Employee**: Users can add employees to the system by entering their name, type (Full-time, Part-time, or Contractor), hours worked (for Part-time and Contractor), and hourly rate.
- **View Employee List**: Displays a table showing the name, employee type, and calculated salary of each employee.
- **Salary Calculation**: Salaries are calculated based on the type of employee:
  - **Full-time**: Fixed annual salary.
  - **Part-time**: Based on hourly wage and hours worked.
  - **Contractor**: Based on a fixed hourly rate with a maximum number of hours worked per month.
- **Remove Employee**: Users can remove an employee from the list by selecting their name from the table and clicking the remove button.
- **Input Validation**: Ensures that valid data is entered (e.g., non-negative hours and salary).
  
### Additional Features:
- **JavaFX TableView**: Employees are displayed in a TableView for easy management.
- **Responsive User Interface**: A simple and user-friendly design to handle employee management efficiently.
- **Error Handling**: Displays error messages for invalid inputs (e.g., negative values for hours or hourly rate).

---

## Setup Instructions

### 1. Clone the Repository
- Clone the repository to your local machine.

### 2. Import the Project into Your IDE
- **For IntelliJ IDEA**: Open the project directory by selecting `File > Open` and choosing the project folder.
- **For Eclipse**: Create a new Java project and import the necessary files.

### 3. Set Up JavaFX
Ensure that JavaFX is set up properly in your IDE:
- **In IntelliJ IDEA**: You may need to add the JavaFX SDK as a library.
- **In Eclipse**: Download the JavaFX SDK, then add it to your build path.

### 4. Run the Application
Run the `HelloApplication.java` file in your IDE to launch the application. The main window with the employee management interface should appear.

---

## How to Use the Application

### 1. Add an Employee
- Fill in the **Name** field.
- Choose the **Employee Type** (Full-time, Part-time, Contractor).
- For **Part-time** and **Contractor** types, fill in the **Hours Worked** and **Hourly Rate**.
- For **Full-time** employees, enter the **Salary** (fixed salary).
- Click the **Add Employee** button to add the employee to the list.

### 2. View Employee List
- The employee list is displayed in a **TableView** with the columns: **Name**, **Employee Type**, and **Salary**.
- The salaries will be calculated automatically based on the employee type.

### 3. Remove an Employee
- Click on an employee row in the table to select that employee.
- Click the **Remove Employee** button to remove the selected employee from the list.

### 4. Calculate Salaries
- Click the **Calculate Salaries** button to update the salaries for all employees, ensuring the correct amount is displayed.

---

## Example Screenshots

### **1. Add Employee Form**

<img width="857" alt="image" src="https://github.com/user-attachments/assets/36c05617-5c2d-4e24-a4cc-9df69e67ec3a">


### **2. Employee List Table**

<img width="899" alt="image" src="https://github.com/user-attachments/assets/7dd04b57-7bf0-4cc9-87cd-cf814f845f9f">


### **3. Employee Deletion Confirmation**

<img width="954" alt="image" src="https://github.com/user-attachments/assets/c7cbdb34-5a9a-48c0-8306-c12b20785e08">

---
