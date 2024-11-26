class Solution {
    public String frequencySort(String s) {
        int[] feq = new int[62];
        // a -> 97 a-a=0
        // A -> 65 A-A+26=26
        for(char c:s.toCharArray()){
           if(c>='a' && c<='z'){
            feq[c-'a']++;
           }
           else if(c>='A' && c<='Z'){
            feq[(c-'A')+26]++;
           }
           else{
            feq[(c-'0')+52]++;
           }
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<62;i++){
            boolean allzero=true;
            int max=0;
            int index=0;
            for(int j=0;j<62;j++){
                if(feq[j]>=max && feq[j]!=0){
                    max=feq[j];
                    index=j;
                    allzero=false;
                    
                }
            }
            if(allzero==true){
                break;
            }
            if(index<26){
                char k = (char)(index+97);
                while(max>0){
                    str.append(k);
                    max--;
                }
                feq[index]=0;

            }
            else if(index<52){
                 char k = (char)(index+65-26);
                while(max>0){
                    str.append(k);
                    max--;
                }
                feq[index]=0;
            }
            else{
                 int k = (int)(index+0-52);
                while(max>0){
                    str.append(k);
                    max--;
                }
                feq[index]=0;
            }
            
        }
        return str.toString();
    }
}
