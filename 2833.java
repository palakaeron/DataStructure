class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        char[] arr = moves.toCharArray();
        int countL =0;
        int countR= 0;
        int count_= 0;
        int dist =0;
        for(int i=0; i<arr.length; i++){
           if(arr[i]== 'L'){
            countL++;
           }else if( arr[i] == 'R'){
            countR++;
           }else if(arr[i] == '_'){
            count_++;
           }
         dist= Math.abs(countL-countR)+ count_;
      
        } 
        return dist;  
    
    }
}
