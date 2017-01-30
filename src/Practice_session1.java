
public class Practice_session1 { 
	
	public static void print()
	{
	System.out.println("Testing addition of numbers");	
	}
	
	public static void main(String[] args) 
	{
	print();	
	Add(3,2);
	tables(3);
	}

	public static void tables(int x)
	{
		for(int u=2; u<5; u++)
		{
			System.out.println(x * u);
		}
	}
	
	public static void Add(int a, int b)
	{
		int c = a + b;
		System.out.println(c);
	}
}