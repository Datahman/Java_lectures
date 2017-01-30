package Java.com.lectures;

class demo{
	String name;
	int value;
	// First constructor taking no argument
	public demo(){
		System.out.println("First constructor with no arguement running...");
	}
	// Second constructor taking one string arguement
	public demo(String someName){
		this.name = someName;
		System.out.println("Second constructor with one arguement running... with name"+" " +name);
		}
	
	
	// Constructor overloading 
	
	public demo(int someNum){
	
		this.value = someNum;
		System.out.println("Third constructor running..." + " Now with constructor overloading" );
		new demo();
		}

}


public class constructors_Demo {
	public static void main(String[] args){
		demo obj = new demo();	
		demo obj1 = new demo("Johnny");
		demo obj2 = new demo(3);
	}
}
