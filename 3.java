class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen= 0;
       for(int i=0; i<s.length(); i++){
        int count =0;
        boolean[] arr = new boolean[256];
        for(int j=i; j< s.length(); j++){
            char ch= s.charAt(j);
            if(arr[ch]){
                break;
            }
            arr[ch]= true;
            count++;
        }
        maxlen= Math.max(count, maxlen);
       }
        
        return maxlen;
    }
}
