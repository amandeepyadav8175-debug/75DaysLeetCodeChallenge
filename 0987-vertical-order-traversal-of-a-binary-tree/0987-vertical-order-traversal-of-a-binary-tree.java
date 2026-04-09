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
    TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>>  map=new TreeMap<>();//global map
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root== null) return res;
        
        dfs(root,0,0);
        //sort col
        for(TreeMap.Entry<Integer,TreeMap<Integer,ArrayList<Integer>>> e: map.entrySet()){
            TreeMap<Integer,ArrayList<Integer>> levelmap=e.getValue();
            ArrayList<Integer> list= new ArrayList<>();
            //sort level
            for(TreeMap.Entry<Integer,ArrayList<Integer>> e1: levelmap.entrySet()){
                 ArrayList<Integer> sublist = e1.getValue();
                 Collections.sort(sublist);
                  list.addAll(sublist);
            }
            res.add(list);
             
        }
        return res; 


        
    }

    public void dfs(TreeNode root, int col, int level){
        if(root==null) return ;
        if(!map.containsKey(col)){
            map.put(col,new TreeMap<>());
        }
        if(!map.get(col).containsKey(level)){
            map.get(col).put(level,new ArrayList<>());

        }
        map.get(col).get(level).add(root.val);// basically give list and add root.val
        dfs(root.left,col-1,level+1);
         dfs(root.right,col+1,level+1);

}}