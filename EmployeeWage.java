public class EmployeeWage
{
    public static final int isParttime=1;
    public static final int isFulltime=2;
    public static final int EmpRatePerHr=20;
	public static final int WorkingDays=20;
	public static final int MaxHrsInMonth=100;

	public static void main(String[] args)
    {

		int empHrs=0,empWage=0,TotalWage=0,totalWorkingDays=0,totalEmpHrs=0;

		while (totalEmpHrs <= MaxHrsInMonth && 
										totalWorkingDays < WorkingDays)
		{
			totalWorkingDays++;
			double empcheck=Math.floor(Math.random()*10)%3;
			switch ((int)empcheck) {

				case isFulltime:
    	    		empHrs = 8;
					break;
				case isParttime:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			empWage = empHrs * EmpRatePerHr;
			TotalWage += empWage;
			System.out.println("emp Wage: " + empWage);
		}
		System.out.println("Total emp Wage: " + TotalWage);
     }
}
