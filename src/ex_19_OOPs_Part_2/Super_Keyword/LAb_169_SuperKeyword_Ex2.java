package ex_19_OOPs_Part_2.Super_Keyword;

public class LAb_169_SuperKeyword_Ex2 {
    public static void main(String[] args) {
        Son s = new Son();
        s.test();
    }
}

class Father{
    Father(){
        System.out.println("Default Constructor");
    }

    int gold = 10;

    void home(){
        System.out.println("Bunglow");
    }
}

class Son extends Father{
    Son(){
        super();
    }

    void test(){
        super.home();
        System.out.println(super.gold);
    }
}
