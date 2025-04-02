package prime.java;

public class Reverse {


		// TODO Auto-generated method stub
		   
		      
			    public static void main1(String args[]) 
			    { 
			     String string = "Welcome to Java Programming and Dotnet Programming"; 
			     String[] wordsCount = string.split(" "); 
			      
			     System.out.println("The Given String is:\n" + string + "\n"); 
			     System.out.println("After Reverse String is:"); 
			      
			     for(int i = wordsCount.length;i > 0;i--) 
			     { 
			      System.out.print(wordsCount[i - 1] + " "); 
			      } 
			     
			    

	}

}
