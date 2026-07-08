class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int x :arr){
            if(x!=0){
               a.add(x); 
            }
            else {
                a.add(0);
                a.add(0);
            }
        }
      for(int i=0;i<arr.length;i++){
        arr[i]=a.get(i);
      }
    }
}