class Solution {
    public boolean canChange(String start, String target) {
        if(count(start,'_')!=count(target,'_')){
            return false;
        }
        int i=0;
        int j=0;
        char[] st = start.toCharArray();
        char[] tar=target.toCharArray();
        int len = st.length;

        while(i<len && j<len){
            
            while(i<len && st[i]=='_')i++;

            while(j<len && tar[j]=='_')j++;

            if(i==len || j==len){
                return i==len && j==len;
            }

            if(st[i]!=tar[j]){
                return false;
            }

            if(tar[j]=='L'){
                if(i<j)return false;
            }
            else{
                if(j<i)return false;
            }
            i++;
            j++;
        }
    return true;
    }
    public int count(String s,char c){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)count++;
        }
        return count;
    }
}
