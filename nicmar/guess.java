/* 
import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int randomNumber=(int) (Math.random()*10)+1;
        int guessNum;
        while(true){
            System.out.print("Guess the number:");

            guessNum=scan.nextInt();
            if(guessNum==randomNumber){

                   System.out.println("Your guess was correct, Well done!");
                   break;
            }
            else if(guessNum<randomNumber){
                System.out.println("The guess number is too low...");
            }
            else if(guessNum>randomNumber){
                System.out.println("The guess number is too high...");
            }
            
            else{
                System.out.println("oops you are not getting,Try again");
            }
        }
    }
    
}
*/
