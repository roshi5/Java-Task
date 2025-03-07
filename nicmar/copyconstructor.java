import java.util.Scanner;
public class copyconstructor {
    public static void main(String args[]){
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the title of the book:");
       String title=scan.nextLine();
       System.out.print("Enter the Author of the book:");
       String author=scan.nextLine();
       System.out.print("Enter the price of the book:");
       double price=scan.nextInt();
       Book obj=new Book(title,author,price);
       Book obj1=new Book(obj);
       System.out.println("The original books:");

        obj.display();
        
        System.out.println("The copied books:");
        obj1.display();

    }
}
class Book{
    String title;
    String author;
    double price;


    Book(String title,String author,double price){
       
       this.title=title;
       this.author=author;
       this.price=price;
    }
    Book(Book b){
       
        this.title=b.title;
        this.author=b.author;
        this.price=b.price;
     }
    void display(){
        System.out.println("1.Title:"+title);
        System.out.println("2.Author:"+author);
        System.out.println("3.Price:"+price);

    }
}