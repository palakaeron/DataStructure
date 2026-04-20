class Solution {
    public int maxDistance(int[] colors) {
        int max1 = 0;
        int max2= 0;
        int i = colors.length -1;
        int k= 0;
        for(int j=0; j<colors.length; j++){
            if(colors[i] != colors[j]){
                max1= Math.max(max1, Math.abs(i-j));
            }
        }
        for(int l = 0; l<colors.length; l++){
            if(colors[k] != colors[l]){
                max2= Math.max(max2, Math.abs(k-l));
            } 
        }
    return Math.max(max1, max2);
    }
}
