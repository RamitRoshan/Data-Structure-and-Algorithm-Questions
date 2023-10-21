package Arrays;

import java.util.Scanner;

public class sortArray_nondecreasingorder {

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

    static void reverse(int[] arr){
        int i=0 , j = arr.length-1;
        while(i<j){
            swap(arr, i,j);
            i++;
            j--;
        }
    }

    /* write a method who will return an array, kyuki hme square k array
 return krna h.
  */
    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];
        //ek variable chahiye(k) jo  ans array p,
        //treverse krke ese fill kre
        int k=0;

        while(left<= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            } else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        reverse(ans);
        return ans ;
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
        int[] ans =  sortSquares(arr); //we write int[] ans kyuki
        //hm method main  return kra raha kuch.
        //if we write void then we dont need to write int[] ans
        // we just write sortSquares(arr);


        System.out.println("Sorted array: ");
//        reverse(ans);
        printArray(ans);
    }
}
