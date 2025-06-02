public class leetcode_125 {
    public static void main(String[] args) {
        String s="NAMA;N";
        boolean k= solution(s);
        System.out.println(k);
        
    }
    public static boolean solution(String s){

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i=0;
        int j=s.length()-1;

        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }


        return true;
    }
}
