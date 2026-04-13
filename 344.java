class Solution {
    public void reverseString(char[] s) {
       char temp = '\u0000';
       int left = 0;
       int right= s.length-1;
       while(left<right){
        temp= s[left];
        s[left]= s[right];
        s[right]= temp;
        left++;
        right--;
       }
    }
}
