public class EmployeeWage
{
    public static final int isParttime=1;
    public static final int isFulltime=2;

	private int numOfCompany=0;
	private LinkedList<ComponyEmpWage> companyEmpWageList;
	private Map<Strimg,CompanyEmpWage> companyToEmpWageMap;

	public EmployeeWage() {
	companyEmpWageList = new LinkedList<>();
	companyToEmpWageMap = new HashMap<>();
	}

	public void addCompanyEmpWage(String company, int EmpRatePerHr, int WorkingDays, int MaxHrsInMonth) {
	CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, EmpRatePerHr, WorkingDays, MaxHrsInMonth);

	companyEmpWageList.add(companyEmpWage);
	companyToEmpWageMap.put(company, companyEmpWage);


	}

    public void computeEmpWage() 
	{
		for(int i = 0; i < companyEmpWageList.size(); i++){
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
            }
	}


	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalEmpWage;
	}
	
	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
	
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

}

	public static void main(String[] args)
	{
		ComputEmpWage empWageBuilder = new empWageBuilder();
		empWageBuilder.addCompanyEmpWage(company: "DMart", EmpRatePerHr: 20, WorkingDays: 2, MaxHrsInMonth: 10);
        empWageBuilder.addCompanyEmpWage(company: "Relience", EmpRatePerHr: 30, WorkingDays: 5, MaxHrsInMonth: 20);
		empWageBuilder.computeEmpWage();
		System.out.println("Total wage for Dmart:" + empWageBuilder.getTotalWage( company "DMart"));
        System.out.println("Total wage for Relience:" + empWageBuilder.getTotalWage( company "Relience"));
	}
}

