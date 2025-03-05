import java.util.Scanner;
public class builder {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=scan.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.append(" Roshika");
        System.out.println("The updated string:"+sb);
    }
    }
