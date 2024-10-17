class Solution {
    public String decodeMessage(String key, String message) {
        // 7 ms
        // Map<Character,Character> map = new HashMap<>();
        // int count=0;
        // for(int i=0;i<key.length();i++){
        // char c = key.charAt(i);
        // if(c!=' '&&!map.containsKey(c)){
        // map.put(c,(char)('a'+count));
        // count++;
        // }
        // }
        // StringBuilder str = new StringBuilder();
        // for(int i=0;i<message.length();i++){
        // char c = message.charAt(i);
        // if(c==' '){
        // str.append(' ');
        // }
        // else{
        // str.append(map.get(c));
        // }
        // }
        // return str.toString();

        // 4 or 5 ms
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' ' && !str.toString().contains(String.valueOf(key.charAt(i)))) {
                str.append(key.charAt(i));
            }
        }
        char[] letter = str.toString().toCharArray();

        str = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                str.append(' ');
            } else {
                for (int j = 0; j < letter.length; j++) {
                    if (c == letter[j]) {
                        char n = (char) ('a' + j);
                        str.append(n);
                        break;
                    }

                }
            }
        }
        return str.toString();

    }
}
