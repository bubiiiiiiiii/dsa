public class Array {


    public static int findLargest(int[] arr) {

        int max = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr1 = {3, 7, 2, 9, 1};
        System.out.println("Array: [3, 7, 2, 9, 1]");
        System.out.println("Largest: " + findLargest(arr1));
        System.out.println();


        int[] arr2 = {-5, -2, -10, -1};
        System.out.println("Array: [-5, -2, -10, -1]");
        System.out.println("Largest: " + findLargest(arr2));
        System.out.println();


        int[] arr3 = {100};
        System.out.println("Array: [100]");
        System.out.println("Largest: " + findLargest(arr3));
    }
}


