
//Q2. Print a string in reverse.

public class PrintStringInReverse {

    public static void PrintStringReverse(String str, int idx) {
        if(idx == 0){  // BASE CASE
            System.out.println(str.charAt(idx));
            return;
        } // IF THIS NOT, THEN ELSE

        System.out.print(str.charAt(idx));
        // function call
        PrintStringReverse(str, idx-1);
    }

    public static void main(String[] args) {

        String str = "abcd";
        PrintStringReverse(str, str.length()-1);

    }

}









//    public static String revString(String str) {
//        if(str.length() == 1) {
//            return str;
//        }
//        char currChar = str.charAt(0);
//        String nextString = revString(str.substring(1));
//        return nextString + currChar;
//    }
//    public static void main(String [] args) {
//
//        String str = "abcd";
//        String reversed = revString(str);
//        System.out.println(reversed);
//    }
