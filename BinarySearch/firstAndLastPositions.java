package BinarySearch;

import java.util.Arrays;

public class firstAndLastPositions {
    public static int[] searchRange(int[] nums, int target) {
        //initial answer return[-1,-1] when actual answer will not found
        int[] ans = {-1, -1};

        //check for first occurence if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        // we can write given below in place of code line from(9to 13)
//        ans[0] = search(nums, target, true);
//        if(ans[0] != -1){
//            ans[1] = search(nums, target, false);
//        }

        return ans;
    }

    //this function just returns the index value of target
    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential answer found
                ans = mid;
                if (findStartIndex) { // in method its already declare boolean
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }



    public static void main(String[] args) {
     int[] array = {5,7,7,8,8,10};
     int target = 8;
     int[] aws = searchRange(array, target);
        //System.out.println(aws);
        System.out.println(Arrays.toString(aws));

    }
}
