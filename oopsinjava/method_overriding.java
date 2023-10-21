package oopsinjava;

public class method_overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}
class Animal{
  void eat(){ //it is a function so we can also write "void eat()" only
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass only");
    }
}
