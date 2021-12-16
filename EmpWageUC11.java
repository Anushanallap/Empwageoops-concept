package EmpWageoops;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageUC11 {
	
		static int pr=0;
		static int ab=0;
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
		static String name1;
		static int ra, days1, count, Pr_wage1, Part_wage1, Ab_wage1;
//		static ArrayList<Employee> lst = new ArrayList<>();
		static Scanner sc = new Scanner(System.in);
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
					pr++;
				} else if (rand == 0) 
				{
					ab++;
				} else {
					break;
				}
			}
			System.out.println("Employee is present days for " + pr);
			System.out.println("Employee is abscent days for " + ab);
		}
		
		public static void Empcalwage() 
		{
			EmployeeUC();
			int Prwage = rate * emphrs * pr;
			int Abwage = rate * emphrs * ab; 
			System.out.println("The present empcalwage amount is :  "+Prwage);
			System.out.println("The absent empcalwage amount is :  "+Abwage);
		}
		
		public static void EmpPartTime()
		{
			
			Empcalwage();
			for (int i = 0; i <= days; i++) {
				double rand = Math.floor(Math.random() * 10 % 3);
				if (rand == 1) 
				{
					pr++;
				} else if (rand == 0) 
				{
					ab++;
				} else if (rand == 2) 
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
		
		public static void EmpSwitchcase() {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the employee name :");
			name = sc.next();
			System.out.print("Enter the days :");
			days = sc.nextInt();

			System.out.println("The Employee name is : " + name);
			for (int i = 0; i <= days; i++) {
				int Empcheck = (int) Math.floor(Math.random() * 10) % 3;

				switch (Empcheck) {
				case 0:
					ab++;
					break;
				case 1:
					pr++;
					break;
				case 2:
					part_time_days1++;

				}
			}
//			int empwage = emphrs * rate ;
//			System.out.println("The empwage is: "+empwage);

			int empwage = rate * emphrs * pr;
			int partwage = rate * part_time_days1 * part_time;
			int abwage = rate * emphrs * ab;
			System.out.println(pr);
			System.out.println(ab);
			System.out.println(part_time_days1);
			System.out.println("The present wage day amount is :" + empwage);
			System.out.println("The absent days is amount is : " + abwage);
			System.out.println("The part time days wage amount is : " + partwage);
			
			pr = 0;
			part_time_days1 =0;
			ab = 0;

		}

		public static void EmpCalMon() 
		{
			EmpSwitchcase();
		}
		
		public static void CalWagetotaluc6() {

			EmpCalMon();
			int totaldays=(Fixed_hrs*pr)+(part_time*part_time_days1);
			System.out.println("the total days value "+totaldays);
		}
		
		public static void MultipleComp() {
		String name;
		int ra, days, count;

		Scanner sc = new Scanner(System.in);
		System.out.print("How many companies :");
		count = sc.nextInt();

		for (int c = 1; c <= count; c++) {

			System.out.print("\n\nEnter the company name :");
			name = sc.next();
			System.out.print("Enter number of working days :");
			days = sc.nextInt();
			System.out.print("Enter employee wage rate :");
			ra = sc.nextInt();
			System.out.println("\nThe company name is : " + name);

			for (int i = 1; i <= days; i++) {
				int emp = (int) Math.floor(Math.random() * 10 % 3);
				switch (emp) {
				case 0:
					ab++;
					break;
				case 1:
					pr++;
					break;
				case 2:
					part_time_days1++;
					break;

				} 

			} 
			int prwage = ra * emphrs * pr;
			int partwage = ra * part_time * part_time_days1; 
			int abwage = ra * emphrs * ab; 
		
			System.out.println("The present days wage amount is : " + prwage);
			System.out.println("The absent days is wage amount is : " + abwage);
			System.out.println("The part time days wage wage amount is :" + partwage);
					
		}
	}
		public static void TotalWageuc9() 
		{
			MultipleComp();
		}

		class Employee {

			String name1;
			int Ab_wage1;
			int Part_wage1;
			int Pr_wage1;
			int pr;
			int ab;
			int part_time_days1;
			int ra;

			public Employee(String name1, int ra, int pr, int part_time_days1, int ab, int Pr_wage1,
					int Part__wage1, int Ab_wage1)
			{
				this.name1 = name1;
				this.ra = ra;
				this.pr = pr;
				this.part_time_days1 = part_time_days1;
				this.ab = ab;
				this.Pr_wage1 = Pr_wage1;
				this.Part_wage1 = Part_wage1;
				this.Ab_wage1 = Ab_wage1;
			}

			public void Display() 
			{
				System.out.println("\nCompany Name : " + name1 + "\nPrasent days : " + pr + "\nPartTime days : "
						+ part_time_days1 + "\nAbsent days : " + ab + "\nPresent_wage1 : " + Pr_wage1
						+ "\nPart_Time_wage1 : " + Part_wage1 + "\nAbsent_wage1 : " + Ab_wage1);

			}
		}
		
		public static void EmpArray() {

			int count = 0;
			Scanner sc = new Scanner(System.in);

			System.out.print("Press the number of companies :");
			count = sc.nextInt();
			for (int j = 1; j <= count; j++) {
				System.out.print("\n\nEnter the company name :");
				name1 = sc.next();
				System.out.print("Enter number of working days :");
				days = sc.nextInt();
				System.out.print("Enter employee wage rate :");
				ra = sc.nextInt();
				System.out.println("\nThe company name is : " + name1);

				for (int i = 1; i <= days; i++) {
					int emp1 = (int) Math.floor(Math.random() * 10 % 3);
					switch (emp1) {
					case 0:
						ab++;
						break;
					case 1:
						pr++;
						break;
					case 2:
						part_time_days1++;
						break;

					}

				}
				Pr_wage1 = ra * emphrs * pr;
				Part_wage1 = ra * part_time * part_time_days1;
				Ab_wage1 = ra * emphrs * ab;

				EmpWageUC11 emp = new EmpWageUC11();
				Employee[] arr = new Employee[count];

				arr[j - 1] = emp.new Employee(name1, ra, pr, part_time_days1, ab, Pr_wage1, Part_wage1, Ab_wage1);
				System.out.print("\n");
				arr[j - 1].Display();

				pr = 0;
				ab = 0;
				part_time_days1 = 0;
			}
		}
		
		public static void EmpArrList() 
		{
			Scanner sc = new Scanner(System.in);
			EmpWageUC11 emp = new EmpWageUC11();
			
			ArrayList<Employee> lst = new ArrayList<>();
			System.out.print("Press the number of companies  :");
			count = sc.nextInt();

			for (int j = 1; j <= count; j++) {
				System.out.print("\n\nEnter the company name :");
				name1 = sc.next();
				System.out.print("Enter number of working days :");
				days = sc.nextInt();
				System.out.print("Enter employee wage rate :");
				ra = sc.nextInt();
				System.out.println("\nThe company name is : " + name1);

				for (int i = 1; i <= days; i++) {
					int val = (int) Math.floor(Math.random() * 10 % 3);
					switch (val) {
					case 0:
						ab++;
						break;
					case 1:
						pr++;
						break;
					case 2:
						part_time_days1++;
						break;

					}

				}
				Pr_wage1 = ra * emphrs * pr;
				Part_wage1 = ra * part_time * part_time_days1;
				Ab_wage1 = ra * emphrs * ab;
				
				Employee Data = emp.new Employee(name1, ra, pr, part_time_days1, ab, Pr_wage1, Part_wage1, Ab_wage1);
				lst.add(Data);
				pr = 0;
				ab = 0;
				part_time_days1 = 0;
			}
			
			for (Employee em : lst) 
			{
				em.Display();
			}

		}
		
		public static void StoreData() 
		{
			EmpArrList();
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			EmpArrList();
			
			
		}
	}


