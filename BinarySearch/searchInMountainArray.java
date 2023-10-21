package BinarySearch;

public class searchInMountainArray {

   static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
    //otherwise try to search in Second Half
        return orderAgnostic(arr, target, peak+1, arr.length-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while(start< end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]){
                //you are in decreasing part of array
                //and this may be the answer,but look at left
                //this is why end != mid-1
                end =mid;
            } else{
                //you are in ascending part of array
                start = mid+1;
                //because we know that mid+1 element > mid element
            }
        }
        return start; //or can return end as both are equal
    }

    static int orderAgnostic(int[] arr, int target, int start, int end) {

//find wheather the array is sorted in ascending or descending
        // boolean isAsc = arr[start] < arr[end];
        boolean isAsc;
        if (arr[start] < arr[end]){
            isAsc= true;
        } else{
            isAsc =  false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) { //it is for descending order
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,3,1};
        int target = 3;

        int ans = search(array, target);
        System.out.println(ans);

    }
}
