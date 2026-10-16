class Solution {
    public int[] countBits(int n) {
       int[] res = new int[n+1];

       for(int i = 0; i<=n; i++){
           int num = i;
           while(num != 0){
            res[i]++; 
            num &=(num - 1);
        
           }
       }

       return res;
    }
}
