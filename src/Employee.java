public class Employee {
	static final int HOURLY_WAGE=20;
	private int totalEmpHours = 0;
	private int totalMonthlyWage = 0;
	//Method For getting employee attendance
	public boolean getEmployeeAttendance()
	{
		return ((int)((Math.random()*10)%2)==1);
	}
	//Method for getting daily working hours
	public int getDailyWorkingHours()
	{
		int empHrs = 0;
		int isFullTime=(int)((Math.random()*10)%2);
		if(getEmployeeAttendance())
		{
			if(isFullTime==1)
				empHrs=12;
			else
				empHrs=8;
		}
		return empHrs;
	}
	//Method to get employee's day's wage
	public int getDailyWage(int hoursWorked)
	{
		return hoursWorked*HOURLY_WAGE;
	}
	//Method to get Total Employee Wage, Conditions Applied
	public int getTotalWage()
	{
		int dayOfMonth = 1;
		for(int day=1;day<=20;day++)
		{
			int hoursWorked = getDailyWorkingHours();
			if(hoursWorked == 0) {
				day--;
				continue;
			}
			//Handle corner case where employee hours slightly exceeds 100
			if(totalEmpHours + hoursWorked>=100) {
				hoursWorked = 100 - totalEmpHours;
				totalEmpHours += hoursWorked;
				totalMonthlyWage += getDailyWage(hoursWorked);
				totalEmpHours = 100;
				//Printing for Testing, Debugging and is verbose
				System.out.println("Day of Month: " + dayOfMonth + ", Work Day: " + day + ", Hours Worked: " + hoursWorked);
				break;
			}
			//Printing for Testing, Debugging and is verbose
			System.out.println("Day of Month: " + dayOfMonth + ", Work Day: " + day + ", Hours Worked: " + hoursWorked);
			totalEmpHours += hoursWorked;
			totalMonthlyWage += getDailyWage(hoursWorked);
			dayOfMonth++;
			if(dayOfMonth > 30)
				break;
		}
		return totalMonthlyWage;
	}
	private int getTotalEmployeeHours() {
		return totalEmpHours;
	}
	private int getTotalEmployeeMonthWage() {
		return totalMonthlyWage;
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		//Printing Total Wage after 20days
		System.out.println("Monthly Wage is: " + emp.getTotalWage() + ", Hours is: " + emp.getTotalEmployeeHours());
	}
}
