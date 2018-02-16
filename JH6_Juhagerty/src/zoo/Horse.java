package zoo;
import java.util.*;

public class Horse extends Animal{
	private double top_speed;
	public Horse(){
		
	}
	public Horse(String name, double weight, int age, double top_sepeed){
		super(name, weight, age);
		this.top_speed = top_speed;
	}
	public void makeNoise(){
		System.out.println("Whinny");
	}
	public String toString(){
		String temp = " ";
		temp = Double.toString(this.top_speed);
		return temp;
	}
}
