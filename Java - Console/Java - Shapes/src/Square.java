import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Size: ");
        int size = scanner.nextInt();
        
        System.out.println();
        for(int a = 0; a < size; a++) {
            for(int b = 0; b < size; b++) {
                
                if((a == 0 || a == size - 1) || (b == 0 || b == size - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        
    }
}

/*

0 1 2 3
0 1 2 3
0 1 2 3
0 1 2 3

*/