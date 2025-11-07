public class findEvenNumbers {
    public static void main(String[] args) {
          int[] nums = {34,456,6543,54324,455573,2,3,89,-12};
        //  int ans = findNumbers(nums);
          //System.out.println("Numbers with even digits:" + ans);
        System.out.println(digits(0));  //returns 0 even though there is 1 digit(0)
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
        if(num<0){  //converts negative number into positive
            num = num*-1;
        }
        if(num==0){  //if we dont do this it returns 0 number of digits for "0" but 0 itself will be counted as 1 digit
            return 1;
        }
        int count = 0;
       while(num>0) {
           count++;
           num = num/10;
       }
        return count;
    }
}
