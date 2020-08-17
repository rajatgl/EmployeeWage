
public class EmployeeAttendance
{
public static void main(String[] args) 
	{
		//Generates a random value, either 0 or 1
		int randomCheck=(int)((Math.random()*10)%2);
		System.out.println(randomCheck);
		
		//Randomly decides whether employee is present or absent
		int IS_PRESENT=randomCheck;
		if(IS_PRESENT==0)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");	
	}
}