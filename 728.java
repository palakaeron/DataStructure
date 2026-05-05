class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(function(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean function(int num){
        int original =num;
        while(num>0){
          int digit= num%10;
          if(digit == 0||original% digit!=0 ){
            return false;
          }
          num= num/10;
        }
        return true;
        

    }
}
