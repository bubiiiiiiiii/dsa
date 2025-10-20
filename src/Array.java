public class Array{
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Original array: ");
        printArray(numbers);

        // Access elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Modify an element
        numbers[2] = 35;
        System.out.print("After modifying third element: ");
        printArray(numbers);

        // Array length
        System.out.println("Array length: " + numbers.length);

        // Find sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);

        // Loop through array
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Find maximum value
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}