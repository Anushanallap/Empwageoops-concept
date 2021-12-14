package EmpWageoops;

import java.util.Scanner;

public class EmpWageUC3 
{

	static int present=0;
	static int abcent=0;
	static int prt_time_days;
	static int days;
	static String name;
	final static int rate =20;
	final static int emphrs = 8;
	final static int part_time  = 4;
	final static int num_of_working_days = 2;
	private static final int Fixed_hrs = 0;
	static int totalwage=0;
	static int part_time_days1=0;
	
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
		System.out.println("Employee is present days for " + present);
		System.out.println("Employee is abscent days for " + abcent);
	}
	
	public static void Empcalwage() 
	{
		EmployeeUC();
		int Prwage = rate * emphrs * present;
		int Abwage = rate * emphrs * abcent; 
		System.out.println("The present empcalwage amount is :  "+Prwage);
		System.out.println("The abcent empcalwage amount is :  "+Abwage);
	}
	
	public static void EmpPartTime()
	{
		
		Empcalwage();
		for (int i = 0; i <= days; i++) {
			double rand = Math.floor(Math.random() * 10 % 3);
			if (rand == 1) 
			{
				present++;
			} else if (rand == 0) 
			{
				abcent++;
			} else if (rand == 1) 
			{
				prt_time_days++;
			}  
			else {
				break;
			}
		}
		
		System.out.println("Employee part time hrs " + prt_time_days);
		int totalpartval = rate * part_time * prt_time_days;
		System.out.println("The part time total amount is :  "+totalpartval);
	}
	
	public static void main(String[] args) 
	{
		EmpPartTime();
		
		
	}
}
