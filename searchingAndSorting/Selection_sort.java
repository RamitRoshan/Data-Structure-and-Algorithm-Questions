package searchingAndSorting;

public class Selection_sort {

    static void selectionSort(int[] arr){
        int n = arr.length;

        //i, 0 se n-2 tak challega . kyuki n-1 p loop break ho jaiaga as i<n-1
        for(int i=0; i<n-1; i++){ //i represent the current index

            //find the minimum element in unsorted part of array
            int min_index = i;
            for(int j= i+1; j<n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            //swap current element and minimum element->current index i will
            //have correct element and a[min_index], a[i] will swap
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] a = {7,4,5,1,2};
        selectionSort(a);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
