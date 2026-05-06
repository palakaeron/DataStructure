class Solution {
    public int firstNonRepeating(int[] arr) {
        // code here
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num: arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int num: arr){
            if(map.get(num)==1){
                return num;
            }
        }
    return 0;
    }
}
