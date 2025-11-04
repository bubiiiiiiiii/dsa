public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {3,54,23,46,76};
        int target =54;
        boolean ans = linearsearch(arr, target);  //calling function
        System.out.println(ans);
        }

    static boolean linearsearch(int[] arr, int target) {
        if (arr.length == 0) {   //checking if array is empty
            return false;   //return nothing if array is  empty
        }
        for (int element : arr) {
            if (element == target) {
                return true;  //returns element itself
            }


        }
        return false;  //if target not found
}
}