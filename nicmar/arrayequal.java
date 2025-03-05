/* 
Scannerimport java.util.Scanner;

public class arrayequal{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=scan.nextInt();
        System.out.print("Enter the"+ size +"elements:");

        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("The entered element are:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
//2.Java Program to Check if two Arrays are Equal or not

import java.util.Scanner;
import java.util.Arrays;

public class arrayequal{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the element for first array:");
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Again enter the elements for second array:");
        int arr1[]=new int[5];
        for(int i=0;i<5;i++){
            arr1[i]=scan.nextInt();
        }
        if(Arrays.equals(arr,arr1)){
            System.out.println("The two arrays are equal");
        }
        else{
            System.out.println("The two arrays are not equal");
        }

 }
}
//3.Java Program to Find Largest Element in an Array
import java.util.Scanner;
import java.util.Arrays;

public class arrayequal{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=scan.nextInt();
        System.out.println("Enter the elements:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The largest element in the array:"+max);

    }
}
import java.util.Scanner;
import java.util.Arrays;

public class arrayequal{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=scan.nextInt();
        System.out.println("Enter the elements:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The largest element in the array is :"+arr[size-1]);
    }
}*/
//4.sum of array

import java.util.Scanner;

public class arrayequal{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=scan.nextInt();
        System.out.println("Enter the elements:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of array element:"+sum);
    }
}
