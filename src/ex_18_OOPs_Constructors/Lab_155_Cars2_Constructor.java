package ex_18_OOPs_Constructors;

import java.util.Scanner;

public class Lab_155_Cars2_Constructor {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Model Name for Mahindra");
        String model_name = sc.next();
        car2 Mahindra = new car2("Scorpio",2004);
        System.out.println(Mahindra.model);
        System.out.println(Mahindra.year);

        System.out.println("-------------------");

        car2 Maruti = new car2("Ertiga",2012);
        System.out.println(Maruti.model);
        System.out.println(Maruti.year);
    }
}
