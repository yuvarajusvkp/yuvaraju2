package prime.java;

import java.util.Scanner;

public class Count {

    // Method to count occurrences of characters in a string
    static final int MAX_CHAR = 256;

    static void getOccuringChar(String str) {
        int count[] = new int[MAX_CHAR];  // Array to store character counts
        int len = str.length();  // Length of the string

        // Loop through the string and count each character's occurrence
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }

        // Loop through the string to print the occurrences
        for (int i = 0; i < len; i++) {
            char currentChar = str.charAt(i);
            int find = 0;

            // Count occurrences of the character only if it hasn't been printed already
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    find++;
                }
            }

            // Print the occurrence count if it's the first time the character appears
            if (find == 1) {
                System.out.println("Number of Occurrences of " + currentChar + " is: " + count[currentChar]);
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read a string from user input
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        // Call the function to print occurrences of characters
        getOccuringChar(str);
        
        sc.close();  // Close the scanner
    }
}