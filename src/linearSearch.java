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
        for(int i=0; i<name.length(); i++){
           if(target==name.charAt(i)){
               return true;
           }
        }
        return false;
   }
}