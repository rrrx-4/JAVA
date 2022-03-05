class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int inc = 0;
        int exc = 0;
        
        int[] count = new int[100001];
       
        for(int v : nums){
            count[v]++ ;
        }
        
        for(int i=0; i<count.length; i++)
        {
            int t= exc+count[i]*i;
            int d = Math.max(inc,exc);
            
            inc=t;
            exc=d;
        }
        
       return Math.max(inc,exc);
    }
}