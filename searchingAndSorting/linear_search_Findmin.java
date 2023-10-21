package searchingAndSorting;

public class linear_search_Findmin {

    //assume arr.length != 0
    //return the minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]< ans){
                ans = arr[i];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] num = {18,12,-7,3,14,28};
        System.out.println(min(num));
    }
}
