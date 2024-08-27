
// Q4. Check if an array is sorted (strictly increasing). - O(n)

public class CheckingArrayIfSort {

    public static boolean CheckArrayIfSort(int[] arr, int idx) {

        if (idx == arr.length -1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            // array is sorted till now
            return CheckArrayIfSort(arr, idx + 1);
        } else {
            return false;
        }
        }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(CheckArrayIfSort(arr, 0));
    }
}
