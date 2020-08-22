public class EmployeeWage
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to employee wage problem");
int empHrs=0;
                int empWage=0;
                int wagePerHour=20;

int randomCheck=(int) (Math.random()*10)%3;
switch(randomCheck)
		     {

		case 1:

			System.out.println("Employee is present");
			empHrs=8;
        case 2:
		  System.out.println("Employee is part time");
			empHrs=4;
break;
 default:

			System.out.println("Employee is absent");
				empHrs=0;
				break;
			}
			empWage=wagePerHour*empHrs;
		System.out.println("Employee daily wage:" + empWage);
}
	}
