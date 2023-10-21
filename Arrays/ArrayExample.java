package Arrays;

public class ArrayExample {

    void multiArrays(){

        //Traversing 2-D/multidimentional array
        int[][] arr = {{56,43,6},{34,7,8}};

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                 //using arr[i].length se hm ander wale loop m jane ki kosis krraha
                System.out.println(arr[i][j]);
            }
        }


//        //2-D arrays
//        //int[] [] arr_1 = new int[5][3];
//        int[][] arr = {{56,43,6},{34,7,8},{12,56,8}};
//
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
//
//        System.out.println(arr[1][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[1][2]);
//
//        System.out.println(arr[2][0]);
//        System.out.println(arr[2][1]);
//        System.out.println(arr[2][2]);
   }

    void demoArrays(){
        int[] ages = new int[3];
        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;


        //manual/traditional way to print ages
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);


        //Traversing 1-D array
        //using for-loop to print ages
        for (int i=0; i<ages.length; i++){
            System.out.println(ages[i]);
        }

        //for-each loop means, print each and every value.
        /*the major limitation of this is , we have to print
        whole arrays, we can not print partial array, as we can do in for-loop
         */
        for (int age: ages){
            System.out.println(age);
        }


        //using while-loop
        int i=0;
        while(i<ages.length){
            System.out.println(ages[i]);
             i = i+1;  //i=i+1 is equals to i++
        }
    }
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();

        obj.multiArrays();

        obj.demoArrays();

    }
}
