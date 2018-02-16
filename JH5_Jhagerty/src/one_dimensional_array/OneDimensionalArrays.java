package one_dimensional_array;

import java.util.Scanner;

public class OneDimensionalArrays {
	public OneDimensionalArrays(){
		
	}

	int[] createIntegers(int size_of_array) {
		int[] returnArray = new int[size_of_array];
		int a = 0;
		for(int i = 0; i < returnArray.length; i++){
			returnArray[i] = a;
			a = a + 100; 
		}
		return returnArray;
		// ******* FILL IN CODE *********
		// Your code will create an array of ints as large as specified in
		// size_of_array
		// Fill the array in with the values: 0, 100, 200, 300, ....
		// Return the array that you just created
	}

	static void printArray(int[] myArray) {
		// ******* FILL IN CODE *********
		// Print out your array with one number per line. Get the size of the
		// array from the "myArray" parameter (no hard coding the size)
		for(int i = 0; i < myArray.length; i++){
			System.out.println(Integer.toString(myArray[i]));
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter size of array to create: ");
		int num = keyboard.nextInt();
		OneDimensionalArrays Arr1 = new OneDimensionalArrays();
		int[] newArray = Arr1.createIntegers(num); 
		printArray(newArray);
	
		// ******* FILL IN CODE *********
		// Construct an instance of the OneDimensionalArrays class
		// Using this object instance, call createIntegers to create
		// an array of integers. Don't forget to save the results
		// Then call the printArray method to print out the contents
		// of your array.
		keyboard.close();
	}
}
