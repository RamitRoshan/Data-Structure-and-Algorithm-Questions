package BinarySearch;

public class Mountainarray {
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
    /*
    In the end, start==end and pointing to the largest number because of the 2 checks above.

    -start and end are always trying to find max. element in the above 2 checks
    Hence, when they are pointing to just one element, that is the max one because that is
    what the chacks say.

    -more elaboration: at every point of time for start and end,they have the  best possible
    answer till that time, and if we are saying that only one item is remaining, hence
    because of above line that is the best possible answer
     */

        return start; //or can return end as both are equal
    }
    public static void main(String[] args) {

        int[] array = {0,10,5,2};

        //for printing this, code line 41 and (42, 43) both are correct , use as you want
        //System.out.println(peakIndexInMountainArray(array));
        int ans = peakIndexInMountainArray(array);
        System.out.println(ans);
    }
}
