import java.util.Scanner;
public class summatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the rows:");
        int rows=scan.nextInt();
        System.out.print("Enter the colms:");
        int colms=scan.nextInt();
        int[][] matrix=new int[rows][colms];
        int[][] matrix1=new int[rows][colms];
        int[][] result=new int[rows][colms];

        System.out.println("Enter the first matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                matrix[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the second matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                matrix1[i][j]=scan.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                result[i][j]=matrix[i][j]+matrix1[i][j];
            }
        }
        System.out.println("Your resultant matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                System.out.print(result[i][j]+"  ");
            }
            System.out.println();

        }
    }
}
