/* 
public class constructorex{
    
    public static void main(String[]args){
        student obj=new student();
        obj.display();
    }

}
class student{
    String name;
    int age;
    String department;

student(){//default constructor
    this.name="Roshika";
    this.age=20;
    this.department="cse";
}
void display(){
    System.out.println(name+" "+age+" "+department);
}
}
public class constructorex{
    
    public static void main(String[]args){
        student obj=new student("Nitheesh",22,"cse");//constructor
        obj.display();
    }

}
class student{
    String name;
    int age;
    String department;

student(String name,int age,String department){//parameterized constructor
    this.name=name;
    this.age=age;
    this.department=department;
}
void display(){
    System.out.println(name+" "+age+" "+department);
}
}
*/
import java.util.Scanner;
public class constructorex{
    
    public static void main(String[]args){
        student obj=new student();
        obj.display();
    }

}
class student{
    String name;
    String rollno;
    String grade;

student(){//default constructor
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your name:");
    this.name=scan.nextLine();
    System.out.println("Enter your rollno:");
    this.rollno=scan.nextLine();
    System.out.println("Enter your grade:");
    this.grade=scan.nextLine();
}
void display(){
    System.out.println("Students Detail:");
     System.out.println("Name"+name);
     System.out.println("Rollno"+rollno);
     System.out.println("Grade"+grade);
}
}