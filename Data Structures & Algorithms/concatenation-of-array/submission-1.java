class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n*2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,nums[i]);
            ans[i]=map.get(i);
            ans[i+n]=map.get(i);
        }

        // for(int i=0;i<n;i++){
        //     ans[i]=nums[i];
        //     ans[i+n]=nums[i];     
        //      }
        
        return ans;  

    }
}