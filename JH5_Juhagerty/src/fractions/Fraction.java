package fractions;

import java.util.*;

public class Fraction {
	private static final boolean False = false;
	private static final boolean True = false;
	private Scanner scan = new Scanner(System.in);
	private int num = 1;
	private int denom = 1;
	
	public Fraction(){
		
	}

	public Fraction(int n, int d) {
		num = n;
		denom = d; 
	}
	public void setFraction(int n, int d) {
		this.denom = d;
		this.num = n; 
	}

	public Fraction add(Fraction op) {
		int a,b,c,d,e,f;
		a = this.num;
		b = this.denom;
		c = op.num;
		d = op.denom;
		e = a*d+b*c;
		f = b*d; 
		Fraction newFraction = new Fraction(e,f);
		return newFraction;
		// Fill in code ... don't forget to reduce
		// Algebra HINT: a/b + c/d = (a*d + b*c)/(b*d)
	}

	public Fraction subtract(Fraction op) {
		int a,b,c,d,e,f;
		a = this.num;
		b = this.denom;
		c = op.num;
		d = op.denom;
		e = a*d - b*c;
		f = b*d;
		Fraction newFraction = new Fraction(e,f);
		return newFraction;
		// Fill in code ... don't forget to reduce
		// Algebra HINT: a/b - c/d = (a*d - b*c)/(b*d)
	}

	public Fraction multiply(Fraction op) {
		int a,b,c,d,e,f;
		a = this.num;
		b = this.denom;
		c = op.num;
		d = op.denom;
		e = a*c;
		f = b*d;
		Fraction newFraction = new Fraction(e,f);
		return newFraction;
		// Fill in code ... don't forget to reduce
		// Algebra HINT: a/b * c/d = (a*c)/ (b*d)
	}

	public Fraction divide(Fraction op) {
		int a,b,c,d,e,f;
		a = this.num;
		b = this.denom;
		c = op.num;
		d = op.denom;
		e = a*d;
		f = b*c;
		Fraction newFraction = new Fraction(e,f);
		return newFraction;
		// Fill in code ... don't forget to reduce
		// Algebra HINT: a/b / c/d = (a*d)/ (b*c)
	}

	private Fraction reduce(Fraction op) {
		// Pseudo code:
		// set smaller = minimum ( abs(num), abs(denom));
		// Loop through the possible divisors: 2, 3, 4, ... smaller
		// For each possible divisor:
		// while (num and denom are evenly divisible by divisor)
		// {
		// num /= divisor;
		// denom /= divisor;
		// smaller /= divisor;
		// }
		int a = 0,b = 0;
		while(this.num % 2 > 0 && this.denom % 2 > 0 | this.num % 3 > 0 && this.denom % 3 > 0){
			
			a = this.num;
			b = this.denom;
			if(a% 2 > 0 && b % 2 > 0){
				a= a/2;
				b = b /2;
			}
			if(a% 3 > 0 && b % 3 > 0){
				a= a/ 3;
				b = b / 3;
			}
		}
		Fraction newFraction = new Fraction(a,b);
		return newFraction;
	}

	public boolean equals(Fraction f) {
		double doubleA,doubleB;
		boolean yesOrNo;
		doubleA = f.num / f.denom;
		doubleB = this.num / this.denom;
		if(doubleA == doubleB){
			yesOrNo = true;
		}else{
			yesOrNo = false; 
		}
		return yesOrNo;
	}

	public String toString() {
		String bufferString = " "; 
		bufferString += Integer.toString(this.num); 
		bufferString += "/";
		bufferString += Integer.toString(this.denom); 
		return bufferString;
	}

	public void readin(String label)
	 {
	 while (true) // Keep trying if bad input is received
	 {
	 System.out.print(label);
	 String temp = scan.next();
	 temp = temp.trim(); // get rid of white space at the beginning and end
	 int index = temp.indexOf('/');
	 if (index >= 0)
	 {
	 String numStr = temp.substring(0, index);
	 String denomStr = temp.substring(index+1);
	 int n = Integer.parseInt(numStr);
	 int d = Integer.parseInt(denomStr);
	 this.setFraction(n,d);
	 return;
	 }
	 else
	 System.out.println("Input Fraction missing / ");
	 }//Keep trying until you get it right
	 }

	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		Fraction f3 = null;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(); // Add a blank line
			System.out.print("Enter operation: + - * / q (q ==> quit) : ");
			String input = scan.next();
			if (input.charAt(0) == 'q')
				break; // All done

			f1.readin("Enter Fraction 1: ");
			f2.readin("Enter Fraction 2: ");
			System.out.println("f1 = " + f1);
			System.out.println("f2 = " + f2);

			if (f1.equals(f2))
				System.out.println("f1 and f2 are equal");
			else
				System.out.println("f1 and f2 are not equal");

			switch (input.charAt(0)) {
			case '+':
				f3 = f1.add(f2);
				System.out.println("f1+f2=" + f3);
				break;
			case '-':
				f3 = f1.subtract(f2);
				System.out.println("f1-f2=" + f3);
				break;
			case '*':
				f3 = f1.multiply(f2);
				System.out.println("f1*f2=" + f3);
				break;
			case '/':
				f3 = f1.divide(f2);
				System.out.println("f1/f2=" + f3);
				break;
			default:
				System.out.println("Illegal command: " + input);
				break;
			}
		} // end of while loop
		System.out.println("Bye");

	} // end of main
}