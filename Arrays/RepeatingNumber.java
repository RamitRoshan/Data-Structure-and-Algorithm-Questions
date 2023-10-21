package Arrays;
import java.util.Scanner;
public class RepeatingNumber {
    static int firstRepeatingNumber(int[] arr){
        int n = arr.length;

        for(int i=0; i<n; i++) { //pickup 1st number
            for(int j= i+1; j<n; j++) {
                //pairing with 2nd number
                if(arr[i] == arr[j]){ //found answer
                    return arr[i]; //method closed
                }
            }
        }
        //agar koi true nai hui to hm -1 return krege
        return -1;
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
        System.out.println("First Repeating Number: " + firstRepeatingNumber(arr));

    }
}
