class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

    //     HashMap<Integer,Integer> h = new HashMap<>();
    //     HashMap<Integer ,Integer> h1 = new HashMap<>();
    //     for(int i:nums1){
    //         h.put(i,1);
    // }
    //    for(int i:nums2){
    //         h1.put(i,1);
    // }
    // ArrayList<Integer> a = new ArrayList<>();
    // for(int i :h.keySet()){
    //     if(h1.containsKey(i)){
    //         a.add(i);
    //     }
    // }
    // int b[] = new int[a.size()];
    // for (int i = 0; i < a.size(); i++) {
    //         b[i] = a.get(i);
    //     }
    // return b;
    HashSet<Integer> h = new HashSet<>();
    HashSet<Integer> h1 = new HashSet<>();
    for(int i : nums1){
        h.add(i);
    }
    System.out.print(h);
    for(int i :nums2){
        h1.add(i);
    }
    System.out.print(h1);

    ArrayList<Integer> al = new ArrayList<>();
    for(int j:h){
        if(h1.contains(j)){
            al.add(j);
        }
    }
    int b[] = new int[al.size()];
    for(int i=0;i<al.size();i++){
        b[i]=al.get(i);
    }
    return b;
    }
}