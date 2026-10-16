class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

      // bar 
        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
          count[s.charAt(i) - 'a']++;  // 66 - 65 = 1 
          count[t.charAt(i) - 'a']--;
        }


        for(int i = 0; i< 26; i++){
          if(count[i] != 0) return false; 
        }

        return true; 
    }
}
