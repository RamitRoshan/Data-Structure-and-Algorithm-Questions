package Arrays;

import java.util.Scanner;
public class secondLargest {

    //making function to find Maximum element 1st
    static int findMax(int[] arr){
        //yeah ek array receive krega
        int mx = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] >mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findSecondMax(int[] arr){
        int mx = findMax(arr);

        for (int i=0; i<arr.length; i++){
            if (arr[i]==mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        //ek aur bAR maximum nikalna h es changed array k upper
        //array to badal dia hmne
        int secondMax = findMax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Maximum Element: " + findSecondMax(arr));
    }
}
