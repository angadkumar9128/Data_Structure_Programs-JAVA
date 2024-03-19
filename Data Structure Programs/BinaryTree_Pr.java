import java.util.*;
import java.util.LinkedList;
public class BinaryTree_Pr {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;

        }
    }

    // preorder traversal
    public static void preorder(Node root){
        if (root == null) {
            return;
            
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    // Inorder traversal
    public static void inorder(Node root){
        if (root == null) {
            return;
            
        }
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }
    // Postorder traversal
    public static void postorder(Node root){
        if (root == null) {
            return;
            
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data + " ");
    }

    //lavelorder traversal
    public static void lavelOrder(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else {
                    q.add(null);
                }
            }else {
                System.err.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // count of Nodes
    public static int countOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftCount = countOfNodes(root.left);
        int rightCount = countOfNodes(root.right);
        return leftCount + rightCount + 1;
    }

    // Sum of Nodes
    public static int sumOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    // Height of the Tree
    public static int heightOfTree(Node root){
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int maxHeight = Math.max(leftHeight, rightHeight) + 1;
        return maxHeight;
    }

    // Diameter of the Tree,  timecomplexity = O(N2)
    public static int diameter(Node root){
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightOfTree(root.left) +  heightOfTree(root.right) + 1;
        return Math.max(diam1, Math.max(diam2, diam3));
    }

    // Approach -2 , Diameter of the Tree,  timecomplexity = O(N)
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if (root == null) {
           return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int maxHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(maxHeight, myDiam);
        return myInfo;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // preorder(root);
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // postorder(root);

        // lavelOrder(root);

    //    System.out.println(countOfNodes(root)); 
    //    System.out.println(sumOfNodes(root)); 
    //    System.out.println(heightOfTree(root)); 
    //    System.out.println(diameter(root)); 
       System.out.println(diameter2(root).diam); 
    }
    
}