package Arrays;
import java.util.Arrays; //this is for only QUes-Bonus
import java.util.Scanner;

public class Arrayquestion {


    //    //ques) count the number of occurence of a particular element x
    public static int countOccurances(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
        //return for-loop khatam hone k bad likhna h
        //pura array traverse  kr lega then return krna h
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int a = sc.nextInt();

        int[] array = new int[a];
        System.out.println("Enter " + a + " elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter x ");
        int x = sc.nextInt();

        System.out.println("Count of x: " + countOccurances(array, x));
    }
}


//    //Ques) find the last occurance of an element x in a given array
//    //making method/function for this
//    public static int lastOccurrence(int[] arr, int x){
//        int lastIndex = -1;
//        for (int i=0; i<arr.length; i++){
//            if (arr[i] == x){
//                lastIndex = i;
//            }
//        }
//        return lastIndex;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int a = sc.nextInt();
//
//        int[] array = new int[a];
//        System.out.println("Enter " + a +" elements: ");
//        for (int i=0; i<array.length; i++){
//            array[i] = sc.nextInt();
//        }
//        System.out.println("Enter x ");
//        int x =sc.nextInt();
//
//        System.out.println("Last Occurrence of x: " + lastOccurrence(array, x));
//    }



//    //Ques) count the number of elements Strictly greater than value of x
//        public static int StrictlygreaterOccurances(int[] arr, int x){
//        int count  = 0;
//        for (int i = 0; i<arr.length; i++){
//            if (arr[i] > x){
//                count ++;
//            }
//        }
//        return count;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int a = sc.nextInt();
//
//        int[] array = new int[a];
//        System.out.println("Enter " + a +" elements: ");
//        for (int i=0; i<array.length; i++){
//            array[i] = sc.nextInt();
//        }
//        System.out.println("Enter x ");
//        int x =sc.nextInt();
//
//        System.out.println("Strictly greater value of x: " + StrictlygreaterOccurances (array, x));
//    }


//    //Ques) CHeck given array is sorted or not
//    public static boolean isSorted(int[] arr){
//        //ye boolean method ek array lega
//        boolean check = true; //initially ese true de dete h
//        for (int i=1; i<arr.length; i++){
//            /*
//           for  i=0
//            arr[0] < arr[-1]
//            -1 koi index hi nai h and ye 0 se suru ho raha h .
//            -1 sse to nai ho skta n and hmne discuss kia tha
//            jo compare honge wo 2nd elelemnt se hoga so
//            i=0 k jagah i=1 krna pdega
//             */
//            if (arr[i] <arr[i-1]){
//                //not sorted
//                check = false;
//                break;
//            }
//        }
//        return check; //kyuki hme boolean hi return krna tha so return check
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int a = sc.nextInt();
//
//        int[] array = new int[a];
//        System.out.println("Enter " + a +" elements: ");
//        for (int i=0; i<array.length; i++){
//            array[i] = sc.nextInt();
//        }
//        System.out.println("Is Sorted: " + isSorted(array));
//    }


//    /* Ques-Bonus)make a function which return array where its 1st value
//    of array will be smallest element and 2nd vlue of this array
//    will be the biggest element.
//    */
//    public static int[] smallestAndLargesElement(int[] arr){
//        Arrays.sort(arr);
//        int[] ans = {arr[0], arr[arr.length-1]};
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int a = sc.nextInt();
//
//        int[] array = new int[a];
//        System.out.println("Enter " + a +" elements: ");
//        for (int i=0; i<array.length; i++){
//            array[i] = sc.nextInt();
//        }
//        int[] ans = smallestAndLargesElement(array);
//        System.out.println("Smallest: " + ans[0]);
//        System.out.println("Largest: " + ans[1]);
//    }
//}
