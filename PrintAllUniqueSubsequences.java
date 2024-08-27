
// Q8. Print all unique subsequences of a string.

public class PrintAllUniqueSubsequences {

    // Helper function to check if the subsequence has already been printed
    public static boolean isUnique(String[] printedSubsequences, String newSubsequence, int count) {
        for (int i = 0; i < count; i++) {
            if (printedSubsequences[i].equals(newSubsequence)) {
                return false; // The subsequence has already been printed
            }
        }
        return true; // The subsequence is unique
    }

    public static void PrintUniqueSubsequences(String str, int idx, String newString, String[] printedSubsequences, int count) {

        // Base case: when idx reaches the length of the string
        if (idx == str.length()) {
            if (isUnique(printedSubsequences, newString, count)) {
                printedSubsequences[count] = newString; // Store the unique subsequence
                System.out.println(newString);
            }
            return;
        }

        // Take the current character
        char currChar = str.charAt(idx);

        // Choose to include the current character in the subsequence
        PrintUniqueSubsequences(str, idx + 1, newString + currChar, printedSubsequences, count);

        // Choose not to include the current character in the subsequence
        PrintUniqueSubsequences(str, idx + 1, newString, printedSubsequences, count + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        // Array to store printed subsequences
        String[] printedSubsequences = new String[(int) Math.pow(2, str.length())];
        PrintUniqueSubsequences(str, 0, "", printedSubsequences, 0);
    }
}

