class Solution {
    int count=0;
    public int countMaxOrSubsets(int[] nums) {
        int max=0;

        for(int num : nums){
            max|=num;
        }
        backtrack(nums,0,0,max);
        return count;
    }
    public void backtrack(int[] nums,int index,int curOr,int maxOr){
        
        if(curOr==maxOr){
            count++;
        }
        for(int i=index;i<nums.length;i++){
            
            backtrack(nums,i+1,curOr|nums[i],maxOr);
        }
    }
}
