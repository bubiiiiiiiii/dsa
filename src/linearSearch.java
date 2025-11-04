public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {3,54,23,46,76};
        int target = 54;
        int ans = linearsearch(arr, target);  //calling function
        if(ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(ans);
        }
    }
    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {   //checking if array is empty
            return -1;   //return nothing if array is  empty
        }
        for (int element : arr) {
            if (element == target) {
                return element;  //returns element itself
            }


        }
        return -1;  //if target not found
}
}