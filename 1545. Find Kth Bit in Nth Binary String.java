class Solution {
    public char findKthBit(int n, int k) {
        String[] S =new  String[n];
        S[0]="0";

        for(int i=1;i<S.length;i++){
            S[i]=S[i-1]+"1"+reverseAndInverse(S[i-1]);
        }
        return S[n-1].charAt(k-1);
    }
    public String reverseAndInverse(String str){
        StringBuilder inverse = new StringBuilder();
        for(int index=str.length()-1;index>=0;index--){
            if(str.charAt(index)=='1'){
                inverse.append("0");
            }
            else{
                inverse.append("1");
            }

        }
            return inverse.toString();
    }
}
