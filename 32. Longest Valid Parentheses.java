class Solution {
    public int longestValidParentheses(String s) {
    // Traverse Both Right and Left 
    int start=0;
    int left_count=0;
    int right_count=0;
    int max=0;
    //left to right
    while(start<s.length()){
        if(s.charAt(start)=='(')left_count++;
        
        else{
            right_count++;
            if(left_count==right_count){
                max=Math.max(max,left_count+right_count);
            }
            else if(right_count>left_count){
                left_count=0;
                right_count=0;
            }
        }
        start++;
    } 
    left_count=0;
    right_count=0;
    int end=s.length()-1;
    //right to left
    while(end>=0){
        if(s.charAt(end)==')')right_count++;
        else{
            left_count++;
            if(left_count==right_count){
                max=Math.max(max,left_count+right_count);
            }
            else if(left_count>right_count){
                left_count=0;
                right_count=0;
            }
        }
        end--;
    }
    return max;
    }
}
