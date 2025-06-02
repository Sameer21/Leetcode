public class linear_search {
    public static void main(String[] args) {
        int[] nums = {1,3,23,45,235,66,};
        int target= 45;
        int ans = linearsearch(nums,target);
        
        System.out.println(target);
        System.out.println(ans);
        
    }
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return  -1; 
            
        }
        for (int i = 0; i < arr.length; i++) {
        int element = arr[i];
        if (element==target) {
            return i;
            
            
        } 
                  
        }
        return-1;
    }
  
}
