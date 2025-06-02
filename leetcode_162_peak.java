import java.util.Arrays;
//incomplete use sorting techniques


public class leetcode_162_peak {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 7, 8, 9};
        int f = peak(nums);
        System.out.println(f);
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int max = 0;
            int mid = start + (end - start) / 2;
            if (arr[mid + 1] > arr[mid]) {
                end = mid;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
      

      
        
     

