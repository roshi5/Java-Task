import java.util.Scanner;
public class leet415 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num1 as string:");
        String str=scan.nextLine();
        int num=Integer.parseInt(str);
        System.out.println("Enter the num2 as string:");
        String str2=scan.nextLine();
        int num1=Integer.parseInt(str2);
        int add=num+num1;
        System.out.println(add);
    }
}
