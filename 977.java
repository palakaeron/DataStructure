import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp=0;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]= nums[i]*nums[i];
        }
        for(int i=0; i<ans.length; i++){
            for(int j= i+1; j<ans.length; j++){
                if(ans[i]>ans[j]){
                    temp = ans[i];
                    ans[i]= ans[j];
                    ans[j]= temp;
                }
            }
        }
        // Arrays.sort(ans);
        return ans;

    }
}
