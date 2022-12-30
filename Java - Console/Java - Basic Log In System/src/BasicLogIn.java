// Basic Log-In System

import java.util.Scanner;

public class BasicLogIn {
    
    static Scanner scanner = new Scanner(System.in);
    static String correctUsername = "admin";
    static String correctPassword = "admin123";
    
    /*  - ONE WAY
        Prompts ONLY "Wrong Username and/or Password!" and doesn't show where
        the user went wrong during their input for username or password.
    */
    public static void wrongUsernameAndOrPassword() {
        
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        System.out.println();
        if(username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Log In Successful!");
        } else {
            System.out.println("Wrong Username and/or Password!");
        }
        
    }
    
    /*  - TWO WAY
        Prompts the user for where they went wrong.
        [1] If the user entered wrong username, the output will be "Username cannot be found!".
        [2] If the user entered wrong password, the output will be "Wrong Password".
    */
    public static void wrongUsernameOrPassword() {
        
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        System.out.println();
        if(username.equals(correctUsername)) {
            
            if(password.equals(correctPassword)) {
                System.out.println("Log In Successful!");
            } else {
                System.out.println("Wrong Password!");
            }
            
        } else {
            System.out.println("Username cannot be found!");
        }
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("------------------------- ONE WAY -------------------------");
        wrongUsernameAndOrPassword();
        
        System.out.println("------------------------- TWO WAY -------------------------");
        wrongUsernameOrPassword();
        
        System.out.println("-----------------------------------------------------------");
        
    }
    
}