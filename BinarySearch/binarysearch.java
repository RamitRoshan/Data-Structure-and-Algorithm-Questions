package BinarySearch;

public class binarysearch {
    //return the index
    //return -1, if it does not exist
    public static  int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<= end){
            //find the middle element
           // int mid = (start+end)/2;
            /*
            here is a problem. start+end thing is a problem
           ,integer has fixed size. after some amount of value
           you cannot input, a vlue in the integer.
           lets you take a very large value of Start and End. and there might
           be a possible that (start+ end) things we are doing , exceed the
            range of integer in java. in that case we can get some error.
            hence, the better ways to do samething is:
            int mid = start + (end-start)/2;
             */
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
// create sorted array, as binary needs
        //create any array, just it should be sorted
        int[] array = {-18,-12,-4,0,2,3,4,15,16,18,22,45, 89};
        int target = 22;
        int ans = BinarySearch(array, target);
        System.out.println(ans);
        // answer will be , based on index and its ans= 10 (index)
    }
}
