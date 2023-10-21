package oopsinjava;

public class getter_setter {
    public static void main(String[] args) {
        Pens p = new Pens();
        p.setColor("purple");
        System.out.println(p.getColor());
        p.setTip(5);
        System.out.println(p.getTip());

        p.setColor("orange");
        System.out.println(p.getColor());

    }
}
class Pens{
    private  String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int Tip){
        this.tip = Tip;
    }
}
