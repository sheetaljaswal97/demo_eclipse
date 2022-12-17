package oops_programs;

class first_methodoverriding
{
	public void method()
	{
		System.out.println("method first");
	}
}

class second_methodoverriding extends first_methodoverriding
{
	public void method()
	{
		super.method();
		System.out.println("method second");
	}

}

public class polymorphism_methodoverrding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second_methodoverriding obj = new second_methodoverriding();
		obj.method();

	}

}
