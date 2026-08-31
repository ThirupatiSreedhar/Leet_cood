class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap <>();
        int n = nums.length;
        for(int i:nums){
            // if(hm.containsKey(i)){
            //     int x=hm.get(i);
            //     x++;
            //     hm.put(i,x);
            // }else{
            //     hm.put(i,1);
            // }
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)>n/2){
                return i;
            }
        }
        return 0;
    }
}