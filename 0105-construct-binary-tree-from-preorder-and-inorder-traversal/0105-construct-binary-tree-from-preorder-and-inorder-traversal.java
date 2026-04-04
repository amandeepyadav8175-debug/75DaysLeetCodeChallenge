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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
         }
         int n= preorder.length-1;
         int m= inorder.length-1;
        return cbt(preorder, inorder, map,0,n,0,m);
        
    }
    public TreeNode cbt(int[] preorder, int[] inorder,Map<Integer,Integer> map,int prest,int preend,int inst,int inend){
        if(prest>preend || inst>inend) return null;
        int rootdata= preorder[prest];
        int rootindx=map.get(rootdata);
        TreeNode root= new TreeNode(rootdata);
        //int sizelst=rootindx-1  - inst+1 ;//upperlimit - lowerlimit +1;
        int sizelst=rootindx - inst ;
        //int sizerst=inend - (rootindx+1) +1; 
        int sizerst= inend - rootindx;
        root.left= cbt(preorder, inorder,map,prest+1,prest+sizelst,inst,rootindx-1);
        root.right=cbt(preorder, inorder,map,prest+1+sizelst,prest+sizelst+sizerst,rootindx+1,inend);
        return root;
    }
}