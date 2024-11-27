class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        return (s+s).contains(goal);  //We can check by merging string it will form abcdeabcde if goal is visible in s+s we can can goal will obtain after some rotations.
        
    }
}