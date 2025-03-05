import java.util.Scanner;
public class atm{
public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a;
        int code=1234;
        int attempts=0;
        int maxattempts=3;
        while(true){
            System.out.print("Enter your password:");
            a=scan.nextInt();
            attempts++;
            if(code==a){
                System.out.println("Your password is correct");
                break;
                
            }
            else{
                if(attempts<maxattempts){
                    System.out.println("your password is not correct.Try again");

                }
                else{
                    System.out.println("your account is locked");
                    break;
                }

            }
        }
}
}