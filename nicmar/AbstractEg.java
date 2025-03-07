public class AbstractEg {  // Changed to follow Java naming conventions
    public static void main(String[] args) {
        vehicle obj = new car();  // Using abstract class reference
        obj.model();
        obj.color();
        vehicle obj1 = new bike();  // Using abstract class reference
        obj1.color();
    }
}

abstract class vehicle {
    abstract void color();  // Abstract method

    void model() {  // Concrete method
        System.out.println("It is a 2000 model");
    }
}

class bike extends vehicle {
    void color() {
        System.out.println("It is red in color");
    }
}

class car extends vehicle {  // Should work fine
    void color() {
        System.out.println("It is white in color");
    }
}
