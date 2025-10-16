import java.util.*;

public class Array {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

        //array of primitive
   /* int[] arr;  //declaration of  an array
        arr = new int[3];  //initialization of array  //here object is actually created in the memory
     Scanner sc = new Scanner(System.in);
        //or we can do
        int num[] = {1,2,3,4,5};
          num[2] = 1; //can change array at specific index
        //displaying an array
        for(int i=0; i<num.length;i++) {
            System.out.println(num[i]);
        }


        //takes user input into an array
        for(int i=0; i<num.length;i++) {
           num[i] = sc.nextInt();
        }

        //enhanced for loop
        for(int nums:num ){
            System.out.println(nums);
        }


        //easier way to  print array
        System.out.println(Arrays.toString(num)); //this method internally uses a for loop as well


        //array of objects
        String[] str = new String[5];

        for(int i = 0 ; i<str.length ; i++ ){
            str[i] = sc.next();
        }
        System.out.print(Arrays.toString(str));  */


    }
        // mutability of arrays
        static void change(int[] arr){
               arr[0] = 4;
        }

}
