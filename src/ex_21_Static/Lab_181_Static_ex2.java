package ex_21_Static;

public class Lab_181_Static_ex2 {
    public static void main(String[] args) {
        ATB10x.M1();

        ATB10x shailesh = new ATB10x(987654321,"Shailesh");
        ATB10x gajraj = new ATB10x(987321564,"GajRaj");
        System.out.println(shailesh.phone_number);
        System.out.println(shailesh.name);
        System.out.println(ATB10x.course_name);
        System.out.println(gajraj.phone_number);
        System.out.println(gajraj.name);
        System.out.println(ATB10x.course_name);
    }
}

class ATB10x {
    static String course_name = "ATB";
    int phone_number;
    String name;

    public ATB10x(int phone_number, String name){
        this.phone_number = phone_number;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_number + this.name + course_name);
    }

    static void M1(){
        System.out.println("Mark Attendance");
    }
}