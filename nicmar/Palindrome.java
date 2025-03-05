import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=scan.nextLine();
        scan.close();
        int left=0;
        int right=str.length()-1;
        System.out.println(right);
        boolean checkpalindrome=true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                checkpalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(checkpalindrome){
            System.out.println("It is Palindrome");

        }
        else{
            System.out.println("It is not palindrome");
        }
        
    }
}
