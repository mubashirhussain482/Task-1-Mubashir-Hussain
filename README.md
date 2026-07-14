# 🎯 Task-1-Mubashir-Hussain
Number Guessing Game (DecodeLabs_Java_P1)
A simple and interactive Java Console Application developed as part of the DecodeLabs Java Internship. This project challenges the user to guess a randomly generated number within a limited number of attempts while demonstrating fundamental Java programming concepts such as loops, conditional statements, exception handling, random number generation, and input validation.
________________________________________
📌 Project Overview
The Number Guessing Game generates a random number between 1 and 100. The player has 5 attempts to guess the correct number. After each incorrect guess, the program provides a hint indicating whether the guessed number is too high or too low. A score is calculated based on the number of attempts used, and the player is given the option to play multiple rounds.
________________________________________
✨ Features
•	🎲 Random number generation between 1 and 100
•	🔢 Maximum of 5 attempts to guess the correct number
•	📉 Hints for incorrect guesses (Too High / Too Low)
•	🏆 Score calculation based on remaining attempts
•	🔄 Play Again functionality
•	✅ Robust input validation
•	⚠ Exception handling to prevent application crashes
•	💻 Simple and user-friendly console interface
________________________________________
🛠 Technologies Used
•	Java
•	Scanner Class
•	Random Class
•	Exception Handling (InputMismatchException)
________________________________________
📂 Project Structure
Task-1-Mubashir-Hussain
│
└── DecodeLabs_Java_P1.java
________________________________________
🎮 How the Program Works
1.	The program generates a random number between 1 and 100.
2.	The user enters a guess.
3.	If the guess is incorrect:
o	The program displays whether the guessed number is too high or too low.
o	The remaining attempts decrease.
4.	The game continues until:
o	The correct number is guessed, or
o	All attempts are used.
5.	The final score is displayed.
6.	The user can choose to play another round or exit the program.
________________________________________
🏆 Scoring System
Remaining Attempts	Score
5	100
4	80
3	60
2	40
1	20
0	0
________________________________________
✅ Input Validation
The application includes proper input validation to improve reliability and user experience.
•	Prevents invalid (non-numeric) input using InputMismatchException.
•	Continuously prompts the user until valid input is entered.
•	Ensures invalid input does not reduce the remaining attempts.
•	Validates the replay option by accepting only yes or no.
•	Prevents the program from crashing due to unexpected user input.
________________________________________
🚀 How to Run
Clone the Repository
git clone https://github.com/mubashirhussain482/Task-1-Mubashir-Hussain.git
Open the Project
Open the project using any Java IDE such as:
•	NetBeans
•	IntelliJ IDEA
•	Eclipse
Run the Program
Compile and run:
DecodeLabs_Java_P1.java
________________________________________
📖 Java Concepts Demonstrated
•	Variables and Data Types
•	User Input using Scanner
•	Random Number Generation
•	Conditional Statements (if / else)
•	Loops (while and do-while)
•	Exception Handling
•	Input Validation
•	Score Calculation
________________________________________
🔗 GitHub Repository
Repository:
https://github.com/mubashirhussain482/Task-1-Mubashir-Hussain
________________________________________
👨‍💻 Author
Mubashir Hussain
BS Software Engineering
COMSATS University Islamabad, Attock Campus
________________________________________
📄 License
This project was developed for learning purposes as part of the DecodeLabs Java Internship.
