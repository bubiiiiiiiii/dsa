public class floorNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,61,61};
        int target = 5;
        int ans  = ceilingBinary(arr, target);
        System.out.println(ans);
    }
    static int ceilingBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]){ return -1;}

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
        return arr[end];
    }
}


