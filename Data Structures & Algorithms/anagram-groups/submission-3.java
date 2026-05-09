class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        HashMap<String,List<String>>mp = new HashMap<>();
        
        for(String s: strs){
            char c1[] = s.toCharArray();
            Arrays.sort(c1);
            String c2 = new String(c1);
            if(!mp.containsKey(c2)){
                mp.put(c2,new ArrayList<>());
            }
            mp.get(c2).add(s);
        }

        List<List<String>> ans = new ArrayList<>();

        for (List<String> val : mp.values()) {
            ans.add(val);
        }

        return ans;

    }
}
