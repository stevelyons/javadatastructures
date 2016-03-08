package binarytree;

class BinaryTree {
	 
    Node root;
 
    void mirror() {
        mirror(root);
    }
 
    void mirror(Node node) {
        if (node == null) {
            return;
        } else {
            Node temp;
 
            /* do the subtrees */
            mirror(node.left);
            mirror(node.right);
 
            /* swap the objects/values in this node */
            temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }
 
    void inOrder() {
        inOrder(root);
    }
 
    /* Helper function to test mirror(). Given a binary
     search tree, print out its data elements in 
     increasing sorted order.*/
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
 
        inOrder(node.left);
        System.out.print(node.data);
 
        inOrder(node.right);
    }
}