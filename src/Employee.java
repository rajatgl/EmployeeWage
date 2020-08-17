
public class Employee {
	static final int HOURLY_WAGE=20;
	
	
	static int Total_Emp_Hrs=0;
	static int Total_Monthly_Wage=0;
	//Method For getting employee attendance
	public boolean getEmployeeAttendance() 
	{
		int Is_Present=(int)((Math.random()*10)%2);
		if(Is_Present==1)
			return true;
		else
			return false;
	}
	
	//Method for getting daily working hours
	public int getDailyWorkingHours()
	{
		int EmpHrs;
		int Is_FullTime=(int)((Math.random()*10)%2);
		if(getEmployeeAttendance())
		{
			if(Is_FullTime==1)
				EmpHrs=12; 
			else
				EmpHrs=8;
		}
		else
			EmpHrs=0;
		return EmpHrs;
	}
	
	//Method to get employee's day's wage
	public int getDailyWage()
	{
		return getDailyWorkingHours()*HOURLY_WAGE;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		//System.out.print("Employee Attendance : ");
		//if(emp.getEmployeeAttendance())
		//	System.out.println("present");
		//else
		//	System.out.println("absent");
		//System.out.println("Today's Employee Work Duration : "+emp.getDailyWorkingHours()+"hrs");
		//System.out.println("Today's Employee Wage : " +emp.getDailyWage()+"Rs");
		//Printing Total Wage after 20days
		for(int day=1;day<=20;day++)
		{
			emp.getDailyWage();
			Total_Monthly_Wage+=emp.getDailyWage();
		}
		System.out.println(Total_Monthly_Wage);
	}

}
