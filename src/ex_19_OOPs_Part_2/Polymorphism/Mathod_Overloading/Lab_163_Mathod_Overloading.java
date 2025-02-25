package ex_19_OOPs_Part_2.Polymorphism.Mathod_Overloading;

public class Lab_163_Mathod_Overloading {
    public static void main(String[] args) {
        MathOperation m1 = new MathOperation();
        int r1 = m1.add(2,6);
        System.out.println(r1);

        int r2 = m1.add(3,45,75);
        System.out.println(r2);

        double d1 = m1.add(4.56,3.57);
        System.out.println(d1);
    }
}
