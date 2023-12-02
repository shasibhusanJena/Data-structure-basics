package practiceExamples;

class Node {

	int data;
	Node left,right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class BinarySearchDepthCheckere {

	int maxDepth(Node root) {

		if (root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

	}

	public static void main(String[] args) {
		Node node = new Node(20);
		node.left = new Node(18);
		node.right = new Node(25);
		BinarySearchDepthCheckere b1 = new BinarySearchDepthCheckere();
		int depth = b1.maxDepth(node);
		System.out.println(depth);
	}

}
