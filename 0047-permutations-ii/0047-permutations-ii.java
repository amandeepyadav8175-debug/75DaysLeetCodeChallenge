class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

         List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(nums);
         findpermutation(nums,nums.length, new ArrayList<>(),new boolean[nums.length],ans);

         return ans;
        
    }

    private void findpermutation(int []nums,int n, List<Integer> current,boolean used[], List<List<Integer>> ans){

        if(current.size()== n){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<n;i++){
          //  if(used[i]) continue;
            if(used[i]== true) continue;

            // if(used[i]) continue;
            if(i>0 && nums[i]==nums[i-1]&& !used[i-1])continue;

            used[i]=true; // treue karke phir add karlo
            current.add(nums[i]);

            findpermutation(nums,n,current,used,ans);
            current.remove(current.size()-1);
              used[i]=false;

        }
    }
}
        
    
