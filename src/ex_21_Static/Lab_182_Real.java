package ex_21_Static;

public class Lab_182_Real {
    public static void main(String[] args) {

    }
}

class ATB {
    {
        System.out.println("IIB - this is called when Object is created!");
    }


    static {
        System.out.println("Load the class?, I will execute");
    }


    public String name;
    public int phone_no;
    static String course_name = "ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }


    void read_documents(){
        System.out.println("Non Static Method");
        System.out.println(course_name);
    }


    static void do_assignment(){
//        System.out.println(this.phone_no);   Static Method can't access the non-static variables
//        you can't load the instance variable until the object is created and static members are called even without object creation
        System.out.println("Do Assignment");
    }
}
