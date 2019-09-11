package methodoverloading;



class ParentClass
{
	int num=100;
}

public class subclass extends ParentClass{
	int num=200;
	
	void printname()
	{
		System.out.println("value of variable in childclass"+num);
		System.out.println("Value of variable in parent class"+super.num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
