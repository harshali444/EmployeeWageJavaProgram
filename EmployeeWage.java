public class EmployeeWage
{
    public static final int isParttime=1;
    public static final int isFulltime=2;
    
	private final String company;
	private final int EmpRatePerHr;
    private final int WorkingDays;
    private final int MaxHrsInMonth;

	public EmployeeWage(String company, int EmpRatePerHr, int WorkingDays, int MaxHrsInMonth)
	{
		this.company = company;
		this.EmpRatePerHr = EmpRatePerHr;
		this.WorkingDays = WorkingDays;
		this.MaxHrsInMonth = MaxHrsInMonth;
	}

	private int ComputeEmpWage() 
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
			System.out.println("Days:" + totalWorkingDays + " Emp Hr: " + empHrs );
			
		}
			return totalEmpHrs * EmpRatePerHr;
     }

	public static void main(String[] args)
	{
		EmployeeWage dMart = new EmployeeWage("DMart", 20, 20, 100);
		EmployeeWage Relience = new EmployeeWage("Relience", 30, 25, 80);
		System.out.println("Total emp Wage for company: " + dMart.company 
                                        + " is: " + dMart.ComputeEmpWage());
		System.out.println("Total emp Wage for company: " + Relience.company
                                        + " is: " + Relience.ComputeEmpWage());
	}
}

