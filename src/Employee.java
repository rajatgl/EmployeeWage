
public class Employee {
	static final int HOURLY_WAGE=20;
	int Is_Present=(int)((Math.random()*10)%2);
	int Is_FullTime=(int)((Math.random()*10)%2);
	
	//Method For getting employee attendance
	public void getEmployeeAttendance() 
	{
		if(Is_Present==1)
			System.out.println("present");
		else
			System.out.println("absent");
	}
	
	//Method for getting daily working hours
	public int getDailyWorkingHours()
	{
		int EmpHrs;
		if(Is_Present==1)
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.getEmployeeAttendance();
		System.out.println("Today's Employee Work Duration : "+emp.getDailyWorkingHours()+"hrs");
		System.out.println("Today's Employee Wage : " +emp.getDailyWorkingHours()*HOURLY_WAGE+"Rs");
	}

}
