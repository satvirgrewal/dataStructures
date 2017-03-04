package bst;

public  class InsertBST {
	
public static void main(String[] args){
	
	BinarySearchTree tree = new BinarySearchTree();
        createBST(tree);
        tree.inOrder();
        System.out.println(' ');
        
        tree.delete(20);
        
        tree.inOrder();
        System.out.println(' ');
        tree.delete(80);
        tree.inOrder();
}
public static void createBST(BinarySearchTree tree){
	
    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);
}
}
