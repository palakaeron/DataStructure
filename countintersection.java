class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        for(int i= 0; i<b.length; i++){
            if(set.contains(b[i])){
                list.add(b[i]);
                set.remove(b[i]);
            }
        }
        return list.size();
    }
}
