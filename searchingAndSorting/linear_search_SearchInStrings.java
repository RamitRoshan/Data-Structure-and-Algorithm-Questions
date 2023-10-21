package searchingAndSorting;

import java.util.Arrays;

public class linear_search_SearchInStrings {

//    static boolean search(String str, char target){
//        if(str.length()==0){
//            return false;
//        }
//        for(int i=0; i<str.length(); i++){
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
static boolean search(String str, char target){
    if(str.length()==0){
        return false;
    }
    for(char ch: str.toCharArray()){
        if(ch==target){
            return true;
        }
    }
    return false;
}
    public static void main(String[] args) {
        String name = "JaiSriRam";
        char target = 'R';
      //  System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
//how to search in a particular range
