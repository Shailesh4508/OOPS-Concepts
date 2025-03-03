package ex_21_Static;

public class Lab_180_Static {
    public static void main(String[] args) {
        Student.m1();

        Student s = new Student(22);
        Student s1 = new Student(23);

        System.out.println(s.age);
        System.out.println(s1.age);
        System.out.println(Student.class_name);
    }
}

class Student{
    int age;
    static String class_name;

    public Student(int age){
        this.age = age;
    }

    static void m1(){
        System.out.println("I am Static");
    }
}
