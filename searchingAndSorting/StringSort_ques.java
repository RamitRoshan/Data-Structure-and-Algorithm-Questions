package searchingAndSorting;

public class StringSort_ques {
    static void sortFruits(String[] frut){
        int n = frut.length;
        for(int i=0; i<n-1; i++){ //outer loop
            int min_index = i;
            for(int j=i+1; j<n; j++){
                if(frut[j].compareTo(frut[min_index])< 0){
                    min_index =j; //updated min_index = j;
                }
            }
            //swap frut[min_index], frut[i]
            String temp = frut[i];
            frut[i] = frut[min_index];
            frut[min_index] = temp;
        }
    }
    public static void main(String[] args) {

        String[] fruits = {"kiwi", "apple", "papaya", "mango"};
        sortFruits(fruits);

//        //using for-loop to print the string
//         for(int i =0; i< fruits.length; i++){
//        System.out.print(fruits[i] + " ");
//    }

         //using for-each loop to print the string
        for(String val: fruits){
            System.out.print(val + " ");
        }
    }
}
