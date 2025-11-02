import java.util.Arrays;
public class reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       // swap(arr,0,4); //keep the index in mind  //don't need the swap statement in reverse question
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){  // forgot the while loop
        swap(arr,start,end);  //index is start and end not 0 and 4
        start++;
        end--;
    }}
    static void swap(int[] arr, int index0, int index4){
        int temp = arr[index0];
        arr[index0] = arr[index4];
        arr[index4] = temp;
    }
}
