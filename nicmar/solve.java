/*public class solve {
    public static void main(String[] args) {
        int result=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                result=result+i;
            };
        }
        System.out.println("The sum of numbers between 1 to 100 is:"+ result);

    }
}
public class solve {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
public class solve {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
           System.out.println(i);
           i++;
        }
    }
}
import java.util.Scanner;
public class solve{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        int sum=0;

        while(num>0){
            int result=num%10;
            sum=sum+result;
            num=num/10;
        }
        System.out.println(sum);
    }
}
import java.util.Scanner;
    public class solve{
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int choice;
            
            
            do{
                System.out.println(" 1.Add\n 2.Subtract\n 3.Multiply\n 4.Divide\n 5.Exit from the program:");
                System.out.println("Enter your choice:");
                choice=scan.nextInt();
                if(choice==5){
                    System.out.println("Exit the program");
                    break;
                }
                System.out.println("Enter two numbers:");
                int a=scan.nextInt();
                int b=scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Adition of two numbers is:"+(a+b));
                        break;
                    case 2:
                        System.out.println("subtraction of two numbers is:"+(a-b));
                        break;
                    case 3:
                        System.out.println("Multiplication  of two numbers is:"+(a*b));
                        break;
                    case 4:
                        System.out.println("Adition of two numbers is:"+(a/b));
                        break;
                    default:
                    System.out.println("Exit the program");
                        break;
                }
                break;
            }
            while(choice!=5);
        }
    }    

import java.util.Scanner;
public class solve{
        public static void main(String[] args) {
            if(args.length<2){
                System.out.println("provide 2 command line");
                return;
            }
            String name=args[0];
            int age=Integer.parseInt(args[1]);
            System.out.println("My name is:"+name+"and i am "+age);
        }
    }

//Task 1
import java.util.Scanner;

public class solve{
        public static void main(String[] args) {
            for(int i=1;i<=5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();

            }
        }
    }
//Task 2
import java.util.Scanner;
public class solve{
        public static void main(String[] args) {
            int num=1;
            for(int i=1;i<=3;i++){
                for(int s=3;s>i;s--){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print(num + "");
                    num++;
                }
                System.out.println();
            }

        }
    }
//task-3
import java.util.Scanner;
public class solve{
        public static void main(String[] args) {
           for(int i=1;i<=5;i++){
              System.out.println(i);
            for(int z=1;z<=4;z++){
                System.out.print(z);
            }
            System.out.println("");
           }
        }
}
        */
import java.util.Scanner;
public class solve{
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         float num=-5.6f;
         float num1=9.1f;
         System.out.println(Math.abs(num));
         System.out.println(Math.sqrt(num1));
         System.out.println(Math.max(num,num1));
         System.out.println(Math.min(num,num1));
         System.out.println(Math.cbrt(num));
         System.out.println(Math.pow(num1,num));
         System.out.println(Math.ceil(num));
         System.out.println(Math.round(num));
         System.out.println(Math.floor(num1));
         System.out.println(Math.sin(num1));
         System.out.println(Math.cos(num1));
         System.out.println(Math.tan(num1));
         System.out.println(Math.random());
         System.out.println(Math.PI);
         System.out.println(Math.E);

}
}
