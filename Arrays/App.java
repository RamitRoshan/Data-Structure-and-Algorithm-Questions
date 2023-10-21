package Arrays;

import java.util.Arrays;

public class App {

    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void changeArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            arr[i] =0;
        }
    }

    public static void changeVal(int a){
        a =1004;
    }
    public static void main(String[] args) {
        int a = 5;
        changeVal(a);
        System.out.println(a); //print 5
      int[] arr = new int[3];
      arr[0] = 5;
      arr[1] = 6;
      arr[2] = 7;

      changeArray(arr);
        printArray( arr);

         int [] arr1 = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied arr");
        printArray(arr);
    }
}
