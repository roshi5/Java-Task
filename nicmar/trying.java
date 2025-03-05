import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class trying {
    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name:");
        String name=br.readLine();
        System.out.println("Enter your age:");
        int age=Integer.parseInt(br.readLine());
        System.out.println("your name is " + name +" and your age is : "+ age);

    }
}
//System.in->take input as byte
//new InputStreamReader(System.in)->convert byte to character
//new bufferedReader->Buffers the character, making reading efficient.
//BufferedReader->allows us to read input line by line 
//br.readLine()->Reads the entire input line as a string.
