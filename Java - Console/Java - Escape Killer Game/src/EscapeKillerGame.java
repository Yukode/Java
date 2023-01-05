import java.util.Scanner;

public class EscapeKillerGame {
    
    static Scanner scanner = new Scanner(System.in);
    static boolean died = false;
    
    public static void startEscapeKillerGame() {
        
        System.out.println("----------------------------------------------------");
        System.out.println("                    ESCAPE HOUSE                    ");
        System.out.println("----------------------------------------------------");
        System.out.println("[] Killer is going to enter the house.");
        System.out.println("[] Quick! Hide on one of the rooms!");
        System.out.println("\nInstructions:");
        System.out.println("[] Choose a part of the house where you will hide.");
        System.out.println("----------------------------------------------------");
        System.out.println("                       HOUSE:                       "); // Lazy to use \t here :>
        System.out.println("----------------------------------------------------");
        
        houseGuide();
        hiderChoice();
        
    }
    
    public static void hiderChoice() {
        
        int choice = 0;
        
        do {
            
            System.out.print("Enter Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            
        } while(choice < 1 || choice > 10);
        
        gameCheck(choice);
        
        
    }
    
    public static void gameCheck(int choice) {
        
        int killerChoice = 0;
        
        do {
            
            killerChoice = (int)(Math.random() * 11);
            
        } while(killerChoice < 1 || killerChoice > 10);
        
        System.out.println("----------------------------------------------------");
        System.out.println("                       STATUS                       ");
        System.out.println("----------------------------------------------------");
        if(choice == killerChoice) {
            
            System.out.println("[] You Died!");
            System.out.println("[] Killer entered the room you are in!");
            died = true;
            
        } else {
            
            System.out.println("[] You Escaped!");
            System.out.println("[] Killer did not enter the room you are in!");
            died = false;
            
        }
        System.out.println();
        
        actualHouse(choice, killerChoice);
        
    }
    
    public static void actualHouse(int choice, int killerChoice) {
        
        //             1    2    3    4    5    6    7    8    9    10
        String[] a = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
        String[] b = {"KILLER", "KILLER", "KILLER", "KILLER", "KILLER", "KILLER", "KILLER", "KILLER", "KILLER", "KILLER"};
        String[] c = {"YOU", "YOU", "YOU", "YOU", "YOU", "YOU", "YOU", "YOU", "YOU", "YOU"};
        
        for(int z = 0; z < a.length; z++) {
            if(z != (killerChoice - 1)) {
                a[z] = "X";
                b[z] = "XXXXXX";
                c[z] = "XXX";
            } else {
                c[z] = "   ";
            }
            
            if(z == (choice - 1)) {
                a[z] = " ";
                c[z] = "YOU";
                if(z != (killerChoice - 1)) {
                    b[z] = "      ";
                }
            }
        }
        
        System.out.println("+--------------+-----------+------------______------+");
        System.out.println("|"+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+"|"+a[1]+a[1]+b[1]+a[1]+a[1]+a[1]+"|                        |");
        System.out.println("|"+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+c[0]+a[0]+a[0]+a[0]+a[0]+a[0]+"|"+a[1]+a[1]+a[1]+a[1]+c[1]+a[1]+a[1]+a[1]+a[1]+"|                        |");
        System.out.println("|"+a[0]+a[0]+a[0]+a[0]+b[0]+a[0]+a[0]+a[0]+a[0]+"+-----------+                        |");
        System.out.println("|"+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+"|"+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+"|                        |");
        System.out.println("|"+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+"|"+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+"|      +-----------------+");
        System.out.println("+--------------+"+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+"|      |"+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+"|");
        System.out.println("|"+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+"|      |"+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+"|");
        System.out.println("|"+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+b[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+"+------+"+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+c[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+"|");
        System.out.println("|"+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+c[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+"|"+b[4]+"|"+a[3]+a[3]+a[3]+a[3]+a[3]+b[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+"|");
        System.out.println("|"+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+a[2]+"|"+a[4]+c[4]+a[4]+a[4]+"|"+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+"|");
        System.out.println("+---------+----------------+------+"+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+"|");
        System.out.println("|"+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+"|"+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+"|"+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+a[3]+"|");
        System.out.println("|"+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+"|"+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+c[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+"+-----------------+");
        System.out.println("|"+a[5]+a[5]+a[5]+c[5]+a[5]+a[5]+a[5]+"|"+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+b[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+"|"+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+"|");
        System.out.println("|"+a[5]+b[5]+a[5]+a[5]+"|"+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+"|"+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+"|");
        System.out.println("|"+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+"|"+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+a[6]+"|"+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+b[9]+a[9]+a[9]+a[9]+a[9]+a[9]+"|");
        System.out.println("|"+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+"+----------------+------+"+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+c[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+"|");
        System.out.println("|"+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+"|"+a[7]+a[7]+a[7]+a[7]+a[7]+b[7]+a[7]+a[7]+a[7]+a[7]+a[7]+"|"+b[8]+"|"+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+"|");
        System.out.println("|"+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+a[5]+"|"+a[7]+a[7]+a[7]+a[7]+a[7]+a[7]+a[7]+c[7]+a[7]+a[7]+a[7]+a[7]+a[7]+a[7]+"|"+a[8]+c[8]+a[8]+a[8]+"|"+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+a[9]+"|");
        System.out.println("+---------+----------------+------+-----------------+");
        
    }
    
    public static void houseGuide() {
        
        System.out.println("                                        KILLER     ");
        System.out.println("+--------------+-----------+------------______------+");
        System.out.println("|              |     2     |                        |");
        System.out.println("|              |           |                        |");
        System.out.println("|      1       +-----------+                        |");
        System.out.println("|              |           |                        |");
        System.out.println("|              |           |      +-----------------+");
        System.out.println("+--------------+           |      |                 |");
        System.out.println("|                          |      |                 |");
        System.out.println("|            3             +------+                 |");
        System.out.println("|                          |  5   |        4        |");
        System.out.println("|                          |      |                 |");
        System.out.println("+---------+----------------+------+                 |");
        System.out.println("|         |                       |                 |");
        System.out.println("|         |                       +-----------------+");
        System.out.println("|         |           7           |                 |");
        System.out.println("|    6    |                       |                 |");
        System.out.println("|         |                       |        10       |");
        System.out.println("|         +----------------+------+                 |");
        System.out.println("|         |        8       |   9  |                 |");
        System.out.println("|         |                |      |                 |");
        System.out.println("+---------+----------------+------+-----------------+");
        
        
    }
    
    public static void main(String[] args) {
        
        startEscapeKillerGame();
        
    }
}