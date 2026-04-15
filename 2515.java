class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int mindist= Integer.MAX_VALUE;
        for(int i= 0; i<words.length; i++){
            if(words[i].equals(target)){
                int dist= Math.min(Math.abs(i- startIndex), words.length- Math.abs(i- startIndex));
                mindist= Math.min(mindist, dist);
            }
        }
        if(mindist== Integer.MAX_VALUE){
            return -1;
        }
        return mindist;
    }
}
