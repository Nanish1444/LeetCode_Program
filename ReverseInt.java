class Solution {
    public int reverse(int x) {
        if(x<Integer.MIN_VALUE || x>Integer.MAX_VALUE-1)return 0;
        long rever=0;
        while(x!=0){
            int mod=x%10;
            rever=rever*10+mod;
            x/=10;
        }
        if(rever<Integer.MIN_VALUE || rever>Integer.MAX_VALUE-1)return 0;
        return (int)rever;
    }
}