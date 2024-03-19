import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;

        }
    }
        public static Node insert(Node root, int val){
            if (root == null) {
                root = new Node(val);
                return root;
            }
            if (root.data > val) {
                root.left = insert(root.left, val);
            }else{
                root.right = insert(root.right, val);
            }
            return root;
        }

        // Inorder Traversal
        public static void inorderTraversal(Node root){
            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }

        // Search the node value
        public static boolean search(Node root, int key){
            if (root == null) {
                return false;
            }
            if (root.data > key) {
                return search(root.left, key);
            }
            else if (root.data == key) {
                return true;
            } else {
                return search(root.right, key);
            }
        }

        // Deletion of Node
        public static Node delete(Node root, int val){
            if (root.data > val) {
                root.left = delete(root.left, val);
            }
            else if (root.data < val) {
                root.right = delete(root.right, val);
            }
            else {
                if (root.left == null && root.right == null) {
                    return null;
                }
                else if (root.left == null) {
                    return root.right;
                }
                else if (root.right == null){
                    return root.left;
                }

                 Node IS = InorderSuccessor(root.right);
                 root.data = IS.data;
                 root.right = delete(root.right, IS.data);
            }
            return root;
        }
        // Finding InorderSuccessor
        public static Node InorderSuccessor(Node root){
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }

        // Print the node values within a range 
        public static void printInRange(Node root, int x, int y){
            if (root == null) {
                return;
            }
            if (root.data >= x && root.data <=y) {
                printInRange(root.left, x, y);
                System.out.print(root.data + " ");
                printInRange(root.right, x, y);
            }
            else if(root.data >= y){
                printInRange(root.left, x, y);
            } else{
                printInRange(root.right, x, y);
            }
            
        }

        // Print  Root to Leaf node
        public static void printRoot2leaf(Node root, ArrayList<Integer> path){
            if (root == null) {
                return;
            }
            path.add(root.data);
            if (root.left == null && root.right == null) {
                printPath(path);
                
            }else{
                printRoot2leaf(root.left, path);
                printRoot2leaf(root.right, path);
            }
            path.remove(path.size()-1);
        }
        // print path
        public static void printPath(ArrayList<Integer> path){
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + "-->");
            }
            System.out.println();
        }

    
    public static void main(String[] args) {
        int values[] = {8,5,1,3,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorderTraversal(root);
        System.out.println();

        // if (search(root, 5)) {
        //     System.out.println("found");
        // }else{
        //     System.out.println("not found");
        // }

        // delete(root, 4);
        // inorderTraversal(root);

        // printInRange(root, 4, 12);

        printRoot2leaf(root, new ArrayList<>());
    }
}

