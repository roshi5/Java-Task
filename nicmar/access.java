public class access {
    public static void main(String args[]){
          acmo obj=new acmo();
          obj.show();
          car car1=new car("Rollsroyce",1990);
          car car2=new car("bmw",2010);
          car car3=new car("Suzuki",2060);

          System.out.println(car1.name +" "+ car1.model); //to access the value of obj
          System.out.println(car2.name +" "+ car2.model); //to access the value of obj
          System.out.println(car3.name +" "+ car3.model); //to access the value of obj
    }
}
class car{
    String name;
    int model;
    
    public car(String carname,int carmodel){
            name=carname;
            model=carmodel;
    }
}
class acmo{
    private int secretcode=1046;
     void show(){
        System.out.println("Hii guys...how are you..");
        System.out.println(secretcode);
     }
}