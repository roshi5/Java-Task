import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the dividend:");
        int num=scan.nextInt();
        System.out.println("Enter the divisor:");
        int num1=scan.nextInt();
        System.out.println(gcd(num,num1));
        
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
            return a;
    }
}
