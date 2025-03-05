/* 
public class solution{
    public void iseven(int a){
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        solution obj=new solution();
        obj.iseven(8);
    }
}
    public class solution{
        public int maxnumber(int a,int b){
            return Math.max(a, b);
        }
        public int mminnumber(int a,int b){
            return Math.min(a, b);
        }

        public static void main(String[] args) {
            solution obj=new solution();
            int result=obj.maxnumber(8,18);
            int result1=obj.mminnumber(8,18);

            System.out.println("The maximum number is:" +result);
            
            System.out.println("The minimum number is:" +result1);
        }
    }
            public class solution{
                public void iseven(int a){
                    if(a%2==0){
                        System.out.println("Even");
                    }
                    else{
                        System.out.println("odd");
                    }
                }
                public static void main(String[] args) {
                    solution obj=new solution();
                    obj.iseven(8);
                }
            }
//4.reverse the string using recursion
            public class solution{
                public String reverseString(String str){
                    if(str.isEmpty()){
                        return str;
                    }
                    else{
                        return reverseString(str.substring(1))+str.charAt(0);
                    }
                }
                public static void main(String[] args) {
                    solution obj=new solution();
                    System.out.println(obj.reverseString("Roshika"));
                }
            }
//2. fibbonacci series 1 to 20 using recursion
public class solution{
    public int fibonaci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }
    public static void main(String[] args) {
        solution obj=new solution();
        System.out.println(obj.fibonaci(10));
    }
}
*/
//3.sum of digits using recusion
public class solution{
    public int fibonaci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }
    public static void main(String[] args) {
        solution obj=new solution();
        System.out.println(obj.fibonaci(10));
    }
}