package searchingAndSorting;

public class Bubble_sort {

    static void bubblesort(int[] a){
        int n = a.length;
        //we have to do n-1 iteration/passes
        //i=0 to i=n-2- n-1
        //chuki n-1 m loop tut jaigi
        for(int i=0; i<n-1; i++){ //outer loop
            // we have to know, koi swap hua h ya nai
            boolean flag = false; //has any swapping happened
            for(int j=0; j< n-i-1; j++){
                /*n-i-1 because last ith elements are already at correct,
                sorted. so no need to check then
                 */
                if(a[j]> a[j+1]){
                    //swap-a[j], a[j+1], because j>j+1
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    flag = true; //it means koi na koi swap hua hai
                }
                if(!flag){ // have any swaps happened?
                    //(!flag is equal to flag== false)
                    return; //means end
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3};
        bubblesort(arr);
        //using loop to print
//        //we are using for-each loop, but we can use for loop also
//        for (int i: a){
//            System.out.print(i + " ");
//        }
        //using for-loop
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
