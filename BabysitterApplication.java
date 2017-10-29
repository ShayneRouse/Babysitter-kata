package babysitter;

import java.util.Scanner;

public class BabysitterApplication {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Babysitter sitter = new Babysitter();
		
		System.out.println("Enter your start time: ");
		
		sitter.setStartTime(scan.nextInt());
	}
	

}
