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
	    
	    System.out.println(sitter.getStartTime());
	
	
	
	
	}
	

}
