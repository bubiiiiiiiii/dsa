public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {12, 3, 19, -5, 7, 0};

        int minValue = findMin(arr);
        System.out.println("Minimum number in the array: " + minValue);
    }

    static int findMin(int[] arr) {
        if(arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
