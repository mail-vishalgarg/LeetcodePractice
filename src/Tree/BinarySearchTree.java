package Tree;

import Tree.Node;
//Node class imported from Tree.node class

public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree(){
		root = null;
	}
	public BinarySearchTree(int data){
		root = new Node(data);
	}
	
	public void insert(int key){
		root = insertRec(root, key);
	}
	
	public Node insertRec(Node root, int data){
		if (root == null){
			root = new Node(data);
			return root;
		}
		if (data<root.data){
			root.left = insertRec(root.left, data);
		} else if(data > root.data){
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	
	public void inorder(){
		inorderRec(root);
	}
	
	public void inorderRec(Node root){
		//inorder traversal - left->root->right
		if (root != null){
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
	}
	
	//Recursive solution of search a key in binary search tree
	public Node search(Node root,int data){
		if (root == null || root.data == data){
			return root;
		}
		
		if (data > root.data){
			return search(root.right,data);
		}else {
			return search(root.left,data);
		}
	}
	public static void main(String[] args){
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        tree.inorder();
        
        /*output -*/
		/* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
	}
}
