package oops_programs;


class method_overloading
{
	public void method()
	{
		System.out.println("Method one");
	}
	public void method(String first)
	{
		System.out.println("second method " +first);
	}
}

public class polymorphism_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_overloading obj = new method_overloading();
		obj.method();
		obj.method("second");

	}

}
