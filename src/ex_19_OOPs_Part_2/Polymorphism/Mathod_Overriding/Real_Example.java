package ex_19_OOPs_Part_2.Polymorphism.Mathod_Overriding;

public class Real_Example {
    public static void main(String[] args) {
        TestCase_1 TC_1 = new TestCase_1();
        TC_1.open_Browser();

        TestCase_2 TC_2 = new TestCase_2();
        TC_2.open_Browser();
    }
}

class Common_to_All{
    void open_Browser(){
        System.out.println("Open the Browser in: 5 sec");
    }
}

class TestCase_1 extends Common_to_All{
    void startTestCase (){
        open_Browser();
    }
}

class TestCase_2 extends Common_to_All{
    void open_Browser(){
        System.out.println("Open the Browser in: 2 sec");
    }
}