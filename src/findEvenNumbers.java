public class findEvenNumbers {
    public static void main(String[] args) {
          int[] nums = {34,456,6543,54324,455573,2,3,89,-12};
        //  int ans = findNumbers(nums);
          //System.out.println("Numbers with even digits:" + ans);
        System.out.println(digits(233445));  //tells the number of digits
    }


    //function to calculate how many number with even digit are there
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if(evenNum(num)){
                count++;
            }
        }
        return count++;
    }

    //function to check if a number contains even number of digits or not
    static boolean evenNum(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
    }
        return false;
    }


    //count number of digits in a number
    static int digits(int num){
        int count = 0;
       while(num>0) {
           count++;
           num = num/10;
       }
        return count;
    }
}
