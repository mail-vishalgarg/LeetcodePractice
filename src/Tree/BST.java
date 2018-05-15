package Tree;

class NodeBST {
	int data;
	public NodeBST right;
	public NodeBST left;
	public NodeBST (int data){
		this.data = data;
		this.right = null;
		this.left = null;
	}
}

public class BST {
	NodeBST root;
	public BST(int key){
		root = new NodeBST(key);
	}
	
	public BST(){
		root = null;
	}
	
	public static void main(String[] args){
		BST tree = new BST();
		tree.root = new NodeBST(5);
		tree.root.left = new NodeBST(2);
		tree.root.right = new NodeBST(9);
		tree.root.left.left = new NodeBST(1);
	}
}
