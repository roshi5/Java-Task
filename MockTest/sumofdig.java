public class sumofdig{
    int sum(int num){
        if(num==0){
            return 0;
        }
        else{
            return num%10 +sum(num/10);
        }
    }
    public static void main(String args[]){
        sumofdig obj=new sumofdig();
        int result=obj.sum(12345);
        System.out.println("The sum of digits is:" +result);
        
    }


}