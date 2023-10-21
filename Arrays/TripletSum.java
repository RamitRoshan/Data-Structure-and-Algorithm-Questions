package Arrays;
import java.util.Scanner;
public class TripletSum {

    public static int tripletSum(int[] arr, int target){
        int ans =0;
        int n= arr.length;

        for(int i=0; i<n; i++){ //it is searching FIrst number for us
            for(int j=i+1; j<n; j++){ //Second number
                for(int k=j+1; k<n; k++){ //Third number
                    if(arr[i]+ arr[j]+arr[k]==target){
                        ans++;
                    }
                }
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
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        System.out.println(tripletSum(array, target));
    }
}
