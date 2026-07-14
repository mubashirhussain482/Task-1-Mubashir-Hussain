import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class DecodeLabs_Java_P1 {
    public static void main(String[] args) {
        Random randomGenerator=new Random();
        Scanner scanner=new Scanner(System.in);    
        String playAgainChoice="";            
        do{
            int remainingAttempts=5;                  
            int targetNumber=randomGenerator.nextInt(100)+1;
            int userGuess=0;
            final int MAX_SCORE=100;
            int currentScore=MAX_SCORE;
            boolean isValidInput=false;
            while(!isValidInput){
                try{
                    System.out.print("Guess the number:");
                    userGuess=scanner.nextInt();
                    scanner.nextLine();
                    isValidInput=true;
                }catch(InputMismatchException e){
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine();
                }
            }
            while(targetNumber!=userGuess){                
                if(targetNumber>userGuess){
                    System.out.println("Your number is low");
                }
                else if(targetNumber<userGuess){
                    System.out.println("Your number is high");
                }
                remainingAttempts-=1;
                currentScore-=20;
                if(remainingAttempts==0){                
                    break;
                }           
                System.out.println(remainingAttempts+" attempts left");
                isValidInput=false;
                while(!isValidInput){
                    try{
                        System.out.print("Guess the number:");
                        userGuess=scanner.nextInt();
                        scanner.nextLine();
                        isValidInput=true;
                    }catch(InputMismatchException e){
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.nextLine();
                    }
                }
            }
            if(targetNumber==userGuess){
                System.out.println("You win the game.");
                System.out.println("The number is "+targetNumber);
                System.out.println("Your score is "+currentScore);
            }
            else if(remainingAttempts==0){
                System.out.println("You lose. Out of moves");
                System.out.println("The number was "+targetNumber);  
                System.out.println("Your score is "+currentScore);         
            }
            do{
                System.out.print("Do you want to play again (yes/no):");
                playAgainChoice=scanner.next().toLowerCase();
                if(!playAgainChoice.equals("yes") && !playAgainChoice.equals("no")){
                    System.out.println("Invalid input. Please type yes or no.");
                }
            }while(!playAgainChoice.equals("yes")&&!playAgainChoice.equals("no"));
            
        }while(playAgainChoice.equals("yes"));
        System.out.println("Game Ended.");
        scanner.close();
    }
}