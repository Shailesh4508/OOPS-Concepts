package ex_20_Super_Abstraction;

public class Lab_177_Multiple_Inheritance_Problem_Solve {
    public static void main(String[] args) {
        Child_1 c1 = new Child_1();
        c1.money();
        c1.flat();
        c1.land();
    }
}

class Child_1 implements Father_1, Mother_1{

    @Override
    public void money() {
        System.out.println("20 Rs");
    }

    @Override
    public void flat() {
        System.out.println("2BHK");
    }

    @Override
    public void land() {
        System.out.println("10 Acre");
    }
}

interface Mother_1{
    void money();   // Same function for interface with Mother //
    void flat();
}

interface Father_1{
    void money();  // Same function for interface with Father //
    void land();
}