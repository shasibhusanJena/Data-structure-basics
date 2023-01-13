package leetcode;

import java.util.LinkedList;

import java.util.Queue;
/**
 * 
 * @author shjena
 * Print leftmost and rightmost nodes of a Binary Tree
 */
class Node{
	int data;
	Node left,right;
	
	Node(int data){

		this.data = data;
		left = right = null;
	}
}

class BinaryTree1{
	Node root;
	
	void printCorner(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		// n is the number of nodes in the current level
		while(!q.isEmpty()) {
			int n = q.size();
			System.out.println("the number of nodes in the current level "+n);
			for (int i = 0; i < n; i++) {
				Node temp = q.peek();
				q.poll();
				if(i ==0 || i==n-1) {
					System.out.println(temp.key+" ");
				}
				if (temp.left!= null) {
					q.add(temp.left);
				}
				if(temp.right!=null) {
					q.add(temp.right);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		BinaryTree1 tree = new BinaryTree1();
		tree.root = new Node(15);
		tree.root.left = new Node(10);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(16);
        tree.root.right.right = new Node(25);
 
        tree.printCorner(tree.root);
	}
	
}
