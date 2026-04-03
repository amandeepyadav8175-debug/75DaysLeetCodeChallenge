class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];

        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;
            int element = nums[index];

            while (!s.isEmpty() && s.peek() <= element) {
                s.pop();
            }

            if (i < n) {
                if (s.isEmpty()) {
                    ans[index] = -1;
                } else {
                    ans[index] = s.peek();
                }
            }

            s.push(element);
        }

        return ans;
    }
}