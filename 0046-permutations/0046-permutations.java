class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
         findpermutation(nums,nums.length, new ArrayList<>(),new boolean[nums.length],ans);

         return ans;
        
    }

    private void findpermutation(int []nums,int n, List<Integer> current,boolean used[], List<List<Integer>> ans){

        if(current.size()== n){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<n;i++){

            if(used[i]) continue;

            used[i]=true;
            current.add(nums[i]);

            findpermutation(nums,n,current,used,ans);
            current.remove(current.size()-1);
            //  findpermutation(nums,n,current,used,ans);
              used[i]=false;

        }
    }
}