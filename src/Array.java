//Given an integer array, find the second largest number in it without sorting the array.
public class Array {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 20, 3, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest Number: " + secondLargest);
    }
}