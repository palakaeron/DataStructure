class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length()){
            return false;
        }
      String rotate = s;
      for(int i=0; i<s.length; i++){
        rotate = s.substring(1)+ s.charAt(0);
        if(rotate.equals(goal)){
          return true;
        }
      }
      return false;
    }
}
