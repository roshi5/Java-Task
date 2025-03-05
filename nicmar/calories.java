import java.util.Scanner;
public class calories {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the activity: 1.Running 2.Cycling 3.Swimming 4.Weightlifting 5.Yoga....etc :");
        String activity=scan.nextLine();
        System.out.println("Enter the duration in minutes:");
        int duration=scan.nextInt();
        System.out.println("Enter the choice:");
        int choice=scan.nextInt();
        double met=0;
        switch(choice){
            case 1:
              met=10.0;
              break;
            case 2:
              met=8.0;
              break;
            case 3:
              met=9.8;
              break;
            case 4:
              met=3.5;
              break;
            case 5:
              met=2.5;
              break;
            case 6:
              met=12.0;
              break;
            default:
               System.out.println("Invalid choice:");
        }
        double calories_burnt=(choice*duration);
        System.out.println("The burned calories: "+calories_burnt);
    }
}
