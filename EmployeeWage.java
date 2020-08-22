public class EmployeeWage
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;

	public static void calculateEmployeeWage(String company, int empRatePerHour, int numberOfWorkingDays, int totalMaxEmpHrs)
	{
		System.out.println("Welcome to employee wage problem");
		int empHrs=0;
                int totalSalary=0;
                int totalWorkingDays=0;
                int totalEmpHrs=0;

                while(totalWorkingDays<numberOfWorkingDays && totalEmpHrs<totalMaxEmpHrs)
                {
                        totalWorkingDays++;
                        int randomCheck=(int) (Math.random()*10)%3;
                        switch(randomCheck)
                        {
                                case FULL_TIME:
                                        empHrs=8;
                                        break;
                                case PART_TIME:
                                        empHrs=4;
                                        break;
                                default:
                                        empHrs=0;
                        }
                        totalEmpHrs=totalEmpHrs+empHrs;
                }
                totalSalary=totalEmpHrs*empRatePerHour;
                System.out.println("Total employee hours:" + totalEmpHrs);
                System.out.println("Total employee wage for employee at " + company + " is " + totalSalary);
	}

	public static void main(String[] args)
	{
		calculateEmployeeWage("Dmart",20,15,80);
		calculateEmployeeWage("BigBasket",25,20,100);
		calculateEmployeeWage("Reliance",30,25,120);
	}
}
