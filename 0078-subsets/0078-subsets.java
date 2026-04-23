class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
       com(nums,0,nums.length, new ArrayList<>(),ans);
        return ans;


        
    }
    private void com(int[]nums,int i,int n,List<Integer> list,List<List<Integer>> ans){
        if(i==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);// it is must to write here
       com(nums,i+1,n, list,ans);// list.add(nums[i]) return boolean 
       list.remove(list.size()-1);
       com(nums,i+1,n, list,ans);
        
}}