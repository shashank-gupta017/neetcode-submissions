class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> dupSet = new HashSet<Integer>();

        for(int n: nums){
            if(dupSet.contains(n)){
                return true;
            }
            dupSet.add(n);
        }
        return false;
        
    }
}