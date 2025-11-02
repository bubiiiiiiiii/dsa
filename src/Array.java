import java.util.Arrays;

public class Array{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Array contents: " + Arrays.toString(numbers));

        // Without toString() method output gives memory address of the array not the actual elements
        System.out.println("Without toString(): " + numbers);
    }
}