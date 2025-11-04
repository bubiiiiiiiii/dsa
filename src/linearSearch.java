public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {3,54,23,46,76};
        int target = 2;
        int ans = linearsearch(arr, target);  //calling function
        System.out.println("element found at index:"+" "+ans);  //printing output
    }
    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {   //checking if array is empty
            return -1;   //return nothing if array is  empty
        }

        for (int index = 0; index < arr.length; index++) {  //iterating over every element to find target
            int element = arr[index];   //naming element to compare with target
            if (element == target) {
                return index;  //returns index of the target when found
            }
        }
        return -1;  //if target not found
    }

}