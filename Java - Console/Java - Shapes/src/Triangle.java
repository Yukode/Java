import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Size: ");
        int size = scanner.nextInt();
        
        System.out.println();
        for(int a = 0; a < size; a++) {
            for(int b = 0; b < size; b++) {
                
                if(a >= b) {
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
        
        System.out.println();
        for(int a = size; a >= 0; a--) {
            for(int b = size; b >= 0; b--) {
                
                if(a > b) {
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
        
    }
}

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

        5
      4 5 4
    3 4 5 4 3
  2 3 4 5 4 3 2
1 2 3 4 5 4 3 2 1
*/