package oopsinjava;

public class hybrid_inheritance {
    public static void main(String[] args) {
//    shark s = new shark();
//    s.eatfood();
//    s.boneless();
//    s.swim();
//    s.takebreathe();

//        Tuna t = new Tuna();
//        t.eatfood();
//        t.highProtein();
//        t.swim();
//        t.takebreathe();


//        Chidiya brd = new Chidiya();
//        brd.fly();
//        brd.takebreathe();

//        peacock p = new peacock();
//        p.fly();
//        p.beautifulwing();

        Mammal m = new Mammal();
        m.legs();
        m.eatfood();

        Human h = new Human();
        h.twolegs();
        h.legs();

    }
}
class Animal12{
    String color;
    void eatfood() {
        System.out.println("eats");
    }
    void takebreathe(){
        System.out.println("Taking breathe");
    }
}
class Fish extends Animal12{
    void swim(){
        System.out.println("swimming");
    }
}
class shark extends Fish{
    void boneless(){
        System.out.println("shark has no bone body");
    }
}
class Tuna extends Fish{
    void highProtein(){
        System.out.println("TUna has high protein but less calories");
    }
}

class Chidiya extends Animal12{
    void fly(){
        System.out.println("fly in the sky");
    }
}
class peacock extends Chidiya {
    void beautifulwing(){
        System.out.println("having beautyful colorfull wing");
    }
}

class Mammal extends Animal12 {
    void legs(){
        System.out.println("having legs");
    }
}

class Human extends Mammal{
    void twolegs(){
        System.out.println("two legs with brain");
    }
}



