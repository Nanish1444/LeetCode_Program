class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();

        PriorityQueue<Integer> pq;

        for(int i=0;i<nums.length;i++){

            pq = new PriorityQueue<>(Comparator.reverseOrder());

            MOVE(pq,i,k,nums);

            if(!pq.isEmpty() && pq.size()==k){

                arr.add(pq.poll());

            }

        }

        int[] re = new int[arr.size()];
        for(int j=0;j<arr.size();j++){
            re[j]=arr.get(j);
        }
        return re;
    }

    public static void MOVE(PriorityQueue<Integer> pq,int start,int end,int[] nums){
        for(;start<end;start++){
            pq.add(nums[start]);
        }
        return ;
    }

}