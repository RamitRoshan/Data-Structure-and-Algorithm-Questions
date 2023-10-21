package Arrays;

public class ReverseArray {
    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        int j=0; //for filling up ans variable

        //traverse originaL ARRAY in reverse direction
        for (int i=n-1; i>=0; i--){
            ans[j++]= arr[i];
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
        int[] arr = {1,2,3,4,5,6,78};
        int[] ans= reverseArray(arr);
        printArray(ans);
    }
}
