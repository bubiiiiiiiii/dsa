// Q:If you’re given a sorted array and a target number,
//the ceiling is the smallest element in the array that is greater than or equal to the target.
//If no such element exists (i.e., all are smaller than target), we usually return -1 or indicate “no ceiling”.
public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,45,67,89,90};
        int target = 91;  //returns -1
        int ans  = ceilingBinary(arr, target);
        System.out.println(ans);
    }
    static int ceilingBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]){ return -1;} // no ceiling exists

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];  //at the end if no number=target element found the while loop breaks
        //return start instead of -1
    }
} // whole code remains same as binary search except for return value
