package junit_training;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingimpTest {

	private Greeting greeting;

	@Before
	public void setup(){
		greeting = new Greetingmpl();
		System.out.println("Test implementation starting...");
	};
	
	@Test
	public void greetingShouldReturnValidOutput() {
		String result = greeting.greet("John");
		assertNotNull(result);
		assertEquals("Hello John", result);
		System.out.println("First test finished");
	}
	@Test(expected = IllegalArgumentException.class) // Expected parameter
	public void greetShouldThrowAnExceptionForNameIsNull(){
		greeting.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class) // Expected parameter
	public void greetShouldThrowAnExceptionForNameLengthZero(){
		greeting.greet("");
	}
	@After
	public void teadown(){
		greeting = null;
		System.out.println("Object deleted!");
	}

}
