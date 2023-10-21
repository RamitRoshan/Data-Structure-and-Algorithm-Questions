package Strings;

public class Builderstring {
    public static void main(String[] args) {

//        StringBuilder str = new StringBuilder("Hello");
//        str.append("World");
//        System.out.println(str);

        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);

        //hello -> mello
        str.setCharAt(0,'m');
        System.out.println(str);
    }
}
