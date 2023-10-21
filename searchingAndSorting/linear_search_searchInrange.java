package searchingAndSorting;

public class linear_search_searchInrange {
    static int searchInRange(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        //run a for-loop
        for(int index=start; index<=end; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        /*
        this line will execute, if none of the return statements above have executed
        ,hence the target not found
         */
        return -1;
    }
    public static void main(String[] args) {
        int[] num = {18, 12, -7, 14,3, 28};
        int target = 3;
        int ans = searchInRange(num,target, 1,4);
        System.out.println(ans);

        //In place of code-line 25 and 26 we can print in one line
        // System.out.println(searchInRange(num,target,1,4));

    }
}
