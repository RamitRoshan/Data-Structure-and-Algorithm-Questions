package Arrays;
import java.util.Scanner;
public class RangeQuery {

    static int[] makePrefixSumArray(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1]; //arr[i] = arr[i]+ arr[i-1]
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter " + n + " Elements: ");
        for(int i =1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        int[] prefSum = makePrefixSumArray(arr);

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        while(q-- > 0){ //JBTK q is minus minus greater than 0, tbtk
            //user se puchna HAI KIS RANGE k sum nikalna chahte ho
            System.out.println("Enter range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("sum " + ans);

        }
    }
}