public class linearSearch{
    public static void main(String[] args) {
      int[][] arr = {
              {1,2,3},
              {4,5,6},
              {7,8,9}
      };
      int target = 7;
        System.out.println(search2DArray(arr, target));
    }
    static int search2DArray(int[][] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                int element = arr[i][j];
                if(element==target){
                    return i,j; //invalid
                }
            }
        }
        return -1;
    }
}
