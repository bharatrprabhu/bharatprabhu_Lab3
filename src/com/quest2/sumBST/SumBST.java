package com.quest2.sumBST;

public class SumBST {
	int Sum;

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	public SumBST() {
		super();
		root = new Node(40);
		root.left = new Node(20);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right.left = new Node(50);
		root.right.right = new Node(70);
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(int sum) {
		Sum = sum;
	}

	int lastkey = 0;
	boolean foundSum = false;

	void Inorder1(Node node) {
		if (node == null) {
			return;
		}
		Inorder1(node.left);
		if (!foundSum) {
			// System.out.print(node.key + " ");
			if (lastkey != node.key) {
				if (Sum == (lastkey + node.key)) {
					System.out.println("Pair is (" + lastkey + "," + node.key + ")");
					foundSum=true;
				}
			}
		}
		Inorder1(node.right);
	}

	void Inorder2(Node node) {
		if (node == null) {
			return;
		}
		Inorder2(node.left);
		lastkey = node.key;
		Inorder1(root);
		// System.out.print(node.key + " ");
		Inorder2(node.right);
	}

	public void checkSum() {
		Inorder2(root);
		if(!foundSum) {
			System.out.println("nodes are not found");
		}
			
	}

}
