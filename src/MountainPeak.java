//A mountain array increases then decreases.
//Find the peak index.
public class MountainPeak {
    public static int peakIndex(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,4,2};
        System.out.println(peakIndex(arr)); // Output: 3
    }
}

