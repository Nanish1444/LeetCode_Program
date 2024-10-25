class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length<4)return list;
        for(int i=0;i<nums.length-3;i++){
            if(i>=0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        List<Integer> temp=List.of(nums[i],nums[j],nums[k],nums[l]);
                        if(!list.contains(temp)){
                            list.add(List.of(nums[i],nums[j],nums[k],nums[l]));
                        }
                        
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        k++;
                    }
                }
            }
        }
        return list;
    }
}
