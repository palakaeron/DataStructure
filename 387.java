class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] ch= s.toCharArray();
        for(char c: ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(int i=0; i<ch.length; i++){
           if(map.get(ch[i])== 1){
            return i;
           }
        }
    return -1;
    }
}
