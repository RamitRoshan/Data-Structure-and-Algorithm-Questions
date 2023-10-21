package BinarySearch;

public class Ceilingofno_BS {

    //return the index of smallest number >= target
    public static  int ceiling(int[] arr, int target){
        //but what if the target is greater than the greatest
        // number present in the array
        //arr.length-1= total, last tk k array.
        if(target> arr[arr.length-1]){
            return -1;
        }
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
        return start;
    }

    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(array, target);
        System.out.println(ans);

    }
}
