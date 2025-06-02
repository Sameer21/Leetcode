public class leetcode_665 {
    public static void main(String[] args) {
        int[] nums= {3,4,2,3};
        boolean f= sam(nums);
        System.out.println(f);
    }
        
    public static boolean sam(int[] arr){
        int count = 0;
        int index = -1;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                count++;
                index = i;
            }
            if (count > 1) {
                return false;
            }
        }
        if (count == 1) {
            if (index == 0) {
                return arr[1] <= arr[2];
            } else if (index == arr.length - 2) {
                return arr[index - 1] <= arr[index + 1] || arr[index] <= arr[index + 1];
            } else {
                return arr[index - 1] <= arr[index + 1] || arr[index] <= arr[index + 1] || arr[index - 1] <= arr[index];
            }
        }
        return true;
    }
}