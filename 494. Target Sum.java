class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        back(nums,0,0,target);
        return count;
    }
    public void back(int[] arr,int index,int sum ,int tar){
       

        if(index==arr.length){
            if(sum==tar){
                count++;
            }
        }
        else{
            back(arr,index+1,sum+arr[index],tar);
        
            back(arr,index+1,sum-arr[index],tar);

        }
    }
}
