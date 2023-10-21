package Arrays;
import java.util.Scanner;
public class PresentQuery {

    static int[] makeFrequencyArray(int[] arr){
        //given 10 to the power 5 but hm for safety hm 4 5 bdha k value
        //add kr lete hai. There is no harm.
        int[] freq = new int[100005];

        //frequency array bnane k lia, pure array p traverse krna pdta h
        for(int i= 0; i<arr.length; i++){
            freq[arr[i]]++; //we can also write freq[arr[i]] = freq[arr[i]]+1;
        }
        return freq;
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
        //makin frequency array
        int [] freq = makeFrequencyArray(arr);
        //ye method jo bhi array pass krega, use frequency array bna dega

        //user kitne number of query puchna chahte h
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        //user jitne bhi query puch chahta h hme use puch lene dene chahiye
        //using while loop- hm user se Q-time input lege
        while(q> 0){
            System.out.print("Enter number to be searched: ");
            int x = sc.nextInt();
            if (freq[x]>0){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
            q--;
        }
    }
}
