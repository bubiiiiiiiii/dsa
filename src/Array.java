import java.util.*;
public class Array {
    public static void main(String[] args){
    int[] arr;  //declaration of  an array
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
}}
