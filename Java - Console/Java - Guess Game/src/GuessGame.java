// A very basic guess game.
// That is all about planets.
import java.util.Scanner;

public class GuessGame {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void startGuessGame() {
        
        System.out.println("------------------ GUESS GAME ------------------");
        System.out.println("[] Each of the choice has their own clues.");
        System.out.println("[] It is up to you to find the word. :>");
        System.out.println("[] Category: Planets oOoOo");
        System.out.println("------------------ GUESS GAME ------------------");
        
        System.out.println();
        challengerChoice();
        
    }
    
    public static void challengerChoice() {
        
        int planet = 5;
        int planetChoice = 5;
        
        do {
            planet = (int)(Math.random() * 9);
        } while(planet < 1 || planet > 8);
        
        System.out.print("Clue: ");
        clue(planet);
        
        do {
            
            choices();
            
            System.out.print("\nEnter Choice: ");
            planetChoice = Integer.parseInt(scanner.nextLine());
            
        } while(planetChoice < 1 || planetChoice > 8);
        
        gameChecker(planet, planetChoice);
        
    }
    
    public static void gameChecker(int planet, int planetChoice) {
        
        if(planetChoice == planet) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Better luck next time!");
        }
        
        System.exit(0);
        
    }
    
    public static void clue(int planet) {
        
        switch(planet) {
            
            case (1):
                System.out.println("The innermost planet of the solar system and the eighth in size and mass.");
                break;
            case (2):
                System.out.println("Second planet from the Sun and is Earth’s closest planetary neighbor.");
                break;
            case (3):
                System.out.println("Where we live. The only place we know of so far that’s inhabited by living things.");
                break;
            case (4):
                System.out.println("The planet where perseverance was launched and died.");
                break;
            case (5):
                System.out.println("Also known as the largest planet in the solar system.");
                break;
            case (6):
                System.out.println("Sixth planet from the Sun and the second-largest planet in our solar system.");
                break;
            case (7):
                System.out.println("Ice Giant? Seventh planet from the Sun, and has the third-largest diameter in our solar system.");
                break;
            case (8):
                System.out.println("The farthest considered planet in the solar system.");
                break;
                
            
        }
        
    }
    
    public static void choices() {
        
        System.out.println("\nChoose from the following!");
        System.out.println("[1] Mercury");
        System.out.println("[2] Venus");
        System.out.println("[3] Earth");
        System.out.println("[4] Mars");
        System.out.println("[5] Jupiter");
        System.out.println("[6] Saturn");
        System.out.println("[7] Uranus");
        System.out.println("[8] Neptune");
        
    }
    
    public static void main(String[] args) {
        
        startGuessGame();
        
    }
}

/*
https://www.britannica.com/place/Mercury-planet
https://solarsystem.nasa.gov/planets/venus/overview/
*/