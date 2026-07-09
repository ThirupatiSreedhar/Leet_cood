class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                a.add(i);
            }
        }
        if(k>a.size()){
            return -1;
        }
        else{
            return a.get(k-1);
        }
    }
}