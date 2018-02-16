package string_array; 
import java.util.*;

public class string_array {

	
	public static void main(String[] args) {

		String[] firstNames = {"George", "Fred", "Sam", "Mary", "Sarah", "Bella", "Joy", "Rita", "Marta", "Sue", "Nancy"};
		
		
		Scanner scan = new Scanner(System.in);
		
		for ( int i = firstNames.length-1; i > -1; i = i - 1){
			System.out.print(firstNames[i]);
			System.out.print(" ");
			
			
		}
		
		//System.out.print(firstNames[0]);
		String test = scan.nextLine();
		System.out.print(test);
		scan.close();

	}

}
