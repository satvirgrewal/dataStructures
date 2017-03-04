package bst;

//import bst.BinarySearchTree.Node;



public class IsBST {
	

	public static boolean isBST(Node root){
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		return isBSTRec(root, max, min);
	}
	
	static boolean  isBSTRec(Node root, int max, int min){
		if(root == null){
			return true;
		}
		if(root.value<min || root.value > max){
			return false;
		}	
		return(isBSTRec(root.left, root.value-1, min) && isBSTRec(root.right, max, root.value+1));
		//return false;
	}
	
	public static void main(String[] args){
		BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(4);
        tree.root.left = new Node(8);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.inOrder();
        System.out.println(isBST(tree.root));
	}
}
