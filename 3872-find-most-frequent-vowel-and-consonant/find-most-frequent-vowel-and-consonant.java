class Solution {
    public int maxFreqSum(String s) {
        int n=s.length();
        int arr[]=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;

        }
        int mx1=0,mx2=0;
        for(int i=0;i<26;i++){
            char ch=(char)(97+i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                mx1=Math.max(mx1,arr[i]);
            }
            else{
                mx2=Math.max(mx2,arr[i]);
            }
        }
        return mx1+mx2;

        
    }
}