package ex_19_OOPs_Part_2.Multilevel_Inheritance;

import ex_19_OOPs_Part_2.Single_Inheritance.Example_1.Son_2;

public class Lab_160_Multilevel_Inheritance {
    public static void main(String[] args) {
        Son Shailesh = new Son();
        Shailesh.Car();
        Shailesh.Banglow();
        Shailesh.FarmHouse();
        Shailesh.BHK1();
        Shailesh.Row_House();
        Shailesh.BHK3();
        Shailesh.BHK2();
        Shailesh.Car2();

        GrandFather GF = new Son();
        Father F = new Son();
        GrandFather GF_1 =  new Father();
        GF_1.FarmHouse();
//        Son Rahul = new GrandFather();------------New Object creation will not be possible as Son is Inherited from Father and GrandFather
    }
}
