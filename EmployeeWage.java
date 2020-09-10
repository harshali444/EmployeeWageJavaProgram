public class EmployeeWage
{
        public static void main(String[] args)
        {
                int isFulltime=1;

                double empcheck=Math.floor(Math.random()*10)%2;

                if(empcheck==isFulltime)
                System.out.println("Employee is present");
                else
                System.out.println("Employee is absent");
        }
}
