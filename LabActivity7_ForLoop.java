
import java.util.Scanner;
public class LabActivity7_ForLoop
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of quiz scores to process: ");
        int num = input.nextInt();
        
        double score[] = new double[num]; //this is for unknown num and create by the input; exp: 1,2,3,4,5...
        
        for (int i = 0; i < num;) //cause each score have to input by user(repeat action = loop),and the score is number so use for loop
        //i < num is because the loop is start from 0(0,1,2,3,4 = 5 quiz),
        //when using i <= num the loop output will more than num(which the quiz number)
}
