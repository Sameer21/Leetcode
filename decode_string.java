

public class decode_string {
    public static void main(String[] args) {
        String s= "3[a]2[bc]";
       String res= decodeString(s);
       System.out.println(res);
        

        
    }
    public static String decodeString(String s) {
        char[] ch= s.toCharArray();
        StringBuilder result= new StringBuilder();
        for(int i=1;i<s.length()-1;i++){
            if(ch[i]=='[' || ch[i]==']'){
                i++;
                
            }
            else {
              result.append(ch[i]*ch[i-1]);
            }
        }
        return result.toString();
    }
}
