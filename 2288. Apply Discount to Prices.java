class Solution {
    public String discountPrices(String s, int discount) {
        String[] str=s.split(" ");
        StringBuilder original= new StringBuilder();
        for(String n:str){
            StringBuilder k = new StringBuilder(n);
            if(k.toString().contains("$")){
                if(k.indexOf("$")==0){
                    k.deleteCharAt(0);
                    if(k.indexOf("$")>-1 || k.isEmpty()){
                        original.append(n+" ");
                        continue;
                    }
                    else{
                        if(containsWord(k.toString())){
                            original.append(n+" ");
                            continue;
                        }
                        long l=Long.parseLong(k.toString());
                        double per=(double)1-((double)discount/100);
                        double yes =(double) l*per;
                        DecimalFormat df = new DecimalFormat("#0.00");
                        String num = df.format(yes);
                        
                        original.append("$"+num+" ");
                        
                        continue;
                    }
                }
                else{
                    original.append(n+" ");
                        continue;
                }
            }
            else{
                original.append(n+" ");
            }
        }
        return original.toString().trim();
    }
    public boolean containsWord(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'0' || s.charAt(i)>'9')return true;
        }
        return false;
    }
}
