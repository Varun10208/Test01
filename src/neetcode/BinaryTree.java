package neetcode;
public class BinaryTree {
	Node root;

	BinaryTree() {
		root = null;
	}
	  int maxDepth(Node root)
	 {
		 if(root==null) {
			 return 0;
		 }
		 else if(root.left==null && root.right==null) {return 1;}
		 else {
			 return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
		 }
		 
	 }

	void printInorder(Node node) {
		if (node == null) return;
			
		printPreorder(node.left);
		System.out.print(node.key + " ");
		printPreorder(node.right);
	}

	void printPreorder(Node node) {
		if (node == null) return;
			
		System.out.print(node.key + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}

	void printPostorder(Node node) {
		if (node == null) return;
			
		printPreorder(node.left);
		printPreorder(node.right);
		System.out.print(node.key + " ");
	}

	void printInorder() {
		printInorder(root);
	}

	void printPreorder() {
		printPreorder(root);
	}

	void printPostorder() {
		printPostorder(root);
	}
	
	void printmaxDepth() {
		System.out.println(maxDepth(root));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		System.out.print ("Inorder traversal of binary tree is ");
		bt.printInorder();
		System.out.println();
		System.out.print("PreOrder traversal of binary tree is ");
		bt.printPreorder();
		System.out.println();
		System.out.print("Postorder traversal of binary tree is ");
		bt.printPostorder();
		System.out.println();
bt.printmaxDepth();

	}

}

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}