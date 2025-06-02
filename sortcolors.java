class sortcolors{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int[] arr={2,0,2,1,1,0};
        
       System.out.println(sol(arr).toString());


    }
    public static void sol(int[] nums) {
        int low=0;
        int high=nums.length-1;

        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]==0){
                swap(low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(mid, high);
                high--;
            }
        }
        return 
    }
    private static void swap(int low, int mid) {
        int temp=low;
        low=mid;
        mid=temp;
        throw new UnsupportedOperationException("Unimplemented method 'swap'");
    }
}