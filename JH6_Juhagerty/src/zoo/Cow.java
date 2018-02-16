package zoo;
import java.util.*;

public class Cow extends Animal {
	private int num_spots;
	public Cow(){
		
	}
	public Cow(String name, double weight, int age, int num_spots){
		super(name, weight, age);
		this.num_spots = num_spots;
	}
	public void makeNoise(){
		System.out.println("Moooooo!");
	}
	public String toString(){
		String temp; 
		temp = " ";
		temp += this.num_spots;
		return temp;
	}
	

}
