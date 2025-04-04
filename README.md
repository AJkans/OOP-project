# Exam Processing System

This is a **Java-based Exam Processing System** designed to manage student examination records, compute grades, and generate report cards.

## Features
- Accepts details for **10 students**, including:
  - Student Name
  - Student ID
  - Marks for 5 subjects
- Computes the **average score** and assigns a grade based on the **Strathmore University grading system**.
- Displays a **report card** with:
  - Student name & ID
  - Subject-wise marks
  - Average score and assigned grade
  - Performance recommendation
  - Date of report generation

## Grading System
| Average Score | Grade | Recommendation |
|--------------|-------|----------------|
| 75+         | A     | Excellent performance! |
| 60 - 74     | B     | Good effort! |
| 50 - 59     | C     | Could do better |
| Below 50    | F     | Needs improvement |

## Installation and Usage
1. **Clone the repository**
   ```sh
   git clone https://github.com/your-username/exam-processing-system.git
   ```
2. **Navigate to the project folder**
   ```sh
   cd exam-processing-system
   ```
3. **Compile the Java program**
   ```sh
   javac ExamSystem.java
   ```
4. **Run the program**
   ```sh
   java ExamSystem
   ```
5. Enter student details and scores when prompted.
6. View the **final report cards** displayed on the screen.

## Project Structure
- **`StudentRecord` Class**: Manages student data, calculates grades, and displays the report card.
- **`ExamSystem` Class**: Handles user input, processes multiple students, and generates reports.

## Requirements
- Java Development Kit (JDK) installed.
- Basic knowledge of Java for modifications or extensions.

## Future Enhancements
- Save student records in a **database or file** for future retrieval.
- Add a **graphical user interface (GUI)** for better usability.
- Implement a **custom grading system** for different universities.
