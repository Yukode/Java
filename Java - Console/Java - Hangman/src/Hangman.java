import java.util.Scanner;
import java.util.ArrayList;

public class Hangman {
    
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> wordHangman = new ArrayList<>();
    static String[] wordChoices = {"DEATH", "STRAWBERRY", "NEW YORK", "BEST MAN"};
    static String[] wordClues = {"What comes after life?", "Red fruit with beans on its skin.",
                                 "The city that do not sleep.", "Called for the man of the groom chosen by him."};
    static String human = "";
    static int humanPart = 0;
    
    static String word;
    static String clue;
    static String showWord;
    
    public static void startHangman() {
        
        showGuide();
        
        System.out.println("----------------- HANG MAN -----------------");
        System.out.println("Clue: " + clue);
        System.out.println("Word: " + showWord);
        
        System.out.println();
        startPlay();
        
    }
    
    public static void startPlay() {
        
        System.out.print("Enter Letter: ");
        String letter = scanner.nextLine().toUpperCase();
        
        doLetterExist(letter);
        
    }
    
    public static void doLetterExist(String input) {
        
        boolean letterExist = false;
        
        if(word.contains(input)) {
            letterExist = true;
        } else {
            letterExist = false;
        }
        
        if(letterExist) {
            
            for(int a = 0; a < word.length(); a++) {
                if(word.charAt(a) == input.charAt(0)) {
                    wordHangman.set(a, (input + " "));
                }
            }
            actualGuide();
            startPlay();
            
        } else {
            
            humanPart += 1;
            
            /*  - GUIDE (Human Part)
                System.out.println("_____"); // 1
                System.out.println("  |");   // 2
                System.out.println("  O");   // 3
                System.out.println(" -+-");  // 4
                System.out.println("  |");   // 5
                System.out.println(" / \\"); // 6
            */
            
            switch(humanPart) {
                case (1):
                    human += ("_____");
                    break;
                case (2):
                    human += ("\n  |");
                    break;
                case (3):
                    human += ("\n  O");
                    break;
                case (4):
                    human += ("\n -+-");
                    break;
                case (5):
                    human += ("\n  |");
                    break;
                case (6):
                    human += ("\n / \\");
                    
                    System.out.println("---------------- HUMAN LIFE ----------------");
                    System.out.println(human);
                    System.out.println("---------------- HUMAN DIED ----------------");
                    System.out.println("[] You are too late!");
                    System.out.println("---------------- HUMAN DIED ----------------");
                    playAgain();
                    
                    break;
            }
            
            System.out.println("---------------- HUMAN LIFE ----------------");
            System.out.println(human);
            System.out.println("---------------- HUMAN LIFE ----------------");
            
            actualGuide();
            startPlay();
            
        }
        
    }
    
    public static void actualGuide() {
        
        System.out.print("Word: ");
        for(int a = 0; a < wordHangman.size(); a++) {
            System.out.print(wordHangman.get(a));
        }
        System.out.println();
        
    }
    
    public static void showGuide() {
        
        int random = (int)(Math.random() * 4);
        word = wordChoices[random];
        clue = wordClues[random];
        showWord = "";
        wordHangman.removeAll(wordHangman);
        
        for(int a = 0; a < word.length(); a++) {
            
            if(word.charAt(a) != ' ') {
                showWord += "_ ";
                wordHangman.add("_ ");
            } else {
                showWord += " ";
                wordHangman.add(" ");
            }
            
        }
        
    }
    
    public static void playAgain() {
        
        String choice = "";
        
        System.out.println("Play Again?");
        System.out.print("Enter Choice [y/n]: ");
        choice = scanner.nextLine().toLowerCase();
        
        switch(choice) {
            case ("y"):
                human = "";
                humanPart = 0;
                System.out.println();
                startHangman();
                break;
            case ("n"):
                System.out.println("----------------- END GAME -----------------");
                System.out.println("[] The human decided to live the day!");
                System.out.println("[] System terminating.");
                System.out.println("--------------------------------------------");
                System.exit(0);
                break;
            default:
                System.out.println();
                playAgain();
        }
        
    }
    
    public static void main(String[] args) {
        
        startHangman();
        
    }
}