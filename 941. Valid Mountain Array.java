class Solution {
    public boolean validMountainArray(int[] arr) {
       if(arr.length<3)return false;

      int cur= arr[0];
      boolean inc =  true;
      boolean dec = false;
      for(int i=1;i<arr.length;i++){
          if(inc==true && cur<arr[i]){
              cur=arr[i];
              dec = true;
          }
          else if(dec == true && cur>arr[i]){
              cur=arr[i];
              inc = false;
          }
          else{
            return false;
          }
       }
       return inc==false?true:false;
    }
}
