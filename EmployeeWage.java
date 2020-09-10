public class EmployeeWage
{
        public static void main(String[] args)
        {
		int isParttime=1;
                int isFulltime=2;
		int EmpRatePerHr=20;
		int empHrs=0;
		int empWage=0;

                double empcheck=Math.floor(Math.random()*10)%3;

                if(empcheck == isFulltime)
                	empHrs = 8;
		else if(empcheck == isParttime)
			empHrs = 4;
		empWage = empHrs * EmpRatePerHr;
		System.out.println("Total emp Wage: " + empWage);

        }
}
