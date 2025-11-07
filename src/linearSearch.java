import java.util.Arrays;
public class linearSearch{
    public static void main(String[] args) {
      int[][] arr = {
              {1,2,3},
              {4,5,6},
              {7,8,9}
      };
      int target = 7;
        int[] ans = search2DArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2DArray(int[][] arr, int target){
        if(arr.length==0){
            return new int[]{-1, -1};
        }
        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                int element = arr[i][j];
                if(element==target){
                    //or we can return an array(more better)
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
