class Solution {
    public int[] numberOfPairs(int[] nums) {
        //int[] count = new int[101];
        /*int j=nums[0];
        for(int i=j+1;i<nums.length;i++){
            if(nums[j]==nums[i]){
                count++;
                j++;
            }
        }
        return new int[2]{count,nums.length};*/
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        int pairs=0;
        int leftover=0;
        for(int freq: freqMap.values()){
            pairs+=freq/2;
            leftover+=freq%2;
        }
    return new int[]{pairs,leftover};
    }
}