
public class Tsutaya
{
    String title;
    String author;
    String genre;
    double price;
    int stock;

    public Tsutaya()
    {
        title="";
        author="";
        genre="";
        price=0.00;
        stock=0;
    }
    
    public Tsutaya(String title,String author,String genre,double price,int stock)
    {
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.price=price;
        this.stock=stock;
    }
    
    public void displayInfo()
    {
        System.out.println(title + " by " + author + " Genre: " + genre + " Price: RM" + price + " Stock: " + stock);
    }
    
    public double calculateTotalCost(int quantity)
    {
        return this.price * quantity;
    }
    
    public void reduceStock(int quantity)
    {
        this.stock -= quantity;
    }
}