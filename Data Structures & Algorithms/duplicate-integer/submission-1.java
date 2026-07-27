class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(nums.length==set.size())
        return false;
        else
        return true;
    }
    //boxed()- converts primitive type to wrapper class- to convert to List/Set.
}