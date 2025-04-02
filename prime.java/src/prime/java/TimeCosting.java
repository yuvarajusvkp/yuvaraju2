package prime.java;

public class TimeCosting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    
	
		        long startTime = System.nanoTime();  // Start time
		        
		        // Code whose execution time is to be measured
		        performTask();
		        
		        long endTime = System.nanoTime();  // End time
		        long duration = endTime - startTime;  // Duration in nanoseconds
		        
		        System.out.println("Execution Time: " + duration + " nanoseconds");
		    }
		    
		    public static void performTask() {
		        // Simulate a task
		        int sum = 0;
		        for (int i = 0; i < 1000000; i++) {
		            sum += i;
		        }
		    }
		

	}


