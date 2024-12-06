class Solution {
    public String reverseVowels(String s) {
        int n= s.length();
        char arr[]=s.toCharArray();
        int i=0;
        int j=n-1;
        while(i<j){
            while(i<j && !(arr[i]=='a' || arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u' || arr[i]=='A'|| arr[i]=='E' || arr[i]=='O' ||arr[i]=='I' || arr[i]=='U')){
                i++;
            }

            while(i<j && !(arr[j]=='a' || arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u' || arr[j]=='A'|| arr[j]=='E' || arr[j]=='O' ||arr[j]=='I' || arr[j]=='U')){
                j--;
            }
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String str=new String(arr);
        return str;
        
    }
}