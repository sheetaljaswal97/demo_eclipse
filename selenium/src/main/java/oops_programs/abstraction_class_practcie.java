package oops_programs;


	
	
	abstract class first_abs
	{
		public void method_one()
		{
			System.out.println("method_one");
		}
		abstract void method_two();
	}
	
	class second_abs extends first_abs
	{

		@Override
		void method_two() {
			// TODO Auto-generated method stub
			System.out.println("method two that is abstract");
			
		}
		
	}
	public class abstraction_class_practcie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second_abs obj = new second_abs();
		obj.method_one();
		obj.method_two();
				
		

	}

}
