package Strings;

public class reverseWordInSentence {
    public static void main(String[] args) {
        String str = "I am an online educator";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i); //in loop we are talking about character
            if (ch != ' '){
                sb.append(ch);
            } else { // using else when ch == ' '
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
