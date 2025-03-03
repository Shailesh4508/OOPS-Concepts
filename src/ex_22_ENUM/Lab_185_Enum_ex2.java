package ex_22_ENUM;

public class Lab_185_Enum_ex2 {
    public static void main(String[] args) {
        System.out.println(URLS.katalon);
        if (URLS.katalon.equals("katalon")) {
            System.out.println("I want to do somethings");
        }
    }
}
// Enum is nothing
enum URLS {
    google, restassured, katalon, vwo
}
