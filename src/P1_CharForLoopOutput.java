/*
	ISYS 320

	Name(s):drew schulte
	Date: april 8
*/

/*
 Your expected results after the input is provided:
 
 1.efg
 2.nopqrs
 3. za - incorrect 
 4.qr
  
 */
public class P1_CharForLoopOutput {

	public static void main(String[] args) {
		// put your call to printRange below here
		printRange('q', 'r');
	}
	
	public static void printRange(char startLetter, char endLetter ) {
		for( char letter = startLetter; letter <= endLetter; letter++ ) {
			System.out.print( letter );
		}
		
		System.out.println();
	}

}
