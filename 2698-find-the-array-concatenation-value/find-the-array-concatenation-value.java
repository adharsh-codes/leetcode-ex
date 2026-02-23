class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0, j=nums.length-1;
        long sum=0;
        while(i<=j){
            if(i==j){
                sum+=nums[i];
            }
            else{
                sum+=Long.parseLong(nums[i]+ "" +nums[j]);
                //i++;j--;
            }
            i++;j--;
        }
        return sum;
    }
}