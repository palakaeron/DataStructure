class Solution {
    public int[] separateDigits(int[] nums) {
      ArrayList<Integer> ans= new ArrayList<>();
        for(int num: nums){
           String str = Integer.toString(num);
           for(int i=0; i<str.length(); i++){
            ans.add(str.charAt(i) - '0');
           }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
