import java.util.Arrays;

public class leetcode_34 {
    public static void main(String[] args) {
        int[] num={1};
        int terget=1;
        int[] f=range(num, terget);
        System.out.println(Arrays.toString(f));
    }
    static int[] range(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >= 0; j--) {
                if (arr.length==0) {
                    return new int[]{0,0};
                }
                else if (arr[i]==target&&arr[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
