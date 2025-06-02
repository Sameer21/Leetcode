import java.util.Arrays;
//INCOMPLETE
public class leetcode_136 {
    public static void main(String[] args) {
        int[] nums={2,2,3,3,1};
        int[] f= single(nums);
        System.out.println(Arrays.toString(f));
    }
    static int[] single(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i+1]!=arr[i]&&arr[i+2]!=arr[i]) {
                return new int[]{arr[i]};
            }
            
    }
    return new int[]{-1,-1};
}
}
