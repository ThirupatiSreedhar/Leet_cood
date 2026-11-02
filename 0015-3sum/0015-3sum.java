class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //    Arrays.sort(nums);
    //    Set<List<Integer>> s = new HashSet<>();
    //    for(int i=0;i<nums.length-1;i++){
    //     int j=i+1;
    //     int k = nums.length-1;
    //     while(j<k){
           
    //         if(nums[i]+nums[j]+nums[k]==0){
    //              List<Integer> l= new ArrayList<>();
    //             l.add(nums[i]);
    //             l.add(nums[j]);
    //             l.add(nums[k]);
    //             s.add(l);
    //             j++;
    //             k--;
    //         }
    //        else if(nums[i]+nums[j]+nums[k]<0){
    //             j++;
    //         }
    //         else{
    //             k--;
    //         }
    //     }
    //    }
    //    return new ArrayList<>(s);
   List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    int n = nums.length;
    for(int i=0;i<n-2;i++){
        if(i>0 && nums[i] == nums[i-1])
        continue;
        int l =i+1;
        int r= n-1;
        while (l<r){
            int sum = nums[i]+nums[l]+nums[r];
            if(sum==0){
                res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                while(l<r && nums[l]==nums[l+1])l++;
                while(l<r && nums[r]==nums[r-1])r--;
                l++;
                r--;
            }else if(sum>0){
                r--;
            }else{
                l++;
            }
        }
    }
    return res;
    }
}