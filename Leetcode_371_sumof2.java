class Solution {
    public int getSum(int a, int b) {
        int sum=a^b;
        int carry=a&b;
        while(carry!=0){
            carry=carry<<1;
            int tempsum=sum^carry;
            int tempcarry=sum&carry;
            sum=tempsum;
            carry=tempcarry;
        }
        return sum;
    }
}
