package Lab2;

public class Program3 {
	String name;
	int age;
	int salary;
	
	public void Program3(int age,int name)
	{
		this.name="vinu";
		this.age=25;
		System.out.println("name of the employee is"+name);
		System.out.println("age of the employee is"+age);
		
	}

	void display(String name,int age)
	{
		
		System.out.println("name of the employee is " +name);
		System.out.println("age of the employee is " +age);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Program3 p3=new Program3();
		p3.display("vidya",24);
		
		

	}

}
