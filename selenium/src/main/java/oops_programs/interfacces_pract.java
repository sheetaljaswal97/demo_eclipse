package oops_programs;


interface first_interface
{

	public void method1();
	
}
interface second_interface
{
	public void method2();
}

 class inter implements first_interface,second_interface
{

	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("first method");
		
	}

	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("second method");
		
	}
	
}

public class interfacces_pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter obj = new inter();
		obj.method1();
		obj.method2();

	}

}
