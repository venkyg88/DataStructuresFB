/*
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        
        List<String> list = new ArrayList<String>();
        
        if(root == null) return list;
        
        searchBST(list, "", root);
        
        return list;
    }
    
    
    public void searchBST(List<String> list, String pattern, TreeNode node){
        if(node.left == null && node.right == null) list.add(pattern+node.val);
        if(node.left != null) searchBST(list, pattern +node.val+"->", node.left);
        if(node.right != null) searchBST(list, pattern +node.val+"->", node.right);
    }
}
