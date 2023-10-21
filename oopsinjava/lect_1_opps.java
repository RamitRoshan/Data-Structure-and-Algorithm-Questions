package oopsinjava;

public class lect_1_opps {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        //used to update color.
        p1.setColor("bhagwa e hind");
        System.out.println(p1.color);
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int newTIp){
        tip = newTIp;
    }
}

class Bachhe {
    String name;
    int roll;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
        System.out.println(percentage);
    }
}
