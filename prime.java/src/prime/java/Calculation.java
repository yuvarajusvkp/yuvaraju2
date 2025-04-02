package prime.java;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		class Factorial
		{
		public static void main(String args[])
		{
		int n,c, fact = 1;
		System.out.println("Enter a number");
		Scanner sct = new Scanner(System.in);
		n = sct.nextInt();
		if ( n < 0 )
		System.out.println("Number should be non-negative.");
		else
		{
		for ( c = 1 ; c <= n ; c++ )  // Calculating Factorial
		fact = fact*c;
		System.out.println("Factorial of "+n+" is = "+fact);
		}
		}
		}
	}

}
