class Solution {
    public int countDigits(int num) {
        return function(num);
    }
    public static int function(int num){
        int count =0;
        int temp= num;
        while(num>0){
        int digit= num%10;
        if(temp%digit==0){
            count++;
        }
        num=num/10;
        }
        return count;

    }
}
