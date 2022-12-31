import java.util.Scanner;
import java.util.ArrayList;

public class TicTacToeVSAi {
    
    static ArrayList<String> choices = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    static String whoIsPlaying = "";
    
    public static void startTicTacToe() {
        
        choices.removeAll(choices);
        for(int a = 0; a < 9; a++) {
            choices.add(" ");
        }
        
        System.out.println("----------------- TIC TAC TOE -----------------");
        System.out.println("Game Rules: ");
        System.out.println("[] First one to create a straight line "
                + "\n   (diagonal, horizontal, vertical) wins.");
        System.out.println("[] Player = X");
        System.out.println("[] Computer = O");
        System.out.println("[] Good luck!");
        System.out.println("-----------------------------------------------");
        
        System.out.println("GUIDE: ");
        guideBoard();
        
        System.out.println();
        playerChoice();
        
    }
    
    public static void playerChoice() {
        
        System.out.print("[Player] Enter Choice: ");
        int player = Integer.parseInt(scanner.nextLine()) - 1;

        whoIsPlaying = "PLAYER";
        checkIfChoiceIsPossible(player);

        playGoesOn();
        gameBoard();
        computerChoice();
        
    }
    
    public static void computerChoice() {
        
        int computer = (int)(Math.random() * 9) - 1;
        
        whoIsPlaying = "COMPUTER";
        checkIfChoiceIsPossible(computer);
        
        playGoesOn();
        
        System.out.println("[Computer] Enter Choice: " + (computer + 1));
        gameBoard();
        playerChoice();
        
    }
    
    public static void checkIfChoiceIsPossible(int user) {
        
        int[] choicesAvailable = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        boolean choiceIsPossible = false;
        
        for(int a = 0; a < choicesAvailable.length; a++) {
            if(user == choicesAvailable[a]) {
                choiceIsPossible = true;
                break;
            }
        }
        
        if(choiceIsPossible) {
            
            if(choices.get(user).equals("X") || choices.get(user).equals("O")) {
                
                if(whoIsPlaying.equals("PLAYER")) {
                    System.out.println("[] Choice already chosen.\n[] Please try another.\n");
                    playerChoice();
                } else {
                    computerChoice();
                }
                
            } else {
                
                if(whoIsPlaying.equals("PLAYER")) {
                    choices.set(user, "X");
                } else {
                    choices.set(user, "O");
                }
                
            }
            
        } else {
            
            if(whoIsPlaying.equals("PLAYER")) {
                
                System.out.println("[] Invalid Choice!");
                playerChoice();
                
            } else {
                computerChoice();
            }
            
        }
        
    }
    
    public static void playGoesOn() {

        switch (whoIsPlaying) {

            case ("PLAYER"):

                if (       choices.get(0).equals("X") && choices.get(1).equals("X") && choices.get(2).equals("X")
                        || choices.get(2).equals("X") && choices.get(5).equals("X") && choices.get(8).equals("X")
                        || choices.get(6).equals("X") && choices.get(7).equals("X") && choices.get(8).equals("X")
                        || choices.get(0).equals("X") && choices.get(3).equals("X") && choices.get(6).equals("X")
                        || choices.get(3).equals("X") && choices.get(4).equals("X") && choices.get(5).equals("X")
                        || choices.get(1).equals("X") && choices.get(4).equals("X") && choices.get(7).equals("X")
                        || choices.get(0).equals("X") && choices.get(4).equals("X") && choices.get(8).equals("X")
                        || choices.get(2).equals("X") && choices.get(4).equals("X") && choices.get(6).equals("X")) 
                {
                    System.out.println("\n[] Player WON!");

                    gameBoard();
                    promptIfPlayAgain();

                }
                break;

            case ("COMPUTER"):

                if (       choices.get(0).equals("O") && choices.get(1).equals("O") && choices.get(2).equals("O")
                        || choices.get(2).equals("O") && choices.get(5).equals("O") && choices.get(8).equals("O")
                        || choices.get(6).equals("O") && choices.get(7).equals("O") && choices.get(8).equals("O")
                        || choices.get(0).equals("O") && choices.get(3).equals("O") && choices.get(6).equals("O")
                        || choices.get(3).equals("O") && choices.get(4).equals("O") && choices.get(5).equals("O")
                        || choices.get(1).equals("O") && choices.get(4).equals("O") && choices.get(7).equals("O")
                        || choices.get(0).equals("O") && choices.get(4).equals("O") && choices.get(8).equals("O")
                        || choices.get(2).equals("O") && choices.get(4).equals("O") && choices.get(6).equals("O")) 
                {
                    System.out.println("\n[] Computer WON!");

                    gameBoard();
                    promptIfPlayAgain();

                }

                break;

        }

        boolean haveChoices = false;

        for (int a = 0; a < choices.size(); a++) {
            if (choices.get(a).equals(" ")) {
                haveChoices = true;
                break;
            }
        }

        if (haveChoices == false) {  // All choices have been played.

            System.out.println("\n-----------------------------------------------");
            System.out.println("[] No More Choice(s)!");
            System.out.println("[] Game Ends!");

            gameBoard();
            promptIfPlayAgain();

        }

    }
    
    public static void promptIfPlayAgain() {

        System.out.println("-----------------------------------------------");
        System.out.println("PLAY AGAIN?");

        System.out.print("Enter Choice [y/n]: ");
        String playAgain = scanner.nextLine().toLowerCase();

        System.out.println();
        switch (playAgain) {

            case ("y"):

                startTicTacToe();

                break;
            case ("n"):

                System.out.println("[] Terminating Program.");
                System.out.println("[] Tic Tac Toe - Exit.");
                System.out.println("-----------------------------------------------");
                System.exit(0);

                break;
            default:

                System.out.println("[] Invalid Choice!");
                promptIfPlayAgain();

        }
    }
    
    public static void gameBoard() {

        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   " + choices.get(0) + "   |   " + choices.get(1) + "   |   " + choices.get(2) + "   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   " + choices.get(3) + "   |   " + choices.get(4) + "   |   " + choices.get(5) + "   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   " + choices.get(6) + "   |   " + choices.get(7) + "   |   " + choices.get(8) + "   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");

    }

    public static void guideBoard() {

        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   1   |   2   |   3   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   4   |   5   |   6   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   7   |   8   |   9   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");

    }
    
    public static void main(String[] args) {
        
        startTicTacToe();
        
    }
}