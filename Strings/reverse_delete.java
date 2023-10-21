package Strings;

public class reverse_delete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ramit");
        System.out.println("Original String: " + sb);
        sb.reverse();
        System.out.println(sb);

        sb.delete(2,6);
        System.out.println(sb);
    }
}
