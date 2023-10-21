package Arrays;

import java.util.Scanner;

public class FindUnique {

    public static int findUnique(int[] arr) {
        int n= arr.length;
        for (int i=0; i<n; i++){ //pair k 1st number p traversal krne wala h
            for(int j=i+1; j<n; j++){ //traversal on 2nd number of pair
//j=i+1 kyuki hme agge dekhna h
                if (arr[i]==arr[j]){
                    arr[i]= -1;
                    arr[j]= -1;
                }
            }
        }
        /*ans variable ko -1 initialize kr dete h,
        -1 kbhi answer aaiga nai, kyuki question m given h
        ek number unique h to answer hmesa exist to kr raha h
         */
        int ans = -1;
        for(int i=0; i<n; i++){
            if(arr[i] >0){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int b = sc.nextInt();

        int[] array = new int[b];
        System.out.println("Enter " + b + " elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Unique element: " + findUnique(array));
    }
}

