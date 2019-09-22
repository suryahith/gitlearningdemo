package methodoverloading;

public class staticmethodmain {
	int a;
	static int b;
	
	public void test()
	{
		System.out.println("value of nonstatic var is" +a);
		System.out.println("value of static var is" +b);
		System.out.println("how are you doing");
	}
	
	public static void statictest()
	{
	//System.out.println("value of nonstatic var is" +a);
		System.out.println("value of static var is" +b);
	}

}
