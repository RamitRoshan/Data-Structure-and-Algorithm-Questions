package BinarySearch;

public class floorofno_BS {
    //return the index of greatest number <= target
    public static  int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            } else if (target> arr[mid]) {
                start = mid+1;
            } else{
                //answer found
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18}; //answer will be in index = 4
        int target = 15;
        int ans = floor(array, target);
        System.out.println(ans);
    }
}
