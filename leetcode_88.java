
class leetcode_88{
    public static void main(String[] args) {
        
    }
    public void solution(int[]nums1,int m,int[] nums2,int n){
        int[] n= new int[n+m];

        for (int i=0;i<nums1.length-1&&i<m;i++) {
            nums1[i]=n[i];
        }
        for(int j=m;j<nums2.length-1&&j<n;j++){
             nums2[j]=n[j] ;  
        }
    }
}