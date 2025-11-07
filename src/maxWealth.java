public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {9,4,5},
                {7,8,5},
                {5,7,9}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int person=0; person<accounts.length; person++){
            //when u start a new col, take new sum for that row
            int sum = 0;
            for(int account=0; account<accounts[person].length; account++){
              sum += accounts[person][account];
            }
            //now we have sum of account of all persons
            //compare it with the ans
            if(sum>ans){  //checks which persons account is the greatest
                ans = sum;
            }
        }
        return ans;
    }
}
