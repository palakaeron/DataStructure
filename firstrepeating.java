class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num: arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        for(int num=0; num<arr.length; num++ ){
            if(map.get(arr[num])!= 1){
                return num+1;
            }
        }
        return -1;
    }
}
