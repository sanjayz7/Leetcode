class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        if(goal.length()!=s.length()) return false;
        for(int i=0;i<s.length();i++){
            if(goal.equals(sb.toString())) return true;
           char first = sb.charAt(0);
         sb.deleteCharAt(0);
        sb.append(first);
            
        }
        return false;
    }
}