import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        int[] nums=leader(arr);
        System.out.print(Arrays.toString(nums));

    }
    public static int[] leader(int[] arr){
        int n=arr.length;
        int ind=n-1;
        int max=arr[ind];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                ind--;
                arr[ind]=arr[i];
            }
        }
int[] res=new int[n-ind];
        for(int i=0;i<res.length;i++){
            res[i]=arr[ind++];
        }
        return res;
    }
}
