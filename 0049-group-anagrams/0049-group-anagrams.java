class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h = new HashMap<>();
        for(String s : strs){
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String s1 = new String (c);
            if(!h.containsKey(s1)){
                h.put(s1,new ArrayList<>());
            }
            h.get(s1).add(s);
           
        }
         return new ArrayList<>(h.values());
    }
}