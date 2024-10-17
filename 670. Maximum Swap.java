class Solution {
    public int maximumSwap(int num) {
        char[] ch=String.valueOf(num).toCharArray();
        lo:for(int i=0;i<ch.length;i++){
            char max='0';
            int index=0;
            for(int j=i+1;j<ch.length;j++){
                if(max<=ch[j] && ch[i]<=ch[j]){
                    max=ch[j];
                    index=j;
                }
            }
            if(max>ch[i]){
                ch[index]=ch[i];
                ch[i]=max;
                break;
            }
        }
        return convert(ch);
    }
    public int convert(char[] ch){
        int result=0;
        for(char c:ch){
            int k = c-'0';
            result = result * 10 + k;
        }
        return result;
    }
}
