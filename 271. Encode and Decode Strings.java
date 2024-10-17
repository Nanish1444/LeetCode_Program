class Solution {
    public String encode(List<String> strs) {
        if(strs.isEmpty())return null;
        String str="";
        for(int i=0;i<strs.size();i++){
            str+=strs.get(i);
            if(i<strs.size()-1){
                str+="அ";
            }
        } 
        return str;
    }
    public List<String> decode(String str) {
        if(str==null)return new ArrayList<>();
        String[] split = str.split("அ");
       List<String> list=new ArrayList<>();
       for(int i=0;i<split.length;i++){
        list.add(split[i]);
       }
       return list;
    }
}
