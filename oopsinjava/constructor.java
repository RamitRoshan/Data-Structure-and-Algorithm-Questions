package oopsinjava;

public class constructor {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("ramit");
        Student s2 = new Student(9667);
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("constructor called");
    }
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}
