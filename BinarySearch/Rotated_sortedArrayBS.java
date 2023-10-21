package BinarySearch;

public class Rotated_sortedArrayBS {

    //this will not going to work for dublicate value
    static  int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<= end){
            int mid = start + (end-start)/2;
            //4-cases over here

            //1st-case is:
            //if mid= last index of the array then this(mid+1) will be index
            //outside the bound . so here we will declare
            //mid< end
            if(mid< end && arr[mid] > arr[mid+1]){
                //and means both condition should be true
                return mid;
            }
            //2nd case
            if (mid> start && arr[mid]< arr[mid-1]){
                return mid-1;
            }
            //3rd Case
            if(arr[mid] <= arr[start]){
                end = mid-1;
            } else{
                start = mid +1;
            }
        }
        return -1; //elementb not found return -1.
    }

    //we are going to do Pivot for Binary search
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //if you did not find a Pivot, it means the array is not rotated
        if(pivot == -1){
            //just do normal Binary search
            return BinarySearch(nums, target, 0, nums.length-1);
        }

        //if pivot is found, you have found 2 ascending sorted array
        if(nums[pivot] == target){
            return pivot;
        }
        //case 2
        if(target >= nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }
        return BinarySearch(nums, target, pivot-1, nums.length-1);
     }

    public static  int BinarySearch(int[] arr, int target, int start, int end){

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
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};
        int ans = findPivot(array);
        System.out.println(ans);

        //we are finding Pivot here i.e largest number present in array
    }
}
