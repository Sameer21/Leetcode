public class kadane_maxsubarray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int res=kad_sum(arr);
        System.out.println(res);
    }

    
    public static int kad_sum(int[] arr){
        int sum=0;
        int maxsum=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxsum){
                maxsum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
}
