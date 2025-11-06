public class linearSearch{
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 20, 7, 15, 30};
        int target = 7;
        int start = 2;
        int end = 5;

        int result = searchInRange(arr, target, start, end);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the given range.");
        }
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr == null || arr.length == 0) return -1;

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i; // return index if found
            }
        }
        return -1; // not found
    }
}
