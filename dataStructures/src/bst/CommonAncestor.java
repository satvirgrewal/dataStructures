package bst;

public class CommonAncestor {

	public static void main(String[] args){
		BinarySearchTree tree = new BinarySearchTree();
		InsertBST.createBST(tree);
		tree.inOrder();
		System.out.println(' ');
		System.out.println(lca(tree.root,60,80).value);
	}
	
	static Node lca(Node root, int n1, int n2 )
	{
		if (root == null){
			return root;
		}
		if(n1<root.value && n2<root.value){
			return lca(root.left, n1,n2);
		}
		else if(n1>root.value && n2>root.value){
			return lca(root.right, n1, n2);
		}		
		return root;
	}
}
