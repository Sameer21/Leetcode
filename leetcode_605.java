
public class leetcode_605 {
    public static void main(String[] args) {
        int[] nums={1,0,0,0,1,0,1};
        int n=1;
        boolean f=flower(nums,n);
        System.out.println(f);
    }
    static boolean flower(int[] arr,int n){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                int prev=(i==0 || arr[i-1]==0)?0:1;
                int next=(i==arr.length-1|| arr[i+1]==0)?0:1;

                if (prev==0 && next==0) {
                    arr[i]=1;
                    count++;
                }
            }
        }
        return count>=n;

    }
}
