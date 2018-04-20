public class LCA {

    /*Lowest common Ancestor for just a binary tree */

    /*public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;
        if (root.val == p.val || root.val == q.val) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        if (left == null && right == null) {
            return null;
        }

        return left != null ? left:right;

    }*/


    /**
     * Lowest common ancestor for a Binary search tree
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;
        if (root.val == p.val || root.val == q.val) return root;

        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        else if ( p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        else return root;

    }

    public static void main(String[] args) {
        TreeNode node =  new TreeNode(6);
        node.left = new TreeNode(2);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(0);
        node.left.right = new TreeNode(4);
        node.left.right.left = new TreeNode(3);
        node.left.right.right = new TreeNode(5);
        node.right.left = new TreeNode(7);
        node.right.right = new TreeNode(9);

        TreeNode p = new TreeNode(3);
        TreeNode q = new TreeNode(9);

        LCA lca = new LCA();
        TreeNode res = lca.lowestCommonAncestor(node, p, q);
        //TreeNode res = lca.lowestCommonAncestor(node, node.left.left, node);
        System.out.print(res.val);
    }
}
