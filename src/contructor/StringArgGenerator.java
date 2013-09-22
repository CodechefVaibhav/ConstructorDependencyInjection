package contructor;

import java.util.Scanner;

public class StringArgGenerator {

	private int myAge =0 ;
	public StringArgGenerator()
	{
		 System.out.println("Inside StringArgGenerator constructor." );
	}
	
	public void display()
	{
		System.out.println("displaying from StringArgGenerator");
	}
	
	public void setMyAge(int myAge)
	{
		this.myAge = myAge;
	}
	
	public int getMyAge()
	{
		System.out.println(myAge);
		return myAge;
	}
	
	public void strInitMethod()
	{
		System.out.println("init method called of stringarggenerator class just after its object instantiation");
		System.out.println("Enter the age to set");
		Scanner sc = new Scanner(System.in);
		myAge = sc.nextInt();
		
		//illogical to call
		setMyAge(myAge);
	}
}
