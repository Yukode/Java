import java.util.Scanner;

// Advance - Basic Calculator using Methods/Functions
public class BasicCalculatorWFunc {
    
    static Scanner scanner = new Scanner(System.in);
    static double theFirstNumber;
    static double theSecondNumber;
    
    public static void main(String[] args) {
        
        System.out.println("--------------------- CALCULATOR ---------------------");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        
        System.out.print("\nEnter Choice: ");
        int userChoice = Integer.parseInt(scanner.nextLine());
        
        System.out.println("------------------------------------------------------");
        
        if(userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4) {
            System.out.println("\t\t   Invalid Choice!");
            System.out.println("------------------------------------------------------");
            System.exit(0);
        }
        
        getUserInput();
        
        System.out.println();
        switch(userChoice) {
            case (1):
                addition(theFirstNumber, theSecondNumber);
                break;
            case (2):
                subtraction(theFirstNumber, theSecondNumber);
                break;
            case (3):
                multiplication(theFirstNumber, theSecondNumber);
                break;
            case (4):
                division(theFirstNumber, theSecondNumber);
                break;
        }
        System.out.println("------------------------------------------------------");
        
    }
    
    public static void getUserInput() {
        
        System.out.print("Enter First Number: ");
        theFirstNumber = scanner.nextDouble();
        
        System.out.print("Enter Second Number: ");
        theSecondNumber = scanner.nextDouble();
        
    }
    
    public static void addition(double firstNumber, double secondNumber) {
        System.out.println("Sum: " + (firstNumber + secondNumber));
    }
    
    public static void subtraction(double firstNumber, double secondNumber) {
        System.out.println("Difference: " + (firstNumber - secondNumber));
    }
    
    public static void multiplication(double firstNumber, double secondNumber) {
        System.out.println("Product: " + (firstNumber * secondNumber));
    }
    
    public static void division(double firstNumber, double secondNumber) {
        System.out.println("Quotient: " + (firstNumber / secondNumber));
    }
    
}