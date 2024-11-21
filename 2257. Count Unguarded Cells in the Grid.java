class Solution {
    public int countUnguarded(int m, int n, int[][] g, int[][] w) {
        int[][] use = new int[m][n];

        // Wall on Grid
        for(int i=0;i<w.length;i++){
            use[w[i][0]][w[i][1]]=-1;
        }
        
        // Guard on grid
        for(int i=0;i<g.length;i++){
            use[g[i][0]][g[i][1]]=-1;
        }
        
        for(int i=0;i<g.length;i++){
            check(g[i][0],g[i][1],use);
        }
        
        int count=0;
        for(int i=0;i<use.length;i++){
            for(int j=0;j<use[i].length;j++){
                if(use[i][j]==0){
                    count++;
                }
            }
        }
         return count;
    }
    public void check(int row,int col,int[][] arr){
        //up
        int use=row-1;
        while(valid(use,col,arr)){
            if(arr[use][col]!=-1){
                arr[use][col]++;
            }
            else{
                break;
            }
            use--;
        }
        //down
        use=row+1;
        while(valid(use,col,arr)){
            if(arr[use][col]!=-1){
                arr[use][col]++;
            }
            else{
                break;
            }
            use++;
        }
        //left
        use=col-1;
        while(valid(row,use,arr)){
            if(arr[row][use]!=-1){
                arr[row][use]++;
            }
            else{
                break;

            }
            use--;
        }
        //right
        use=col+1;
        while(valid(row,use,arr)){
            if(arr[row][use]!=-1){
                arr[row][use]++;
            }
            else{
                break;
            }
            use++;
        }
    }
    public boolean valid(int i,int j,int[][] arr){
        if(i>=0 && i<arr.length &&j>=0 && j<arr[0].length && arr[i][j]!=-1)return true;

        return false;
    }
}
