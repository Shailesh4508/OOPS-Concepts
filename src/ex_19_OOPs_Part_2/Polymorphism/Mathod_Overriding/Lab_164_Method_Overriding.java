package ex_19_OOPs_Part_2.Polymorphism.Mathod_Overriding;

public class Lab_164_Method_Overriding {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.home();
        c1.Dad();

        Father f1 = new Father();
        f1.home();
        f1.Dad();


        Father f2 = new Child();//  Dynamic Dispatch
        f2.home(); // method overriding - ridden the father method
    }
}
