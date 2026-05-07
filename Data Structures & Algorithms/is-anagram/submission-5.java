class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character,Integer>mp1 = new HashMap<>();
        HashMap<Character,Integer>mp2 = new HashMap<>();

        for(char c1:s.toCharArray()){
            mp1.put(c1,mp1.getOrDefault(c1,0)+1);
        }

        for(char c2:t.toCharArray()){
            mp2.put(c2,mp2.getOrDefault(c2,0)+1);
        }

        return mp1.equals(mp2);
    }
}
