
//Q7. Print all the subsequences of a string.

public class PrintAllSubsequences {

    public static void PrintAllsubsequences(String str, int idx, String newString ){

        // Base case: when idx reaches the length of the string
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx); // take current character value here

       /* choose to be in the string ->
         her ewe will add the current character with the newString
         and as well as will promote the value of idx to idx++
        */
        PrintAllsubsequences(str, idx+1, newString+currChar);

        // choose not to be in the string
        PrintAllsubsequences(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        PrintAllsubsequences(str, 0, "");

    }
}
