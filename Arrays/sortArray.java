package Arrays;

import java.util.Scanner;

public class sortArray {
    //this method print anything, jo bhi array dia jay yeah print krdeta h
    //bar bar print krne k lia always hme nai likhna pdega so
    // ek bar method bna dia h printArray()
    static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //1st method of solution
//    static void sortZeroesAndOnes(int[] arr){
//        int n  = arr.length;
//        int zeroes = 0; //it is count of zeroes
//        //in 1st step: count number of zeroes
//        //we do changes in array , nya ans array nai bna raha hai
//        for(int i=0; i<n; i++){
//            if(arr[i] == 0){
//                zeroes++;
//            }
//        }
//
//        //2nd step: 0 to zeroes-1: for 0
//        //baki m: zeroes to n-1: for 1 , jo bachhe hue hai
//        for(int i=0; i<n; i++){
//            if(i< zeroes){
//                arr[i] = 0;
//            } else{
//                arr[i] = 1;
//            }
//        }
//    }

    //Second Optimized Approach
    static  void sortZeroesAndOnes(int[] arr){
        int n= arr.length;

        int left = 0, right = n-1;

        while (left<right){
            if(arr[left] ==1 && arr[right] ==0 ){
                swap(arr, left, right);
                left ++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right --;
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        printArray(arr);
        sortZeroesAndOnes(arr);


        System.out.println("Sorted array: ");
        printArray(arr);


    }
}
