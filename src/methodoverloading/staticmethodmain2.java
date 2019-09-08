package methodoverloading;

public class staticmethodmain2 {
	int a;
	static int b;
	
	public void test()
	{
		System.out.println("value of nonstatic var is" +a);
		System.out.println("value of static var is" +b);
	}
	
	public static void statictest()
	{
	//System.out.println("value of nonstatic var is" +a);
		System.out.println("value of static var is" +b);
	}

}
