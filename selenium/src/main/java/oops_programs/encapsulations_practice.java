package oops_programs;


class first_encapsulations
{
	private int a;
	private int b;
	
	public void setvalue(int c,int d)
	{
		a=c;
		b=d;
		
	}
	public int getvalue()
	{
		int e=a+b;
		return e;
		
	}
}


public class encapsulations_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first_encapsulations obj = new first_encapsulations();
		obj.setvalue(10, 20);
		System.out.println(obj.getvalue());

	}

}
