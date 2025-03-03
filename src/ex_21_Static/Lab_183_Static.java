package ex_21_Static;

public class Lab_183_Static {
    public static void main(String[] args) {
        Automation a = new Automation();
        System.out.println(Automation.driver);
        System.out.println(a.driver);
        Automation.driver = "Firefox";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2);

    }
}

class Automation{
    static String driver = "Chrome";
    static String driver2; // if not initialize then default value will be taken
}
