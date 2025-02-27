package ex_20_Super_Abstraction;

public class Lab_174_Abstract_Example2 {
    public static void main(String[] args) {
        Maruti m = new Maruti();
        m.drive();

    }
}


abstract class Engine{
    abstract void start_engine();
    abstract void stop_engine();
}

class Maruti extends Engine{

    @Override
    void start_engine() {
        System.out.println("Start Engine");
    }

    @Override
    void stop_engine() {
        System.out.println("Stop Engine");
    }

    void drive(){
        start_engine();
        System.out.println("I am Driving");
        stop_engine();
    }
}