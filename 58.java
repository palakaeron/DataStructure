class Solution {
    public int lengthOfLastWord(String s) {
        String[] substring = s.split(" ");
        int ans= substring[substring.length-1].length();
        return ans;
    }
}
