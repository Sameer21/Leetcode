
import java.util.Arrays;

public class leetcode_mergesorted_array {
    public static void main(String[] args) {
        int[]nums={1,2,3,0,0,0};
        int[] num ={4,5,6};
        int[] f = merge(nums,num);
        System.out.println(Arrays.toString(f));


    }
    public static int[] merge(int[] arr,int[] arr2){
        int temp=21;
        for (int i = 0; i < arr.length-1; i++) {
           if (arr[i]==0) {
               arr[i]=temp;
           }
        }
        return new int[]{-1,-1};
    }
}
