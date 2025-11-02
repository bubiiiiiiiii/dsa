import java.util.Arrays;
public class reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,2);
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
    }
}
