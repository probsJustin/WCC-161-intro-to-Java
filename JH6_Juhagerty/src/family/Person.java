package family;

public class Person{
	protected String name; 
	protected int age;
	public Person(){
		
	}
	public Person(String tempName, int tempAge){
		this.name = tempName;
		this.age = tempAge;
	}
	
	public void setName(String tempName){
		this.name = tempName;
		
	}
	public String toString(){
		String tempString = " Name: ";
		tempString += this.name; 
		tempString += " Age: ";
		tempString += Integer.toString(this.age);
		return tempString;
	}
	
	public boolean equals(Person tempPerson){
		boolean tempBool;
		if(this == tempPerson){
			tempBool = true;
		}else{
			tempBool = false;
		}
		return tempBool;
	}

}
