package ex_20_Super_Abstraction;

public class Lab_175_Interface_Ex1 {
    public static void main(String[] args) {
    Bike b = new Bike();
    b.drive();
}
}

class Bike implements Engine1, Brakes{

    void drive(){
        start_engine();
        apply_brakes();
        stop_engine();
        flush_engine();
    }

    @Override
    public void apply_brakes() {
        System.out.println("Applying Brakes");
    }

    @Override
    public void start_engine() {
        System.out.println("Starting Engine");
    }

    @Override
    public void stop_engine() {
        System.out.println("Stopping Engine");
    }
}

interface Engine1{
    void start_engine();
    void stop_engine();
    default void flush_engine(){
        System.out.println("Engine is flushing");  //Interface always have Incomplete Sentence and to overcome this just use Default before void
    }
}

interface Brakes{
    void apply_brakes();
}
