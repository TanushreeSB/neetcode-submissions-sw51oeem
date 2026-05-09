class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {     
        
        HashMap<String,List<String>>mp = new HashMap<>();
        
        for(String s: strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String c1 = Arrays.toString(count);
            if(!mp.containsKey(c1)){
                mp.put(c1,new ArrayList<>());
            }
            mp.get(c1).add(s);
        }

        List<List<String>> ans = new ArrayList<>();

        for (List<String> val : mp.values()) {
            ans.add(val);
        }

        return ans;

    }
}
