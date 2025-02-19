//Time Complexity O(log N)
//Space Complexity O(log n)
//LeetCode tested

public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        else if(p.val>root.val && q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }
    }
}
