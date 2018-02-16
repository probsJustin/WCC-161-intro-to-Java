package family;

import java.util.* ; 

public class Student extends Person {
	private String major; 
	private double gpa; 

	
	public Student(String newName, int newAge, String newMajor, double newGpa){
		super(newName, newAge);
		this.major = newMajor;
		this.gpa = newGpa;
	}
	public String toString(){
		
		String tempString = " Name:  ";
		tempString += this.name;
		tempString += " Age: ";
		tempString += this.age;
		tempString += " Major: ";
		tempString += this.major;
		tempString += " Gpa: ";
		tempString += Double.toString(this.gpa);
		return tempString;
	}
	public boolean equals(Student tempStudent){
		boolean tempBool;
		if(this == tempStudent){
			tempBool = true;
		}else{
			tempBool = false;
		}
		return tempBool;
	}
}
