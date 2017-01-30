package Java.com.lectures;

class Thing{
	public String name;
	public static String detail;
	final public static int LUCKY_NUMBER=7;
	static int count = 0;
	int ID;
	// Constructor
	public Thing(){
		ID = count;
		count++;
	}
	
	public void showName(){
		System.out.println(name);
		System.out.println(detail);
	}
	public static void getDetail(){
		System.out.println(detail);

	}
}



public class static_Work {

	public static void main(String[] args) {
		// Making Thing class objects.
		Thing thing1 = new Thing();
		
		
		// Non-static variables being called after instantiation. 
		thing1.name = "Bob"; // 
		
		// Calling static methods using class invokation.
		Thing.detail = "Some info ";
		//thing1.showName();
		//thing1.getDetail();
		//System.out.println(Thing.LUCKY_NUMBER);
		System.out.println("The number of object is:" + " " +Thing.count + " " + "with ID No. "+ thing1.ID);
		Thing thing2 =  new Thing();
		thing2.name = "Daud"; // 
		System.out.println("The number of object is:" + " " +Thing.count + " " + "with ID No. "+ thing2.ID);
		
		
		for(int i =0; i<20;i++){
			System.out.printf("Here is some text \t with digits %-2d \n ",i);
			
		}
	}

	
}
