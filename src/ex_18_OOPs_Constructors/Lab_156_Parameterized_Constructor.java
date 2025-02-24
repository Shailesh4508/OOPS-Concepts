package ex_18_OOPs_Constructors;

public class Lab_156_Parameterized_Constructor {
    public static void main(String[] args) {
        Mobile Iphone = new Mobile("Iphone-15","2023");
        Mobile Samsung = new Mobile("Samsung-S25 Ultra","2025");
        Mobile Motorola = new Mobile("Motorola Edge 50 pro","2024");
        Mobile Nothing = new Mobile("Nothing Phone 2","2021");
        System.out.println(Iphone.model_name + "---" + Iphone.year_of_manufacturing);
        System.out.println(Samsung.model_name + "---" + Samsung.year_of_manufacturing);
        System.out.println(Motorola.model_name + "---" + Motorola.year_of_manufacturing);
        System.out.println(Nothing.model_name + "---" + Nothing.year_of_manufacturing);

        System.out.println("--------------------");

        Iphone.display();
        Samsung.display();
        Motorola.display();
        Nothing.display();

        System.out.println("--------------------");

        String list_of_mobile_1 = Iphone.give_me_list_of_mobiles();
        System.out.println(list_of_mobile_1);
        String list_of_mobile_2 = Samsung.give_me_list_of_mobiles();
        System.out.println(list_of_mobile_2);
        String list_of_mobile_3 = Motorola.give_me_list_of_mobiles();
        System.out.println(list_of_mobile_3);
        String list_of_mobile_4 = Nothing.give_me_list_of_mobiles();
        System.out.println(list_of_mobile_4);
    }
}

class Mobile{
    String model_name;
    String year_of_manufacturing;

    Mobile(String model_name_c, String year_of_manufacturing_c){
        this.model_name = model_name_c;
        this.year_of_manufacturing = year_of_manufacturing_c;
    }

    void display(){
        System.out.println(this.model_name + "---" + this.year_of_manufacturing);
    }

    String give_me_list_of_mobiles(){
        return this.model_name + "---" +this.year_of_manufacturing;
    }
}
