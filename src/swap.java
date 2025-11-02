import java.util.Arrays;
public class swap {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        swap(arr, 1,2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2]; //writing arr is important code wasn't running cuz of it
        arr[index2] = temp;
    }
}
