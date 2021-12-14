package EmpWageoops;

import java.util.Scanner;

public class EmpwageUC1{ 


	static int present=0;
	static int abcent =0;
	static int days;
	static String name;
	

public static void main(String[] args)
{
	
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the employee name :");  
    name=sc.next();
    
    System.out.print("Enter the days :");  
    days=sc.nextInt();
    

	for (int i = 0; i <= days; i++) {
		double rand = Math.floor(Math.random() * 10 % 2);
		if (rand == 1) 
		{
			present ++;
		} else if (rand == 0) 
		{
			abcent ++;
		} else {
			break;
		}
	}
	System.out.println("Employee is present days for " + present);
	System.out.println("Employee is abscent days for " + abcent);
}
	
}
