package searchingAndSorting;

public class Insertion_sort {

    //In method we write void, kuch bhi return nai krna h.
    //arr k ander hi change krna hai
    static  void insertionSort(int[] arr){
        int n = arr.length;
        /*here for-loop, humne i=1 se suru kia hai.
         */
        for(int i=1; i<n; i++){
            int j = i;
            while(j> 0 && arr[j] <arr[j-1]){
                //swap arr[j], arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
                //after swaping curent element k index ek kam ho gya hoga so j--
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {8, 3, 6, 5, 4, 2};
        insertionSort(a);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
