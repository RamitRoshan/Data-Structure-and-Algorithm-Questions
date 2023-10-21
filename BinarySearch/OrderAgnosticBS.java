package BinarySearch;

public class OrderAgnosticBS {

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
        int[] array = {-18,-12,-4,0,2,3,4,15,16,18,22,45, 89};
        // if we write array in descending order then it will for that also
        int target = 22;

        int ans = orderAgnostic(array, target);
        System.out.println(ans);
    }
}
