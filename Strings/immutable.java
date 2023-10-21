package Strings;

public class immutable {
    public static void main(String[] args) {
//        String s = "Hello";
//        s = "Dello";
//        System.out.println(s);

        //performance string
        String str  = "";
        for (int i=0; i<=10; i++){
            str = str + i;
        }
        // "" "1" "12"
        System.out.print(str);
    }
}
