package ex_18_OOPs_Constructors;

public class car2 {
    String model;
    int year;

    car2(){
//        Default Constructor
        model = "Suzuki";
        year = 1942;
        System.out.println("Default Constructor");
    }

//    Parameterized Constructor
    car2(String model_name, int year_created){
        this.model = model_name;
        this.year = year_created;
    }

}
