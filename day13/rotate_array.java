
public class Main {
    public static void main(String[] args){
        int[]nums={1,2,3,4,5,6,7};
        int k=3;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }


public static int[] reverse(int[]nums,int start,int end){
    int l=start;
    int r=end;
    while(l<r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
    }
    return nums;
}}