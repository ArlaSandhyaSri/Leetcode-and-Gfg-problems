class Solution {
    public int maximumLength(String s) {

        //POTD



        // Counts the number of the occurance of the same character for a specific length, 
        // for example rec['a'][3] = 5 means that "aaa" appear 5 times in string s.
        int[][] rec = new int[26][s.length()+1];
        int ans = -1;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int len = 1;
            // skip to the end if there is a consecutive substring of a certain character
            while(i+len < s.length() && s.charAt(i+len) == c){
                len++;
            }

            // For a length of k same-character string, Number of occurance of a substring of length j equals, num = k-j+1;
            for(int j=1; j<=len; j++){
                rec[c-'a'][j] += len-j+1;

                //Update the answer if the occurs at least 3 times
                if(rec[c-'a'][j] >= 3){
                    ans = Math.max(ans, j);
                }
            }
            // skip the consecutive character
            i += len-1;
        }

        return ans;
        
    }
}