class Solution {
    public List<Integer> majorityElement(int[] nums) {
       HashMap<Integer,Integer> h = new HashMap<>();
       int n =nums.length/3;
       for(int x : nums){
        int count=h.getOrDefault(x,0);
        count++;
        h.put(x,count);
       }
       ArrayList<Integer> a = new ArrayList<>();
       for(int x : h.keySet()){
        if(h.get(x)>n){
            a.add(x);
        }
       }
       return a;
    }
}