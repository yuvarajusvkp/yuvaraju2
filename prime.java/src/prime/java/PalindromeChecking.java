package prime.java;

public class PalindromeChecking {

    public static void main(String[] args) {
        String inpstr = "AMMA"; 
        char[] inpArray = inpstr.toCharArray();  // Corrected the colon to semicolon
        char[] revArray = new char[inpArray.length]; 
        int j = 0; 
        
        // Reverse the input string
        for (int i = inpArray.length - 1; i >= 0; i--) {
            revArray[j] = inpArray[i];
            j++;
        }
        
        // Convert the reversed char array to string
        String revstr = String.valueOf(revArray);
        
        // Check if the original string is equal to the reversed string
        if (inpstr.equals(revstr)) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is not a Palindrome");
        }
    }
}

