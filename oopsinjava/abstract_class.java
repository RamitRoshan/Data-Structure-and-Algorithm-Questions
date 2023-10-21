package oopsinjava;

public class abstract_class {
    public static void main(String[] args) {
     Horse h = new Horse();
     h.eat();
     h.walk();
     //System.out.println(h.color);

     Chicken c = new Chicken();
     c.eat();
     c.walk();
    //System.out.println(c.color);

//        Mustang myHorse = new Mustang();

        
//        //we have hierarchy: Animal -> Horse -> Mustang
    }
}
abstract class Animals{
    // String color;
//
//    Animals(){// this is a contructor which we used in absrtract class
//        System.out.println("animal constructor is called");
//        color = "brown";
//    }
    void eat(){ // non abstract method/function
        System.out.println("animal eats");
    }
    abstract void walk();  //abstract method/function
    /*here abstraction k concept kese aaya, like above line code
    is abstraction code. walk() name k jo fuction h yha, uski implimentation
    horsh h to horsh p depend kregi and chicken h to chicken p depend kregi.
    Animal p depend nai kregi , ye bss idea de deta h ki walk name k function
    har animal k ander exist krna chahiye
     */
}
class Horse extends Animals{
//    Horse(){ //this is a constructor
//        System.out.println("Horse constructor called");
//    }
//    void changeColor(){
//        color = "dark brown";
//    }
   void walk(){
        System.out.println("walks on 4 legs");
    }
}
//class Mustang extends Horse { //Mustang is a bread of horse
//  Mustang(){ //this is a constructor
//      System.out.println("Mustang constructor called");
//  }
//}
class Chicken extends Animals{
//    void changeColor(){
//        color = "yellow";
//    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
