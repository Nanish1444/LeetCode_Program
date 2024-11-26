class Solution {
    public int findChampion(int n, int[][] edges) {
        if(edges.length==0 && n==1)return 0;

        Set<Integer> win = new HashSet<>();
        Set<Integer> def = new HashSet<>();
        for(int[] temp : edges){
            if(!win.contains(temp[0]) && !def.contains(temp[0])){
                win.add(temp[0]);
            }
            else if(def.contains(temp[0])){
                if(win.contains(temp[0])){
                    win.remove(Integer.valueOf(temp[0]));
                }
            }
            if(!def.contains(temp[1])){
                if(win.contains(temp[1])){
                    win.remove(Integer.valueOf(temp[1]));
                }
                def.add(temp[1]);
            }
        }
        
        
        if(win.size()==1 && win.size()+def.size()==n){
            for(int re : win)return re;
        }
        return -1;
    }
}
