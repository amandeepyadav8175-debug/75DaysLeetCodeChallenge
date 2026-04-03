class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n= nums2.length;
        Stack<Integer> s= new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int element = nums2[i];

            while( !s.isEmpty() && element >= s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
               map.put( element, -1);
            }  else{
                  map.put( element, s.peek());
            }
            s.push(element);
        } 
       
       int ans[]= new int[ nums1.length];
       for(int i=0;i<nums1.length;i++){
        ans[i]=map.get(nums1[i]);
       }
       return ans;

        
    }
}