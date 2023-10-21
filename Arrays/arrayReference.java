package Arrays;
import java.util.*;
public class arrayReference {

    //making a method name of printArray, jo hmare lia array print
    //krke lake de
    //or ye jo printArray method ko jo array dia jaiga
    // ye usko print krke dega
    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {

//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter array elements");
//        int n = sc.nextInt();
//        int[] arr = new int[n];

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;


        System.out.println("Original Array");
        printArray(arr);

        //changing some values of arr
        arr[0] = 0;
        arr[1] = 0;
        System.out.println("Original array after changing arr");
        printArray(arr);

        System.out.println("copied arr after changing arr");
        printArray(arr);

    }
}
