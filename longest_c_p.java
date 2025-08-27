import java.util.Arrays;

public class longest_c_p{
    public static void main(String[] args) {
        String[] strs={"fower","flow","flight"};
        String res=longestCommonPrefix(strs);
        System.out.println(res);
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1= strs[0];
        String str2= strs[strs.length-1];
        int index=0;
        while(index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
    return index == 0 ? "" : str1.substring(0, index);
    }
}
