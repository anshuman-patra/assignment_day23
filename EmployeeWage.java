public class EmployeeWage
{
public static void main(String[] args)
	{
int fullTime=1;
		int empHrs=0;
                int empWage=0;
                int wagePerHour=20;
                int partTime=2;
		int randomCheck=(int) (Math.random()*10)%3;
		if(randomCheck==fullTime)
		{
			System.out.println("Employee is present");
			empHrs=8;
			}
              else if(randomCheck==partTime)
		{
			empHrs=4;
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
