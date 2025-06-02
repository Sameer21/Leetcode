import java.sql.Array;
import java.util.Arrays;

public class leetcode_1672 {
    public static void main(String[] args) {
        int[][] sam={
            {1,2,3},
            {4,3,2},
            {2,6,0}
        };
        int f=maximumWealth(sam);
        System.out.println(f);
    }
   static int maximumWealth(int[][] arr) {
        int ans=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int sum=0;
        for (int col = 0; col < arr[row].length; col++) {
            sum+=arr[row][col];
            if (sum>ans) {
                ans=sum;
            }
        }        
    } 
       
        return ans;
    }
    
    
}
