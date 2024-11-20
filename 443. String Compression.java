class Solution {
    public int compress(char[] c) {
        int count=1;
        int i=0,j=1;
        int index=0;
        while(i<j &&j<c.length){
            if(c[i]==c[j]){
                count++;
                j++;
            }
            else{
                if(count==1){
                    c[index]=c[i];
                    index++;
                }
                else if(count<10){
                    c[index]=c[i];
                    index++;
                    c[index]=(char)(count+'0');
                    index++;
                }
                else{
                    String s = String.valueOf(count);
                    c[index]=c[i];
                    index++;
                    for(char n:s.toCharArray()){
                        c[index]=n;
                        index++;
                    }
                }
                i=j;
                j++;
                count=1;
            }
        }
        
        c[index]=c[i];
        index++;
        if(count>1 && count<10){
            c[index]=(char)(count+'0');
            index++;
        }
        else if(count>=10){
            String s = String.valueOf(count);
                    for(char n:s.toCharArray()){
                        c[index]=n;
                        index++;
                    }
        }

        
        return index;
    }
}
