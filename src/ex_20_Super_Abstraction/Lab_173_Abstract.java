package ex_20_Super_Abstraction;

public class Lab_173_Abstract {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan_25k();
        c.loan_50k();

//        Father f = new Father(); ---Object creation not allowed for Abstract Class
    }
}

abstract class Father{
    abstract void loan_50k();
    void loan_25k(){
        System.out.println("Payed the loan of 25K");
    }
}
class Child extends Father{

    @Override
    void loan_50k() {
        System.out.println("Child will pay the Loan");
    }
}