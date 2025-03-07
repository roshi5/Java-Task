public class inheritanceeg {
    public static void main(String[] args) {
        dog obj=new dog();
        obj.sound();
        obj.barks();
    }
}
class animal  {
    void sound(){
        System.out.println("all animal make sound");
    }
}
class dog extends animal{
    void barks(){
        System.out.println("The dog barks");
    }
}
