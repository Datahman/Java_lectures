package Java.com.lectures;


class Animal{
	// Declaration of  fields/ instance  variables of class Animal
	
	private String name;
	private int legs;

	// Set methods for the instance variables
	
	public void setName(String Somename){
		this.name = Somename;
	}
	
	public void setLegs(int Legs){
		this.legs = Legs;
	}
	
	// Get methods for the instance variables
	
	public String getName(){
		return name;
	}
	public int getLegs(){
		return legs;
	}
}


public class purcellClass {
	public static void main(String[] args){
		Animal someAnimal = new Animal();
		someAnimal.setName("Dog");
		System.out.println(someAnimal.getName());
		someAnimal.setLegs(4);
		System.out.println(someAnimal.getLegsxz());
	}
}
