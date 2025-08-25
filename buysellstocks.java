public class buysellstocks{
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int res=maxprofit(prices);
        System.out.println(res);
    }   
    public static int maxprofit(int[] nums){
        int maxprofit=0;
        int buy=nums[0];

        for(int i=0;i<nums.length;i++){
            int profit=nums[i]-buy;
            maxprofit=Math.max(maxprofit, profit);
            if(buy>nums[i]){
                buy=nums[i];
            }
        }
        return maxprofit;
    }
}