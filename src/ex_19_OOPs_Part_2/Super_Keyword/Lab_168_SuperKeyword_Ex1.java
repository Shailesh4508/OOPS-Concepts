package ex_19_OOPs_Part_2.Super_Keyword;

public class Lab_168_SuperKeyword_Ex1 {
    public static void main(String[] args) {
        TestCase1 tc1 = new TestCase1("Chrome");
        tc1.openBrowser();
        System.out.println("Testcase1 Running-----");
        tc1.closeBrowser();
        System.out.println(tc1.getBrowser());

        System.out.println("-----------------------------");

        TestCase1 tc2 = new TestCase1("Edge");
        System.out.println(tc2.getBrowser());
    }
}

class Base_Class {
    private String browser;

    public Base_Class(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean Admin) {
        if (Admin) {
            this.browser = browser;
        }
        else {
            System.out.println("Switching of Browser is not Allowed for you!!");
        }
    }

    void openBrowser(){
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName){
        System.out.println("Opening Browser!!-->" +browserName);
    }

    void closeBrowser(){
        System.out.println("Closing Browser!!");
    }
}

class TestCase1 extends Base_Class{

    public TestCase1(String browser) {
        super(browser); // Call to my Parents
    }

    @Override
    public void setBrowser(String browser, boolean Admin) {
        System.out.println("Override the Parent Set Browser");
    }
}