public class leetcode_81 {
    public static void main(String[] args) {
        int[] nums={1};
        int target=1;
        System.out.println(srt(nums, target));
    }
    public static boolean srt(int[] arr,int target){
        boolean f=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return f;
            }
        }
        return false;
    }
}