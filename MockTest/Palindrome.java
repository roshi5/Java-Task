import java.util.Scanner;  // Import Scanner class

public class Palindrome {  
    boolean check(String str, int left, int right) {
        if (left >= right) {  
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {  
            return false;
        }
        return check(str, left + 1, right - 1);  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();  
        scanner.close();  
        Palindrome obj = new Palindrome();
        boolean result = obj.check(str, 0, str.length() - 1); 

        if (result) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
