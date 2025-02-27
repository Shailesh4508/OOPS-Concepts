package ex_20_Super_Abstraction;

public class Lab_170 {
    public static void main(String[] args) {
        Vehicle vc = new Vehicle();
        vc.display();

        Car cc = new Car();
        cc.display();
    }
}

class Vehicle{
    public int max_speed = 160;

//    Constructor
    Vehicle(){
        System.out.println("Default Constructor");
    }

    Vehicle(int a){
        System.out.println("Parameterized Constructor for Vehicle");
    }
// Functions
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("Parameterized Argument");
    }

    void display(){
        System.out.println("Parent Vehicle");
    }
}

// Single Inheritance
class Car extends Vehicle{
    private int max_speed = 200;

    Car(){
        super(100);
    }

    @Override
    void display() {
        System.out.println("Overriding display function");
        System.out.println(super.max_speed);
        System.out.println(this.max_speed);
        this.test();
        super.display();

    }

    void test(){

    }

    Car(int a){
        System.out.println("Parameterized Constructor for Car");
    }
}