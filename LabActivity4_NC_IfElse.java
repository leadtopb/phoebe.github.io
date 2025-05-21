import java.util.Scanner;
public class LabActivity4_NC_IfElse

{
    private double sales;
    private double income;
    
    //Default Constructor
    public LabActivity4_NC_IfElse()
    {
        
    }
    
    //Normal Constructor
    public LabActivity4_NC_IfElse(double sales,double income)
    {
        this.sales = sales;
        this.income = income;
    }
    
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your sales: RM ");
        double sales = input.nextDouble();
        
        double income = 0.00; //if write in if statement(below) it cannot work at all statement
        
        if(sales >= 40000)
        {
            income = 350 + (sales * 0.14);
        }
        else if(sales >= 30000 && sales < 40000)
        {
            income = 325 + (sales * 0.12);
        }
        else if(sales >= 20000 && sales < 30000)
        {
            income = 300 + (sales * 0.09);
        }
        else if (sales >= 10000 && sales < 20000)
        {
            income = 250 + (sales * 0.05);
        }
        else
        {
            income = 200 + (sales * 0.03);
        }
        System.out.println("Your sales is RM "+ String.format("%.2f",income));    
    }

}
