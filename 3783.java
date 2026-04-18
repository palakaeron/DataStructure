class Solution {
    public int mirrorDistance(int n) {
      int num = n;
      int dist = 0;
      int reverse = 0;
      while(n!= 0){
        reverse = reverse*10+ n%10;
        n = n/10; 
        dist= Math.abs(num- reverse);
      }
    return dist;
    }
}
