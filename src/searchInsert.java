//If target exists, return index.
//If not, return the index where it should be inserted.
public class searchInsert {
    public static int searchInsert(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return start; // insertion position
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 2)); // Output: 1
    }
}

