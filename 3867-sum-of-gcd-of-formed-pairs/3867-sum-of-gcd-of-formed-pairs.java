class Solution {
    public long gcdSum(int[] nums) {
        int n= nums.length;
        int prefix[]=new int[n];
        int mx= nums[0];
        prefix[0]= gcd(nums[0],mx);

        for(int i=1;i<n;i++){
            mx=Math.max(mx,nums[i]);
            prefix[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prefix);
        long ans=0;
        int left=0;
        int right= n-1;
        while(left<right){
            ans+=gcd(prefix[left],prefix[right]);
            left++;
            right--;
        }
        return ans;
        
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b= temp;
        }
        return a;
    }
}
        