public class leetcode_1295 {
    public static void main(String[] args) {
        int[] sam ={12,13,123,3254,235};
        int f= findNumbers(sam);
        System.out.println(f);
        //ans=3
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        int numberofDigits=digits(num);
        return numberofDigits %2 == 0;
       
    }
    static int digits(int num){
        int count=0;
        while (num>0) {
            count++;
            num=num/10;
        }
        return count;
    }
    
}
