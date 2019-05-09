package up_down_casting;

public class Class2 extends Class1 {
	
	public void method()
	{
		System.out.println("This is method1 of Class2");
	}
	
	public static void main(String[] args) {
		Class1 obj=new Class2();
		Class2 ob=(Class2)obj;
		ob.method();
	}

}
