package Arrays;

import java.util.Scanner;

public class Pairsum {

    public static int pairSum(int[] arr, int target){
        //array and target do chije ye receive kr raha h
        int n = arr.length;
        //n main hm array ki length store kra lete h
        int ans =0;
        for (int i=0; i<n; i++){ //1st number are picking
            for (int j=i+1; j<n; j++){
                /*baki number hme 1st m add krni h
              so, j are searching for 2nd number
              i+1 kyuki hm aage ki number ko add kr raha after fixing 1st
              number
                 */
                if (arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int a = sc.nextInt();

        int[] array = new int[a];
        System.out.println("Enter " + a + " elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        System.out.println(pairSum(array, target));
    }
}
