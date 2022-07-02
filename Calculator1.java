import java.util.*;

public class Calculator1 {

	int a,b;
	
	public void add(int a, int b) 
	{
		System.out.println(a+b);
	}
	
	public void sub(int a, int b) 
	{
		System.out.println(a-b);
	}
	
	public void mult(int a, int b) 
	{
		System.out.println(a*b);
	}
	
	public void div(int a, int b) 
	{
		System.out.println(a/b);
	}
	
	public void mod(int a, int b) 
	{
		System.out.println(a%b);
	}
	
	public static void main(String[] args) {

		Calculator1 cal =new Calculator1();
		
		cal.add(40, 70);
		cal.sub(50, 25);
		
		cal.mult(10,10);
		
		cal.div(80, 20);
		
		cal.mod(20, 9);
		
	}

}
