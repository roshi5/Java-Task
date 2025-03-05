import java.util.Scanner;

public class grade {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks=scan.nextInt();
        switch(marks/10){
            case 10:
            case 9:
                System.out.println("Your grade is A");
                break;
            case 8:
                System.out.println("Your grade is B");
                break;
            case 7:
                System.out.println("Your grade is C");
                break;
            case 6:
                System.out.println("Your grade is D");
                break;
            default:
                System.out.println("You are fail");
                break;
        }
    }
}
