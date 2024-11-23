class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char[][] use = new char[box[0].length][box.length];
        int cloumn=box.length-1;
        for(char[] temp : box){
            int length=temp.length-1;
            move(length,temp);
            for(int i=0;i<temp.length && cloumn>=0;i++){
                use[i][cloumn]=temp[i];
            }
            cloumn--;
        }
        return use;
    }
    public void move(int end,char[] temp){
        while(end>=0){
            if(temp[end]!='#'){
                end--;
                continue;
            }
            else if(temp[end]=='#'){
                int start=end+1;
                while(start<temp.length){
                    if(temp[start]=='*' || temp[start]=='#'){
                        break;
                    }
                    else if(temp[start]=='.'){
                        temp[start-1]='.';
                        temp[start]='#';
                    }
                    start++;
                }
                end--;
            }
        }
    }
}
