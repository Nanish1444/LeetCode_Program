class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();

        PriorityQueue<Integer> pq;

        for(int i=0;i<nums.length;i++){

            pq = new PriorityQueue<>(Comparator.reverseOrder());

            pq.add(nums[i]);

            for(int j=i+1;j<i+k && (i+k)<=nums.length;j++){

                    pq.add(nums[j]);
            }

            if(!pq.isEmpty() && pq.size()==k){

                arr.add(pq.poll());
            }
        }

        int[] re = new int[arr.size()];

        for(int i=0;i<arr.size();i++){

            re[i]=arr.get(i);

        }

        return re;
    }
}
