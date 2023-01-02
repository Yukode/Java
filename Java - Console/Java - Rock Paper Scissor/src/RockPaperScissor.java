/*
    You are against AI in here btw.
    Didn't anymore created a multiplayer since it's kinda boring to do :>
*/

import java.util.Scanner;

public class RockPaperScissor {
    
    static Scanner scanner = new Scanner(System.in);
    static int challengerScore = 0;
    static int computerScore = 0;
    
    public static void startRockPaperScissor() {
        
        System.out.println("-------------------- ROCK PAPER SCISSOR --------------------");
        System.out.println("[] Goodluck and have fun!");
        System.out.println("[] Challenger plays first. Then, computer.");
        
        playerChoice();
        
    }
    
    public static void playerChoice() {
        
        int thePlayerChoice = 0;
        availableChoices();
        
        do {
            
            System.out.print("[] Enter Choice: ");
            thePlayerChoice = Integer.parseInt(scanner.next());
            
            if(thePlayerChoice == 0) {
                System.out.println("------------------------------------------------------------");
                System.out.println("[] SCORE");
                System.out.println("Challenger: " + challengerScore);
                System.out.println("Computer  : " + computerScore);
                
                System.out.println("\n[] Thank you for using my program.");
                System.out.println("[] Terminating game.");
                System.out.println("------------------------------------------------------------");
                System.exit(0);
            }

            if(thePlayerChoice < 1 || thePlayerChoice > 3) {
                System.out.println("------------------------------------------------------------");
                System.out.println("                      [] INVALID CHOICE                     "); // Too lazy to use \t in here :>
                System.out.println("------------------------------------------------------------");

            }
            
        } while(thePlayerChoice < 1 || thePlayerChoice > 3);
        
        computerChoice(thePlayerChoice);
        
    }
    
    public static void computerChoice(int thePlayerChoice) {
        
        int theComputerChoice = (int)(Math.random() * 3);
        
        if(theComputerChoice < 0 || theComputerChoice > 2) {
            computerChoice(thePlayerChoice);
        }
        
        System.out.println("[] Computer Choice: " + (theComputerChoice + 1));
        
        checkGame(thePlayerChoice, theComputerChoice + 1);
        
    }
    
    public static void availableChoices() {
        
        System.out.println("-------------------------- CHOICES -------------------------");
        System.out.println("[1] Rock");
        System.out.println("[2] Paper");
        System.out.println("[3] Scissor");
        System.out.println("[0] Exit Game");
        System.out.println("-------------------------- CHOICES -------------------------");
        
    }
    
    public static void checkGame(int choicePlayer, int choiceComputer) {
        
        System.out.println("------------------------- GAME CHECK -----------------------");
        if(choicePlayer == choiceComputer) {
            switch(choicePlayer) {
                case (1):
                    System.out.println("[] You both chose rock!");
                    System.out.println("[] It is a tie!");
                    break;
                case (2):
                    System.out.println("[] You both chose paper!");
                    System.out.println("[] It is a tie!");
                    break;
                case (3):
                    System.out.println("[] You both chose scissor!");
                    System.out.println("[] It is a tie!");
                    break;
            }
        } else {
            
            // CHALLENGER POWER - ROCK
            if(choicePlayer == 1 && choiceComputer == 2) {
                System.out.println("[] Status: [Challenger [Rock] < Computer [Paper]");
                System.out.println("[] Computer Won!");
                computerScore += 1;
            }
            if(choicePlayer == 1 && choiceComputer == 3) {
                System.out.println("[] Status: [Challenger [Rock] > Computer [Scissor]");
                System.out.println("[] Challenger Won!");
                challengerScore += 1;
            }
            
            // CHALLENGER POWER - PAPER
            if(choicePlayer == 2 && choiceComputer == 1) {
                System.out.println("[] Status: [Challenger [Paper] > Computer [Rock]");
                System.out.println("[] Challenger Won!");
                challengerScore += 1;
            }
            if(choicePlayer == 2 && choiceComputer == 3) {
                System.out.println("[] Status: [Challenger [Paper] < Computer [Scissor]");
                System.out.println("[] Computer Won!");
                computerScore += 1;
            }
            
            // CHALLENGER POWER - SCISSOR
            if(choicePlayer == 3 && choiceComputer == 1) {
                System.out.println("[] Status: [Challenger [Scissor] < Computer [Rock]");
                System.out.println("[] Computer Won!");
                computerScore += 1;
            }
            if(choicePlayer == 3 && choiceComputer == 2) {
                System.out.println("[] Status: [Challenger [Scissor] > Computer [Paper]");
                System.out.println("[] Challenger Won!");
                challengerScore += 1;
            }
            
            /* You can also do this to improve this code:
            // All Computer Wins
            if((choicePlayer == 1 && choiceComputer == 2) || (choicePlayer == 2 && choiceComputer == 3) || (choicePlayer == 3 && choiceComputer == 1)) {
                computerScore += 1;
                System.out.println("[] Computer Won!");
            }
            // All Challenger Wins
            if((choicePlayer == 1 && choiceComputer == 3) || (choicePlayer == 2 && choiceComputer == 1) || (choicePlayer == 3 && choiceComputer == 2)) {
                challengerScore += 1;
                System.out.println("[] Challenger Won!");
            }
            */
            
        }
        System.out.println("------------------------- GAME CHECK -----------------------");
        
        System.out.println("[] SCORE");
        System.out.println("Challenger: " + challengerScore);
        System.out.println("Computer  : " + computerScore);
        playerChoice();
        
    }
    
    public static void main(String[] args) {
        
        startRockPaperScissor();
        
    }
}