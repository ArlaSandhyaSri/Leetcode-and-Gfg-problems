class Solution {
    public boolean canChange(String start, String target) {
        if(start.equals(target)){
            return true;
        }
        int n=start.length();
        int start_id=0;
        int target_id=0;
        while(start_id<n || target_id<n){
            while(start_id<n && start.charAt(start_id)=='_'){
                start_id++;
            }
            while(target_id<n && target.charAt(target_id)=='_'){
                target_id++;
            }

            if(start_id==n && target_id==n){
                return true;
            }if(start_id==n || target_id==n){
                return false;
            }

            if(start.charAt(start_id)!=target.charAt(target_id) || (start.charAt(start_id)=='R' && start_id>target_id) || (start.charAt(start_id)=='L' && target_id>start_id)){
                return false;
            }
            start_id++;
            target_id++;
        }
        return true;
        
    }
}