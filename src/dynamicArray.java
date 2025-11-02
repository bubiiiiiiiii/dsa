import java.util.ArrayList;

public class dynamicArray {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(5);  //here i have defined the capacity 5
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);  //but i can still add 7 elements
        System.out.println(arr);

    }
}
