package prime.java;

public class ArrayIndex {
	

		public static void main(String[] args) {
			int arr[]=new int[4]; 
			try
			{
				int i=arr[8];
				  System.out.println(i);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("whatever happen this line gets executed");
			}
			  
		}

	}


