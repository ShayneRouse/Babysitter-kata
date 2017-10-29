package babysitter;

import java.util.Scanner;

public class BabysitterApplication {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Babysitter sitter = new Babysitter();
		
		
		
		System.out.println("Enter your start time: ");
		
		sitter.setStartTime(scan.nextInt());
		
	    while(sitter.getStartTime()<17 && sitter.getStartTime()>4) {
	    	
	    	System.out.println("Shift can't start before 17:00/5:00pm");
	    	sitter.setStartTime(scan.nextInt());
	    }
	    
	    System.out.println("Your shift started at " + sitter.getStartTime());
	    
	
		System.out.println("Enter time your shift finished: ");
		
		sitter.setEndTime(scan.nextInt());
		
	    while(sitter.getEndTime()>4 && sitter.getEndTime()<17) {
	    	
	    	System.out.println("Shift can't go past 4:00/4:00am");
	    	sitter.setEndTime(scan.nextInt());
	    }
	    
	    System.out.println("Your shift ended at " + sitter.getEndTime());
	    

		System.out.println("Enter time child went to bed: ");
		
		sitter.setBedTime(scan.nextInt());
		
	    System.out.println("Child went to bed at " + sitter.getBedTime());
	    
	    System.out.println("You earned: $" + sitter.payAmount());
	
	}


}
