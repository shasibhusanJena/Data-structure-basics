package leetcode;

class Node{
	int data;
	Node left,right;
	
	Node(int data){
		this.data = data;
		left =null;
		right =null;
	}
}
public class BinaryTreeMaxDepth {

	public int MaxDepth(Node root) {
		if(root == null)
			return 0;
		return Math.max(MaxDepth(root.left),MaxDepth(root.right))+1;
	}
	public static void main(String[] args) {
		BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();
		
		Node node = new Node(15);
		
		node.left = new Node(10);
        node.right = new Node(20);
        node.left.left = new Node(8);
        node.left.right = new Node(12);
        node.right.left = new Node(16);
        node.right.right = new Node(25);
		
        int depth =tree.MaxDepth(node);
		System.out.println("Depth is : "+depth);
	}
	
	
}
