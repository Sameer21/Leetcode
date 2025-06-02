public class leetcode_missing {
    public static void main(String[] args) {
        int[] arr= {2,5,3,1,0};
        int s=missingNumber(arr);
        System.out.println(s);
        
            }
    public static  int missingNumber(int[] nums) {
    int n = nums.length;
   int expectedSum = n * (n + 1) / 2;
   int actualSum = 0;
  
   for (int num : nums) {
      actualSum += num;
  }

   return expectedSum - actualSum;
}
}
