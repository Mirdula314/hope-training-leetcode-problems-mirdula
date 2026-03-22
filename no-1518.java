class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int empty=numBottles;
       int drank=numBottles;
        while(empty >= numExchange){
            int full=empty/numExchange;
            
            drank+=full;
            empty=(empty%numExchange)+full;
        }
        return drank;
    }
}