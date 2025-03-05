/* 
import java.util.Scanner;
public class StringFunc {
    public static void main(String[] args) {
        
        String str="  Hello, world";
        String newstr="  Hello, World";
        String name="Roshika Nitheesh";
        System.out.println(str.equals(newstr));
        System.out.println(str.charAt(2));
        System.out.println(str.equalsIgnoreCase(newstr));
        System.out.println(str.compareTo(newstr));
        System.out.println(name.startsWith("Roshika"));
        System.out.println(str.trim()+"'");
        Scanner scan=new Scanner(System.in);
        int a;
        int code=1234;
        while(true){
            System.out.print("Enter your password:");
            a=scan.nextInt();
            if(code==a){
                System.out.println("Your password is correct");
                break;
                
            }
            else{
                System.out.println("your password is not correct.Try again");

            }
            
        }
    }
}

//Sum of First N Natural Numbers

import java.util.Scanner;
    
public class StringFunc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scan.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
                sum=sum+i;
                i++;
            }
           System.out.println(sum);
        }
    }
//Reverse Counting
import java.util.Scanner;
    
public class StringFunc {
    public static void main(String[] args) {
    
    int i=10;
    while(i>0){
        System.out.println(i);
        i--;
    }
    }
}
//Print all even numbers between 1 and 20 using a while loop.
import java.util.Scanner;
    
public class StringFunc {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=20){
            if(i%2==0){
                System.out.println(i);

                sum=sum+i;

            }
            i++;

        }
        System.out.println("The sum of first natural number from 1 to 20:"+sum);

    }
}
    */




