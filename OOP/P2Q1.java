
//Main Function
public class P2Q1
{
    public static void main(String[]args)
    {
        //Question A
        Employee emp1 = new Employee("Alice",5000.00);
        
        //Display salary before raise
        System.out.println("Salary before raise: RM " + emp1.salary);
        
        //Calculate the percentage(*8),follow the flowchat logic
        emp1.raiseSalary(8);
        
        //Display salary after raise
        System.out.print("Salary after raise: RM " + emp1.salary);
        
        
        //Question D
        Employee empA = new Employee();
        
        //call out the setter method on class page by .setValue
        empA.setName("Ely");
        empA.setSalary(8000);
        
        Employee empB = new Employee("Micheal");
        
        empB.setSalary(8500);
        
        //compare = if else, use getter to calculate the value
        if(empA.getSalary() > empB.getSalary())
        {
            System.out.println(empA.getName() + "has the higher salary compared to " + empB.getName());
        }
        
        else
        {
            System.out.println(empB.getName() + "has the higher salary compared to " + empA.getName());
        }
        
        double totalSalary = empA.getSalary() + empB.getSalary();
        
        System.out.println("Total salary for both employee is RM" + totalSalary);
        
        System.out.println("Total salary for both employee is RM" + (empA.getSalary() + empB.getSalary()));
    }
}
