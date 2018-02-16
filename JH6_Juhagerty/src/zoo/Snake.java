package zoo;
import java.util.*;

public class Snake extends Animal{
private int num_fangs;
public Snake(){
	
}
public Snake(String name, double weight, int age, int num_fangs){
	super(name, weight, age);
	this.num_fangs = num_fangs; 
}
public void makeNoise(){
	System.out.println("HSSSSSSSSS");
}
public String toString(){
	String temp; 
	temp = Integer.toString(num_fangs);
	return temp; 
}
}
