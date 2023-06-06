class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==0) c0++;
            if(nums[i]==1) c1++;
            if(nums[i]==2) c2++;
        }
        for(int i=0; i<c0; i++){
            nums[i] = 0;
        }
        for(int j=c0; j<c0+c1; j++){
            nums[j] = 1;
        }
        for(int k=c1+c0; k<c0+c1+c2; k++){
            nums[k] = 2;
        }
    }
}
