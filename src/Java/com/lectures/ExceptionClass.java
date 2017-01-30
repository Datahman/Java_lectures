// A non-working class to demonstrate exception within the class
package Java.com.lectures;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class ExceptionClass {
	
	private List<Integer> list; 
	private static final int SIZE = 10;
	
	public  void ListOfNumbers() {
		list = new ArrayList<Integer>(SIZE);
		for (int i=0; i<SIZE; i++){
			list.add(new Integer(i));
		}
	}
	public static void main(String[] args){
		 ExceptionClass obj = new ExceptionClass();
	}
}
