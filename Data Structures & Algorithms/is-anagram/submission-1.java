class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int[] f=new int[256];
        int[] f1=new int[256];
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)]++;
            f1[t.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if(f[i]!=f1[i])
            {
                return false;
            }
        }
        return true;
    }
}
