package zoo;
import java.util.*;

public abstract class Animal {
	String name; 
	public double weight; 
	public int age; 
	public Animal(){
		
	}
	public Animal(String tempName, double tempWeight, int tempAge){
		this.name = tempName; 
		this.weight = tempWeight; 
		this.age = tempAge;
	}
	public abstract void makeNoise();
	
	public double getWeight(){
		return this.weight;
	}
	public String toString(){
		String tempString;
		tempString = " Name: ";
		tempString += this.name;
		tempString += " Age: ";
		tempString += this.age;
		tempString += " Weight: ";
		tempString += this.weight;
		return tempString;
	}
}
