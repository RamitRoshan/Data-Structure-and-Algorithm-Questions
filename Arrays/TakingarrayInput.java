package Arrays;

import java.util.*;
public class TakingarrayInput {
    public static void main(String[] args) {

//        //traditional way to taking array
//        int[] arr = new int[5];
//        arr[0] = 5;
//        arr[1] = 6;
//        arr[2] = 7;
//        arr[3] = 8;
//        arr[4] = 9;3

        Scanner sc =new Scanner(System.in);
        //taking input of size of array from user
        System.out.println("Enter array elements");
        int a = sc.nextInt();
        int[] arr = new int[a];

        System.out.println("Enter " + a+ "elements" );
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //printing array
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
