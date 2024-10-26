class Solution {
    public int compareVersion(String version1, String version2) {
        String[] vers1=version1.split("\\.");
        String[] vers2=version2.split("\\.");
        int length=Math.max(vers1.length,vers2.length);
        for(int i=0;i<length;i++){
            int firstVersion = i<vers1.length?Integer.parseInt(vers1[i]):0;
            int secondVersion = i<vers2.length?Integer.parseInt(vers2[i]):0;
            int compare = firstVersion>secondVersion?1:-1;
            compare=firstVersion==secondVersion?0:compare;
            if(compare!=0){
                return compare;
            }
        }
        
        return 0;
    }
}
