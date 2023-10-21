package Arrays;

import java.util.Scanner;

public class RotateArrbyK {

    static int[] rotate(int[] arr,int k){ //return array and receive array
        //and k kitne step se rotate kr raha hai
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        //ek variable jiske through answer k ander values dalege
        int j = 0;

        //i<n is equals to i<=n-1
        for(int i = n-k; i<n; i++){
            ans[j++] = arr[i];
        }
        for (int i = 0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
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
        int[] ans = rotate(arr, k);
        System.out.println();
        System.out.println("Array after rotation");
        printArray(ans);
    }
}
