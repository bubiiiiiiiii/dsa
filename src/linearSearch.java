public class linearSearch{
    public static void main(String[] args) {
      int[] arr = {3,56,34,32,67,23};
      int target = 32;
      int start = 1;
      int end = 4;
        System.out.println(searchInRange(arr, target, 1, 4));
    }
    static int searchInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i<end; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;

    }
}
