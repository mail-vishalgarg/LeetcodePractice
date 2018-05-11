package Tree;

import Tree.Node;
//Node class imported from Tree.node class
public class BinaryTree {

	Node root;
	public BinaryTree(int key){
		root = new Node(key);
	}
	
	public BinaryTree(){
		root = null;
	}
	
	public void printPostOrder(Node node){
		//travers left-> right->root
		//bottom-up traversal
		if(node == null)
			return;
		//first recur on left subtree
		printPostOrder(node.left);
		//second recure on right subtree
		printPostOrder(node.right);
		//now deal with the root node
		System.out.print(node.data + " ");
		
	}
	
	public void printInOrder(Node node){
		//traverse left-> root-> right
		if(node == null)
			return;
		printInOrder(node.left);
		System.out.print(node.data + " ");
		printInOrder(node.right);
	}
	
	public void printPreOrder(Node node){
		//traverse root -> left -> right
		if(node == null)
			return;
		System.out.print(node.data + " ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	//Just wrapper method for above recursive functions
	public void printPostorder(){printPostOrder(root);	}
	public void printInorder(){printInOrder(root);}
	public void printPreorder() { printPreOrder(root);}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		/*create root*/
		tree.root = new Node(1);
		/* following is the tree after above statement
    		1
  	  	  /   \
    	null  null     */
		
		//add left and right child
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		/* 2 and 3 become left and right children of 1
                 1
               /   \
              2     3
            /  \   /  \
         null null null null
        */
		
		tree.root.left.left = new Node(4);
		/* 4 becomes left child of 2
               1
           /       \
          2         3
        /   \      /  \
       4    null  null  null
      /   \
    null null
         */
		
		System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();
 
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();
 
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
	}
	
	
}
