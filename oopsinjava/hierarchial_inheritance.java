package oopsinjava;

public class hierarchial_inheritance {
    public static void main(String[] args) {
     Bird b = new Bird();
     b.eat();
     b.fly();
    }
}
class Animal33{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class Mammals extends Animal33{
    void walk() {
        System.out.println("walks");
    }

}
class Bird extends Animal33{
    void fly(){ //function class of bird
        System.out.println("flying");
    }
}
