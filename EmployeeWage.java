public class EmployeeWage
{
public static void main(String[] args)
int empHrs=0;
		int empWage=0;
		int wagePerHour=20;

		System.out.println("Welcome to employee wage problem");

int fullTime=1;
		int randomCheck=(int) (Math.random()*10)%2;
		if(randomCheck==fullTime)
		{
			System.out.println("Employee is present");
			empHrs=8;
			}
		else
		{	
			System.out.println("Employee is absent");


				empHrs=0;
			}
			empWage=wagePerHour*empHrs;
		System.out.println("Employee daily wage:" + empWage);
}
}
