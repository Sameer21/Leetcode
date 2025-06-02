public class linear_search_string {
    public static void main(String[] args) {
        String name = "Sameer";
        char target ='f';
        Boolean f = search(name, target);
       // System.out.println(f);
        System.out.println(name.toCharArray());
    }
    static boolean search(String str,char target){
     if (str.length()==0) {
        return false;
        
     }
     for (int i = 0; i < str.length(); i++) {
     if(target==str.charAt(i)){
        return true;
     }        
     }
     return false;
    }
}
