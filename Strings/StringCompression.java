package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbbbccddde";
        //given below string ans ko direct initialize nai kr skte
        //error aa jaiga so we have to give a "".
       // String ans = str.charAt(0);

        String ans = "" + str.charAt(0); //yha 'a' to hoga hi 0th index p
        int count = 1; //yha 1 eslia h kyuki initially ans m 'a' ek bar to hoga hi

        //here in loop i=1 , kyuki 0th character dekh chuka hu main
        for (int i=1; i<str.length(); i++){
            char curr = str.charAt(i); //current character
            char prev = str.charAt(i-1);
            //kyuki hm i= 1 se start kre so charAT 0(1-1) hogi
            if (curr==prev){
                count ++;
            }
            else{
                if (count>1) ans +=count; //it is used so if 'e' is one time then it should not print e1 just print only 'e'

//                ans += count;
//                //count is using to count a so it can be a3
                count = 1;
                //count=1 because jb, 'b' se start hoga count then it should be 1
                ans += curr;
                //ans main 'b' add krdo like: a3b

            }
        }
        if (count>1) ans +=count;
       // ans +=count;
        //its using because to add 'e', kyuki jb 'e' khatam hua to kuch aaya
        //hi nai. so else use nai ho paya
        System.out.println(ans);

    }
}
