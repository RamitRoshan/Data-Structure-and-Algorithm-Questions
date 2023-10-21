package Strings;

public class insertString {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");
        s1.insert(2,'y');
        System.out.println(s1);
        s1.deleteCharAt(5);
        System.out.println(s1);
    }
}
