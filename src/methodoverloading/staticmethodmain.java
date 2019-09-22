package methodoverloading;

public class staticmethodmain {
	int a;
	static int b;
	
	public void test()
	{
		System.out.println("value of nonstatic var is" +a);
		System.out.println("value of static var is" +b);
		for (int i=0;i<34;i++)
		{System.out.println("Surya");
			
		}
	}
	
	public static void statictest()
	{
	//System.out.println("value of nonstatic var is" +a);
		System.out.println("value of static var is" +b);
	}

}
