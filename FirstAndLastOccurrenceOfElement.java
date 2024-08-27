
// Q3. Find the occurrence of the first and last occurrence
// of an element using recursion.

public class FirstAndLastOccurrenceOfElement {

//    making the first and last occurrence static so that they don't
//    get changed in the throughout recursion process
    public static int first = -1;
    public static int last = -1;

    public static void FirstAndLastOccurOfElement(String str, char currentChar, int idx) {

        if (idx == str.length()) {
            return;
        }
//        This checks if the character at the current index
//        idx matches the currentChar
        if (str.charAt(idx) == currentChar) {

//        base case then will be-
        if(first == -1){
            first = idx;
            System.out.println(first);
        } else{
            last = idx;
            System.out.println(last);
        }

       }

        FirstAndLastOccurOfElement(str, currentChar, idx + 1);

    }


// main method

    public static void main(String[] args) {

       String str = "abaacdaefaah";
       char currentChar = 'a';

//       now call the function
       FirstAndLastOccurOfElement(str, currentChar, 0);

        System.out.println("First Occurrence of " + str + " is: " + first);
        System.out.println("Last Occurrence of " + str + " is: " + last);



    }
}
