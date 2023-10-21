package Arrays;

public class SwapValueusingSum {

    static void swapWithoutTemp(int a, int b){
        System.out.println("Original values before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("values after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    public static void main(String[] args) {

        int a = 9;
        int b= 3;
        swapWithoutTemp(a,b);
    }
}
