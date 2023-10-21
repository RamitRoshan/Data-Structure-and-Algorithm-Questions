package oopsinjava;

public class superkeywords {
    public static void main(String[] args) {
     horse h = new horse();
        System.out.println(h.color);

    }
}
class animals {
    String color;

    animals(){
        System.out.println("animals constructor is called");
    }
}

class horse extends animals{
    horse(){
        super.color = "brown";
        //super();
        //this super() class will called animal class constructor
        System.out.println("horse constructor is called");
    }
}
