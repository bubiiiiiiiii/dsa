public class linearSearch {
    public static void main(String[] args) {
        String name = "bubi";
        char target = 'u';
        System.out.println(StringSearch(name, target));
}
   static boolean StringSearch(String name, char target){
        if(name.length()==0){
          return false;
        }
        for(char ch:name.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
   }
}