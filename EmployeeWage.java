public class EmployeeWage
{
        public static void main(String[] args)
        {
                int isFulltime=1;
		int EmpRatePerHr=20;
		int empHrs=0;
		int empWage=0;

                double empcheck=Math.floor(Math.random()*10)%2;

                if(empcheck == isFulltime)
                	empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EmpRatePerHr;
		System.out.println("Total emp Wage: " + empWage);

        }
}
