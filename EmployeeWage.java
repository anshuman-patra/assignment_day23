public class EmployeeWage
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;

	public static void calculateEmployeeWage()
	{
		System.out.println("Welcome to employee wage problem");
                int empRatePerHour=20;
	        int numberOfWorkingDays=20;
		int empHrs=0;
                int totalSalary=0;
                int totalWorkingDays=0;
                int totalEmpHrs=0;
                int totalMaxEmpHrs=100;

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
                System.out.println("Total employee wage:" + totalSalary);
	}

	public static void main(String[] args)
	{
		calculateEmployeeWage();
	}
}

