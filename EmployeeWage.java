public class EmployeeWage
{
    public static final int isParttime=1;
    public static final int isFulltime=2;
    public static final int EmpRatePerHr=20;

	public static void main(String[] args)
    {

		int empHrs=0;
		int empWage=0;

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
		empWage = empHrs * EmpRatePerHr;
		System.out.println("Total emp Wage: " + empWage);

     }
}
