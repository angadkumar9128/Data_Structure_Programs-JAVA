public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){ 
        this.val = val;
     }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }

    public static void main(String[] args) {
        TreeNode mainTree = new TreeNode(3,
            new TreeNode(4, new TreeNode(1), new TreeNode(2)),
            new TreeNode(5));

    // Create subtree
    TreeNode subTree = new TreeNode(4, new TreeNode(1),
            new TreeNode(2));

    // Test if subTree is a subtree of mainTree
    Solution solution = new Solution();
    boolean result = solution.isSubtree(mainTree, subTree);

    // Print the result
    System.out.println("Is subTree a subtree of mainTree? " + result);

    }

    }
    class Solution{
        public boolean isIdentical(TreeNode root, TreeNode subRoot){
            if (root == null && subRoot == null) {
                return true;
            }
            if (root == null || subRoot == null) {
                return false;
            }
            if (root.val == subRoot.val) {
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }
            return false;
        }
        public boolean isSubtree(TreeNode root, TreeNode subRoot){
            if (subRoot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (root.val == subRoot.val) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
        
    }