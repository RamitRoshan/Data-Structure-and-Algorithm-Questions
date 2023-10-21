package Arrays;

import java.util.Scanner;

public class RotateArrbyK_Inplace {


    static void swap(int[] arr, int a, int b){
        int temp = arr[a]; //temp = 9
        arr[a]= arr[b]; //a = 3
        arr[b] = temp;
    }
    static void reverse(int[] arr, int i, int j){ //i=start and j= end
        while(i<j){
            swap(arr, i,j);
            i++;
            j--;
        }
    }

    static  void rotateInPlace(int[] arr, int k){
        int n =arr.length;
        k = k% n;
        reverse(arr,0, n-k-1);
        reverse(arr,n-k, n-1);
        reverse(arr,0, n-1); //original array
    }

    //making a helper-method for printing
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:  ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.print("Original array: ");
        printArray(arr);
         rotateInPlace(arr, k);
        System.out.println();
        System.out.println("Array after rotation");
        printArray(arr);

    }
}
