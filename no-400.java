
class Solution {
    public int findNthDigit(int n) {
        long digit =1;
        long start=1;
        long count=9;
        while(n>(count*digit)){
            n-=(digit*count);
            digit++;
            start= start*10;
            count=count*10;
        }long num=start+((n-1)/digit);
        String s=Long.toString(num);

        int id= (n-1)%(int)digit;
        int res = s.charAt(id) - '0';
         return res; 
    }
}
