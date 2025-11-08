public class BinarySearch {
    public static  void main(String[] args){
        int[] arr = {23,34,56,67,78,87,88,98};
        int target = 88;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start<= end){
          //  int mid = start+end/2;  //if we do this its possible that the add of end and start exceeds the range of int in java and will show some error(overflow basically)
          //so a better way to do this is
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
