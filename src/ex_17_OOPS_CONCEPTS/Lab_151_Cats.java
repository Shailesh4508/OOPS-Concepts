package ex_17_OOPS_CONCEPTS;

public class Lab_151_Cats {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        Cat c2 = null;
        new Cat();

        c1.running();
        c2.running(); // java.lang.NullPointerException



    }
}


class Cat{
    String name;


    void running(){
        System.out.println("Running");
    }
}
