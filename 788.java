class Solution {
    public int rotatedDigits(int n) {
        int count =0;
       for(int i=1; i<=n; i++){
          if(rotate(i)== true){
            count++;
          }
       }
    return count;

    }
    public static boolean rotate(int n){
        boolean valid = false;
        while(n>0){
        int digit = n%10;
       
        if(digit== 2 || digit ==5 || digit == 6 || digit ==9){
            valid = true;
        }
        if(digit == 4 || digit == 3|| digit ==7){
           return false;
        }
        n = n/10;
        }
        return valid;
        
    }
}
