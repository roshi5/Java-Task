import java.util.Scanner;
public class third {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        double t=scan.nextDouble();
        if(t%9==0){
            System.out.print("It is divisible by nine");

        }
        else{
            System.out.println("It is not divisible by nine");
        }
    }
}
