import java.util.*;
public class Bookstore
{
  public static void main(String[]args)
  {
      ArrayList<Tsutaya>bookList = new ArrayList<>();
      
      addBook(bookList);
      displayBooks(bookList);
      processOrder(bookList);
  }
  
  public static void addBook(ArrayList<Tsutaya>list)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter book title: ");
      String title = input.nextLine();
      
      System.out.println("Enter author: ");
      String author = input.nextLine();
      
      System.out.println("Enter genre: ");
      String genre = input.nextLine();
      
      System.out.println("Enter price: ");
      double price = input.nextDouble();
      
      System.out.println("Enter stock quantity: ");
      int stock = input.nextInt();
      
      for(Tsutaya book : list)
      {
          if (book.title.equalsIgnoreCase(title))
          {
              System.out.println("This book already exists:(");
              return;
          }
      }
      
      Tsutaya newBook = new Tsutaya(title,author,genre,price,stock);
      list.add(newBook);
      
      System.out.println("Book added Successful! :)");
  }
  
  public static void displayBooks(ArrayList<Tsutaya>list)
  {
      for (Tsutaya book : list)
      {
          System.out.println(book.title + " by " + book.author + " ,Price: RM" + book.price + ",Stock quantity: " + book.stock);
      }
  }
  
  public static void processOrder(ArrayList<Tsutaya>list)
  {
      Scanner input = new  Scanner(System.in);
      System.out.println("Book Title: ");
      String title = input.nextLine();
      System.out.println("Quantity: ");
      int stock = input.nextInt();
      
      for (Tsutaya book : list)
      {
          if (book.title.equalsIgnoreCase(title))
          {
              System.out.println(book.title + " is found in Tsutaya!");
              
              if(book.stock >= stock)
              {
                  System.out.println("Stock is sufficient, you can buy " + stock + "copies.");
                  double totalCost = book.price * stock;
                  double discountedCost = applyDiscount(totalCost);
                  printReceipt(book, stock, discountedCost);
              }
              else
              {
                  System.out.println("Sorry,our stock is only " + book.stock + ",not enough for your order.");
              }
              return;
          }
          System.out.println("Sorry," + title + " is not found in Tsutaya's inventory.");
      }
  }
  
  public static double applyDiscount(double totalCost)
  {
      if (totalCost > 100)
      //discount how much function need to write{}
      {
          totalCost = totalCost - (totalCost * 10.0 / 100.0);
      }
      return totalCost;
  }
  
  public static void printReceipt(Tsutaya book,int quantity,double totalCost)
  {
      System.out.println("----RECEIPT-----");
      System.out.println("Title\t\tPrice\tQuantity\tTotal");
      System.out.println(book.title + "\tRM" + book.price + "\t" + quantity + "\t\tRM" + totalCost);
  }
  
}
