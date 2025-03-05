import java.util.Scanner;
public class second {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the temperature:");
        double t=scan.nextDouble();
        if(t>30){
            System.out.print("Hot");

        }
        else if(t>20 && t<=30){
            System.out.print("warm");

        }
        else if(t>10 && t<=19.9){
            System.out.print("Moderate");

        }
        else{
            System.out.println("cold");
        }
        scan.close();
    }
}
