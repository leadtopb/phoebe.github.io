import java.util.Scanner;
public class LabActivity5_IfElse
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter hourly wage: RM ");
        double HourlyWage = input.nextDouble();
        
        System.out.print("Enter hour: ");
        int WorkHour = input.nextInt();
        
        double earned = 0.00;
        
        if(WorkHour >= 40)
        {
            earned = WorkHour * HourlyWage + (HourlyWage * (WorkHour-40) * 0.5);
            System.out.println("Total earned: RM " + String.format("%.2f",earned));
            System.out.println("Qualified to get overtime payment.");
        }
        else
        {
            earned = WorkHour * HourlyWage;
            System.out.println("Total earned: RM " + String.format("%.2f",earned));
            System.out.println("Underwork,normal payment.");
        }
    }
}
