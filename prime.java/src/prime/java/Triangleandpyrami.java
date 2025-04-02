package prime.java;

import java.util.Scanner;

public class Triangleandpyrami {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter the N value (height of the pyramid):");
        int n = sc.nextInt();

        // Generate the pyramid pattern
        int s = 1;

        for (int i = 1; i <= n; i++) {
            // Print spaces for the pyramid shape
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            // Print the numbers for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(s++);
            }

            // Print a new line after each row
            System.out.println();
        }

        // Close the scanner
        sc.close();
    }
}
	


