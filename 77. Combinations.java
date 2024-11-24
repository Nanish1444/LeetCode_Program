class Solution {
    List<List<Integer>> ma=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        back(arr,0,new ArrayList<>(),k);
        return ma;
    }
    public void back(int[] arr,int index,List<Integer> list,int limit){
        if(list.size()==limit){
            ma.add(new ArrayList<>(list));
            return;
        }
        if(index==arr.length){
            return;
        }
        
        if(list.size()<limit){
            list.add(arr[index]);
            back(arr,index+1,list,limit);
        }
        list.remove(list.size()-1);
        back(arr,index+1,list,limit);

        
    }
}
