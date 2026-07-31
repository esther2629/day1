import java.util.*;
class Node {
int data;
Node left,right;

Node(int data){
    this.data=data;
    left=right=null;
}
}

class DFS{
    Node root;
    Node insert(Node root,int data){
    //if tree is empty
    if(root==null){
         root=new Node(data);
         return root;
    }
    if(data<root.data){
        root.left=insert(root.left,data);
    }
    else if(data>root.data)
    
        {
        root.right=insert(root.right,data);
    }
    return root;
}
    // Preorder Traversal (Root → Left → Right)
    void preorder(Node root) {

        if (root == null)
            return;

        System.out.print(root.data + " ");

        preorder(root.left);

        preorder(root.right);
    }

//inorder
    // Inorder Traversal (L → ROOT → Right)
    void inorder(Node root) {

        if (root == null)
            return;

inorder(root.left);
        System.out.print(root.data + " ");
inorder(root.right);
    }
    void postorder(Node root) {

        if (root == null)
            return;

postorder(root.left);
postorder(root.right);
        System.out.print(root.data + " ");

    }



    public static void main(String[] args) {
                DFS tree = new DFS();

        // Create BST
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Preorder Traversal
        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);

        System.out.println();

        // Inorder Traversal
        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);

        System.out.println();

        // Postorder Traversal
        System.out.println("Postorder Traversal:");
        tree.postorder(tree.root);
    }

}
        