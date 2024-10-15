class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> map = new HashMap<>();

      for(int i=0;i<strs.length;i++){
        char[] temp =  strs[i].toCharArray();
        Arrays.sort(temp);
        String use=String.valueOf(temp);
        if(!map.containsKey(use)){
            map.put(use,new ArrayList<>());
            map.get(use).add(strs[i]);
        }
        else{
            map.get(use).add(strs[i]);
        }
      }
      List<List<String>> list = new ArrayList<>();
      for(Map.Entry<String,List<String>> transfer:map.entrySet()){
        list.add(transfer.getValue());
      }
      return list;
    }
}
