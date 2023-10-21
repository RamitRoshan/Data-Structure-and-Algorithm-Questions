package Arrays;

public class ReverseArrayInplace {
    //inplace- without creating additional answer array

    static void swapInArray(int[] arr, int i, int j) {
        //yha i,j swap nai krni yha i,j p pdi value swap krni hai.
        //i.e arr[i] or arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    /*eska return type void rkh skte h, kyuki esko jo
    array pass kia ja raha hai. usse ko reverse krne wala hai
     */
    static void reversearray(int[] arr){
        int i=0, j = arr.length-1;

        while(i<j){ //swap till i<j jha ye takra jaige we will stop there
            swapInArray(arr, i,j);
            i++;
            j--;
        }
    }

    //making a helper-method for printing
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reversearray(arr);
        printArray(arr);
    }
}
