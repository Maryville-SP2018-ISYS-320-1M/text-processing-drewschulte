import java.util.Scanner;

/*
	ISYS 320

	Name(s):drew schulte
	Date: april 8
*/

/* 2. Your pseudocode algorithm in here
 input any string
 count the number or e's in the string
 output a line that says how many e's there were 
 
 */


public class P2_CountAllEs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in );
		System.out.println("Write anything you can think of");
		String anything = console.nextLine();
		char someChar = "e"; 
		int count = 0; 
		for(int i = 0; i<anything.length(); i++) {
			if(anything.charAt(i) == someChar) {
				count++; 
			}
		}
		

	}

}
