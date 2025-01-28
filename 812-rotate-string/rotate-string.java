class Solution {
    public boolean rotateString(String s, String goal) {
        /*if(s.length()!=goal.length()){
            return false;
        }
        return (s+s).contains(goal); */ //We can check by merging string it will form abcdeabcde if goal is visible in s+s we can can goal will obtain after some rotations.

        //We can also do this by rotating and checking every character as arrays problem rotation.

        
        int k = s.length();
        while( k>0 ){
            String a = RotateString(s);
            if( a.equals(goal) )
                return true;
            k--;
            s = a;               
        }
        return false;
    }
    public static String RotateString(String s){
        char a[] = s.toCharArray();
        char temp = a[0];
        for( int i=1 ; i<a.length ; i++){
            a[i-1] = a[i];
        }
        a[a.length-1] = temp;
        StringBuffer r = new StringBuffer("");
        for( int i=0 ; i<a.length ; i++){
            r.append(a[i]);
        }
        return r.toString();
        
    }
}