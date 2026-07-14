# 🎯 Task-1-Mubashir-Hussain
Number Guessing Game (DecodeLabs_Java_P1)
A simple and interactive Java Console Application developed as part of the DecodeLabs Java Internship.
This project challenges the user to guess a randomly generated number within a limited number of
attempts while demonstrating fundamental Java programming concepts such as loops, conditional
statements, exception handling, random number generation, and input validation.
📌 Project Overview
The Number Guessing Game generates a random number between 1 and 100. The player has 5 attempts
to guess the correct number. After each incorrect guess, the program provides a hint indicating whether the
guessed number is too high or too low. A score is calculated based on the number of attempts used, and
the player is given the option to play multiple rounds.
✨ Features
• 
• 
• 
�
� Random number generation between 
�
� Maximum of 
1 and 100
5 attempts to guess the correct number
📉 Hints for incorrect guesses (
• 
• 
• 
• 
• 
Too High / Too Low)
🏆 Score calculation based on remaining attempts
🔄 Play Again functionality
✅ Robust input validation
⚠ Exception handling to prevent application crashes
💻 Simple and user-friendly console interface
🛠 Technologies Used
• 
• 
• 
• 
Java
Scanner Class
Random Class
Exception Handling (
InputMismatchException )
1
�
� Project Structure
Task-1-Mubashir-Hussain
│
└── DecodeLabs_Java_P1.java
🎮 How the Program Works
1. 
2. 
3. 
4. 
5. 
6. 
7. 
8. 
9. 
10. 
The program generates a random number between 1 and 100.
The user enters a guess.
If the guess is incorrect:
The program displays whether the guessed number is too high or too low.
The remaining attempts decrease.
The game continues until:
The correct number is guessed, or
All attempts are used.
The final score is displayed.
The user can choose to play another round or exit the program.
🏆 Scoring System
Remaining Attempts Score
5
100
4
80
3
60
2
40
1
20
0
0
2
✅ Input Validation
The application includes proper input validation to improve reliability and user experience.
• 
• 
• 
• 
• 
Prevents invalid (non-numeric) input using InputMismatchException.
Continuously prompts the user until valid input is entered.
Ensures invalid input does not reduce the remaining attempts.
Validates the replay option by accepting only yes or no.
Prevents the program from crashing due to unexpected user input.
🚀 How to Run
Clone the Repository
git clone https://github.com/mubashirhussain482/Task-1-Mubashir-Hussain.git
Open the Project
Open the project using any Java IDE such as:
• 
• 
• 
NetBeans
IntelliJ IDEA
Eclipse
Run the Program
Compile and run:
DecodeLabs_Java_P1.java
📖 Java Concepts Demonstrated
• 
• 
• 
• 
• 
Variables and Data Types
User Input using Scanner
Random Number Generation
Conditional Statements (
if / 
Loops (
while and 
else )
do-while )
• 
• 
• 
Exception Handling
Input Validation
Score Calculation
3
�
� GitHub Repository
Repository:
https://github.com/mubashirhussain482/Task-1-Mubashir-Hussain
👨‍💻 Author
Mubashir Hussain
BS Software Engineering
COMSATS University Islamabad, Attock Campus
📄 License
This project was developed for learning purposes as part of the DecodeLabs Java Internship.
4
