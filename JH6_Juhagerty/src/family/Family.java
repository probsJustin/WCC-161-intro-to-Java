package family;

import java.util.* ; 

public class Family {
		List<Person> tempFamily = new ArrayList<Person>();
		
	public Family(){
	}
	public Family(int size_of_family){
		
	}
	public void addPerson(Person newPerson){
			if(Arrays.asList(tempFamily).contains(newPerson)){
				System.out.println("The Family Member Already Exists");
			}else{
				this.tempFamily.add(newPerson);
			}
		
	}
	public void printOutFamily(){
	for(Person Individual : tempFamily){
		System.out.println(Individual.toString());
	}
}

public static void main(String[] args)
 {
	 Family f = new Family(8);
	 Person fred= new Person("Fred Flintstone", 50);
	 System.out.println("created " + fred);
	 f.addPerson(fred);
	 f.addPerson(fred);
	 Student fredStudent = new Student("Fred Flintstone", 50, "Math",3.1);
	 System.out.println("created "+ fredStudent);
	 f.addPerson(fredStudent);
	 Person wilma = new Person("Wilma Flintstone", 48);
	 f.addPerson(wilma);
	 Student george= new Student("George", 21, "Politics", 3.1);
	 System.out.println("created " + george);
	 f.addPerson(george);
	 george.setName("Georgie");
	 f.addPerson(new Student("George", 21, "Politics", 3.1));
	
	 f.addPerson(new Student("John", 18, "Geology", 2.9));
	 f.addPerson(new Student("Jane", 21, "Music", 3.2));
	 f.addPerson(new Student("Tarzan", 22, "Gymnastics", 4.0));
	 f.addPerson(new Student("Jim", 21, "Physics", 2.5));
	 f.addPerson(new Person("Robert", 18));
	 f.addPerson(new Person("Clemente", 32));
	 System.out.println("****** family listing: ");
	 f.printOutFamily();
 }
}