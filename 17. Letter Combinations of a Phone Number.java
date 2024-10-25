class Solution {
    public List<String> letterCombinations(String digits) {
        String[] value={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> str = new ArrayList<>();
        if(digits.length()==1){
            String in=value[digits.charAt(0)-'0'];
            for(int i=0;i<in.length();i++){
                str.add(in.charAt(i)+"");
            }
        }
        else if(digits.length()==2){
            String in=value[digits.charAt(0)-'0'];
            String out=value[digits.charAt(1)-'0'];
            for(int i=0;i<in.length();i++){
                for(int j=0;j<out.length();j++){
                    str.add(in.charAt(i)+""+out.charAt(j));
                }
            }
            return str;
        }
        else if(digits.length()==3){
            String first=value[digits.charAt(0)-'0'];
            String sec=value[digits.charAt(1)-'0'];
            String thir=value[digits.charAt(2)-'0'];
            for(int i=0;i<first.length();i++){
                for(int j=0;j<sec.length();j++){
                    for(int k=0;k<thir.length();k++){
                        str.add(first.charAt(i)+""+sec.charAt(j)+""+thir.charAt(k));
                    }
                }
            }
            return str;
        }
        else if(digits.length()==4){
             String f=value[digits.charAt(0)-'0'];
        String s=value[digits.charAt(1)-'0'];
        String t=value[digits.charAt(2)-'0'];
        String fo=value[digits.charAt(3)-'0'];
        for(int n=0;n<f.length();n++){
            for(int m=0;m<s.length();m++){
                for(int p=0;p<t.length();p++){
                    for(int q=0;q<fo.length();q++){
                        str.add(f.charAt(n)+""+s.charAt(m)+""+t.charAt(p)+""+fo.charAt(q));
                    }
                }
            }
        }
        return str;
        }
        return str;
    }
}
