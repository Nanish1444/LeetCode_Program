class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] feq=new int[26];
        List<String> re = new ArrayList<>();
        
        for(String s:words2){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
           for(int i=0;i<feq.length;i++){
            feq[i]=Math.max(feq[i],count[i]);
           }
        }
       
        lo:for(String s:words1){
                int[] temp = new int[26];
               for(char c : s.toCharArray()){
                    temp[c-'a']++;
               }
               for(int i=0;i<temp.length;i++){
                    if(temp[i]<feq[i]){
                        continue lo;
                    }
               }
               re.add(s);
            }
            
        return re;
    }
    
}
