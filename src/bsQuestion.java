//given a sorted array where each element appears exactly twice,
//except one element which appears only once.
//Find that single element using Binary Search
public class bsQuestion {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        System.out.println("Single element: " + singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;


            if (mid % 2 == 1) {
                mid--;
            }

            // Check if the pair is correct
            if (nums[mid] == nums[mid + 1]) {

                start = mid + 2;
            } else {

                end = mid;
            }
        }

        return nums[start];
    }


}


