/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
         }
         int n= postorder.length-1;
         int m= inorder.length-1;
        return cbt(postorder, inorder, map,0,n,0,m);
        
    }
    public TreeNode cbt(int[] postorder, int[] inorder,Map<Integer,Integer> map,int postst,int postend,int inst,int inend){
        if(postst>postend || inst>inend) return null;
        int rootdata= postorder[postend];
        int rootindx=map.get(rootdata);
        TreeNode root= new TreeNode(rootdata);
        //int sizelst=rootindx-1  - inst+1 ;//upperlimit - lowerlimit +1;
        int sizelst=rootindx - inst ;
        //int sizerst=inend - (rootindx+1) +1; 
        int sizerst= inend - rootindx;
        root.left= cbt(postorder, inorder,map,postst,postst+sizelst-1,inst,rootindx-1);
        root.right=cbt(postorder, inorder,map,postst+sizelst,postend-1,rootindx+1,inend);
        return root;
    }
}
// postorder last elemnt is root
        
    