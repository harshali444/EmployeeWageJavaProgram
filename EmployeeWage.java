public class EmployeeWage
{
    public static final int isParttime=1;
    public static final int isFulltime=2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWage() {
	companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyEmpWage(String company, int EmpRatePerHr, int WorkingDays, int MaxHrsInMonth) {
	companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, EmpRatePerHr, WorkingDays, MaxHrsInMonth);

	numOfCompany++;

	}

	private void ComputeEmpWage() 
	{
		for(int i = 0; i < numOfCompany; i++){
			int totalEmpWage = this.ComputeEmpWage(companyEmpWageArray[i]);
			System.out.println("Total emp wage for company " + companyEmpWageArray[i]);
            }
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {

		int empHrs=0,empWage=0,TotalWage=0,totalWorkingDays=0,totalEmpHrs=0;

		while (totalEmpHrs <= companyEmpWage.MaxHrsInMonth && 
										totalWorkingDays < companyEmpWage.WorkingDays);
		{
			totalWorkingDays++;
			int empcheck=(int) Math.floor(Math.random()*10)%3;
			switch (empcheck) {

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
			return totalEmpHrs * companyEmpWage.EmpRatePerHr;
     }

	public static void main(String[] args)
	{
		EmployeeWage empWageBuilder = new EmployeeWage();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Relience", 30, 5, 20);
		empWageBuilder.ComputeEmpWage();
	}
}

