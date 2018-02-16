package data_array;

public class MyDate {
	String month; 
	int day = 0,year = 0;
	

	public MyDate(String a, int b, int c){
	this.month = a;
	this.day = b;
	this.year = c;
	}
	
	public MyDate(){
		
	}
	

	public String toString(){
		String result;
		String a;
		int b,c;
		a = this.month; 
		b = this.day;
		c = this.year;
		result = a;
		result += " ";
		result += Integer.toString(b);
		result += ", ";
		result += Integer.toString(c);
		return result; 
	}
	
}

