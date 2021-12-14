

import java.util.Scanner;

public class EmpwageUC2
{

	static int present=0;
	static int abcent=0;
	static int part_time_days = 1;
	static int days;
	static String name;
	final static int rate =20;
	final static int emphrs = 8;
	final static int no_of_working_days = 2;
	private static final int Fixed_hrs = 0;
	static int totalwage=0;
	
	public static void EmployeeUC() 
	{
		
        Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the employee name :");  
	    name=sc.next(); 
	    System.out.print("Enter the days :");  
	    days=sc.nextInt();
	    
		System.out.println("The Employee name is : " + name);

		for (int i = 0; i <= days; i++) {
			double rand = Math.floor(Math.random() * 10 % 2);
			if (rand == 1) 
			{
				present++;
			} else if (rand == 0) 
			{
				abcent++;
			} else {
				break;
			}
		}
		System.out.println("Employee  present days  " + present);
		System.out.println("Employee  abscent days  " + abcent);
	}
	
	public static void Empcalwage() 
	{
		EmployeeUC();
		int Prwage = rate * emphrs * present;
		int Abwage = rate * emphrs * abcent; 
		System.out.println("The present empcalwage price :  "+Prwage);
		System.out.println("The absent empcalwage price is :  "+Abwage);
	}
	
	public static void main(String[] args) 
	{
		Empcalwage();
		
		
	}
}
