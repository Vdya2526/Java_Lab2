package Lab2;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x = 100.1f, y = 200.5f;
		 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        float temp = x;
        x = y;
        y = temp;
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y); 
	    

	}

}
