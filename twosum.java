class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int requiredNum = (int)(target - nums[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }
            indexMap.put(nums[i], i);
        }
        return null;
    }
}
