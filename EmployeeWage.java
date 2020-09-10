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

	public static void main(String[] args)
    {
		
		EmployeeWage dMart=new EmployeeWage("dMart", 20, 20, 100);

		int empHrs=0,empWage=0,TotalWage=0,totalWorkingDays=0,totalEmpHrs=0;

		while (totalEmpHrs <= dMart.MaxHrsInMonth && 
										totalWorkingDays < dMart.WorkingDays)
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
			empWage = empHrs * dMart.EmpRatePerHr;
			TotalWage += empWage;
			System.out.println("emp Wage: " + empWage);
		}
		System.out.println("Total emp Wage for company: "  +dMart.company + "is: " + TotalWage);
     }
}
