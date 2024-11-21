class Solution {
    List<List<Integer>> ma = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] can, int target) {
        Arrays.sort(can);
        back(can,0,new ArrayList<>(),target);
        return ma;
    }
    public void back(int[] can , int index,ArrayList<Integer> list,int tar){
        if(tar==0){
                ma.add(new ArrayList<>(list));
            
            return;
        }
        
        for(int i=index;i<can.length;i++){
            if(i>index && can[i-1]==can[i])continue;
            else if(can[i]>tar){
                break;
            }

            list.add(can[i]);
            back(can,i+1,list,tar-can[i]);
            list.remove(list.size()-1);
        }


    }
}
