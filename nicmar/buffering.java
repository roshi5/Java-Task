import java.util.Scanner;
public class buffering{
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=scan.nextLine();

        System.out.println("Enter the choice:");
        int choice=scan.nextInt();
        StringBuffer strbuff=new StringBuffer(str);
        switch(choice){
            case 1:
                strbuff.append(" World");
                System.out.println(strbuff);
                break;
            case 2:
                System.out.println("Enter the offset:");
                int offset=scan.nextInt();
                scan.nextLine();

                System.out.println("Enter the string to update:");
                String name=scan.nextLine();
                if(str.length()<=100){
                    strbuff.insert(offset,name);
                    System.out.println(strbuff);
                }
                else{
                    System.out.println("The length of string is very small");
                }
                break;

            case 3:
               if(str.length()>=18){
                   strbuff.delete(13,18);
                   System.out.println(strbuff);
                   break;
               }
               else{
                System.out.println("The length of string is very small");
               }
               break;

            case 4:
                strbuff.reverse();
                System.out.println(strbuff);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}