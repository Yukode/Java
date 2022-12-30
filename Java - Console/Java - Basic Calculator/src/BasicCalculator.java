import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
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
        
        System.out.print("Enter First Number: ");
        double firstNumber = scanner.nextDouble();
        
        System.out.print("Enter Second Number: ");
        double secondNumber = scanner.nextDouble();
        
        System.out.println();
        switch(userChoice) {
            case (1):
                System.out.println("Sum: " + (firstNumber + secondNumber));
                break;
            case (2):
                System.out.println("Difference: " + (firstNumber - secondNumber));
                break;
            case (3):
                System.out.println("Product: " + (firstNumber * secondNumber));
                break;
            case (4):
                System.out.println("Quotient: " + (firstNumber / secondNumber));
                break;
        }
        
        System.out.println("------------------------------------------------------");
        
    }
}