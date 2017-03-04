package bst;


public class BinarySearchTree {
	Node root;	
	
	BinarySearchTree(){
		root = null;
	}

	void insert(int value){
		root = insert(root, value);
	}

	private Node insert(Node root, int key){
		if(root == null){
			return new Node(key);
		}
		if(root.value > key){
			root.left = insert(root.left,key);
		}
		else if(key > root.value){
			root.right =  insert(root.right,key);
		}
		return root;
	}

	void inOrder(){
		inOrderRec(root);
	}
	private void inOrderRec(Node root){
		if(root!=null){
			inOrderRec(root.left);		
			System.out.println(root.value);
			inOrderRec(root.right);

		}
	}


	public Node search(int key){
		return searchRec(root, key);
	}

	Node searchRec(Node root, int key){
		if(root.value ==  key || root == null){
			return root;
		}

		if(key < root.value ){
			return searchRec(root.left, key);
		}
		else{
			return searchRec(root.right, key);
		}
		//return new Node(0);
	}

	public void delete(int key){	
		root = deleteRec(root, key);
	}

	public Node deleteRec(Node root, int key){
		if (root == null){
			return root;
		}
		
		if(key<root.value){
			root.left = deleteRec(root.left, key);
		}
		else if(key>root.value){
			root.right = deleteRec(root.right, key);
		}
		else{
			if(root.left == null){
				return root.right;
			}
			else if(root.right == null){
				return root.left;
			}
			else{
				root.value = minValue(root.right);
				root.right = deleteRec(root.right, root.value);
			}

		}
		return root;	
	}

	private int minValue(Node root){
		int minV = root.value;
		while(root.left!=null){
			minV = root.left.value;
			root = root.left;
		}
		return minV;
	}




}
