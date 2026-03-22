class Solution {
    public int reverse(int x) {
          long result=0;
          while(x!=0){
             int rem=x%10;
             result+=rem;
             result=result*10;
             x=x/10;
          }
          result=result/10;
          if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
            return 0;
          }
          if(x<0){
            return (int)(-1*result);
          }
          return (int)result;
    }
}