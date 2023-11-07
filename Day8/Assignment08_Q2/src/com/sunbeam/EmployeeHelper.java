package com.sunbeam;

public class EmployeeHelper {
	public static double averageSalManagers(Employee[] arr)
	{
		double salary = 0;
		for( Employee e:arr)
		{
			if(e instanceof Labour)
			{
				Labour l = (Labour)e;
				salary = l.hours * l.rate;
				
					
			}
			
		}
		return salary;
		
	}
	
	public static double averageSalesman(Employee[] arr)
	{
		double salary = 0;
		for( Employee e:arr)
		{
			if(e instanceof Salesman)
			{
				Salesman s = (Salesman)e;
				salary = s.salary + s.comm;
				
					
			}
			
		}
		return salary;
		
	}
	
	public static double averageClerks(Employee[] arr)
	{
		double salary = 0;
		for( Employee e:arr)
		{
			if(e instanceof Clerk)
			{
				Clerk c = (Clerk)e;
				salary = c.salary;
				
					
			}
			
		}
		return salary;
		
	}


	
	

}