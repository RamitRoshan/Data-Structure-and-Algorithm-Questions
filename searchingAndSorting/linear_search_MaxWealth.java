package searchingAndSorting;

public class linear_search_MaxWealth {
//    public int maximumWealth(int[][] accounts) {
//        // person = rol
//        // account = col
//        int ans = Integer.MIN_VALUE;
//    //enhanced forloop here
//        for (int[] ints : accounts) {
//            // when you start a new row, take a new sum for that row
//            int sum = 0;
//            for (int anInt : ints) {
//                sum += anInt;
//            }
//            // now we have sum of accounts of person
//            // check with overall ans
//            if (sum > ans) {
//                ans = sum;
//            }
//        }
//        return ans;
//    }
    public int maximumWealth(int[][] accounts){
        //person = row
        //account = column
        //we use Integer.MIN_VALUE for finding maximum
        int ans = Integer.MIN_VALUE;
        for(int person=0; person<accounts.length; person++){
            //when you start a new col, take a new sum for that row
           int sum =0;
            for(int account=0; account<accounts[person].length; account++) {
                sum += accounts[person][account];
            }
    //now we have sum of accounts of person
    //check with overall ans
            if(sum>ans){
                ans= sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        linear_search_MaxWealth solution = new linear_search_MaxWealth();

        int[][] maxWealth = {{1, 2, 3}, {3, 2, 1}};

        // Call the maximumWealth method and print the result
        int max = solution.maximumWealth(maxWealth);
        System.out.println("Maximum wealth: " + max);

        /*linear_search_MaxWealth solution = new linear_search_MaxWealth();
         is used to create an instance of the linear_search_MaxWealth class.
         This instance, named solution, is necessary
         because the maximumWealth method is not a static method.
         */
    }

}
