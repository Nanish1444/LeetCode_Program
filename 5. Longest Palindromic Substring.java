class Solution {
    public String longestPalindrome(String s) {
        // Time Complexity: O(n²)
        // Space Complexity: O(n)
        // 2223ms
      String original="";
      for(int i=0;i<s.length();i++){
        String odd=palin(s,i,i+1,"");
        if(odd.length()>original.length()){
            original=odd;
        }
        String even = palin(s,i,i+2,"");
        if(even.length()>original.length()){
            original=even;
        }
      }
        return original;
    }


    public String palin(String str,int left,int right,String original){
        if(left<0 || right>str.length()){
            return original;
        }
        String sub=str.substring(left,right);
        StringBuilder check = new StringBuilder(sub).reverse();
        if(sub.equals(check.toString())){
            original = str.substring(left,right);
            original = palin(str,left-1,right+1,original);
        }
        return original;
    }
   
}
