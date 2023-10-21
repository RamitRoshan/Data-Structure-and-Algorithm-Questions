package Arrays;

public class practiceques_arr {


//    //calculate the sum of all element in the given array
//    void sumofArray(){
//        int[] arr = {1,4,5,3,5};
//        int sum = 0;
//
//        for (int i=0; i<arr.length; i++){
//            sum = sum +arr[i];
//        }
//        System.out.println(sum);
//    }
//    public static void main(String[] args) {
//
//        practiceques_arr p = new practiceques_arr();
//         p.sumofArray();
//    }


    //ques).calculate the maximum value out of all the elements in the array
    //in this all integer are positive
    public static void maxofArray(){
        int[] arr = {5,3,6,2,8,4}; //8

        int ans = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > ans){ //arr[i] agar bda hoga tohm ans variable ko update lr dege
               ans = arr[i];
            }
        }
        System.out.println("Max " + ans);
    }
    public static void main(String[] args) {
        practiceques_arr max = new practiceques_arr();
        max.maxofArray();
    }



//    /* ques) search the given element x in array. if present then
//    return the index, else return -1.
//     */
//    void searchInArray(){
//        int arr[] = {2,4,6,10,6};
//
//        int x = 6;
//        //ans ko initialize kr raha -1 se
//        int ans = -1;
//        for (int i = 0; i<arr.length; i++){
//            //now have to compare
//            if (arr[i] == x){
//                ans = i;
//                break;
//                //break keyword is used,kyuki agar koi number 2 bar aa jay to
//                //firstoccurence m rok dee.
//            }
//        }
//
//        System.out.println("Found " + x + " at index " + ans);
//    }
//    public static void main(String[] args) {
//     practiceques_arr search = new practiceques_arr();
//     search.searchInArray();
//    }
}
