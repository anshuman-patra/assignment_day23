public class EmployeeWage
{
public static void main(String[] args)
	{
		System.out.println("Welcome to employee wage problem");

int fullTime=1;
		int randomCheck=(int) (Math.random()*10)%2;
		if(randomCheck==fullTime)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
}
}
