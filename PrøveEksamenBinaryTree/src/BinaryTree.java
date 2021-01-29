import java.sql.Date;

import org.w3c.dom.css.Counter;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 *
	 * @param rootData the data for the root
	 */
	public BinaryTree(E rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 *
	 * @param rootData the data for the root
	 * @param left     the left subtree
	 * @param right    the right subtree
	 */
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 *
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the data at the root of this tree.
	 *
	 * @return the root data
	 */
	public E data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 *
	 * @return the left child of the root
	 */
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 *
	 * @return the right child of the root
	 */
	public BinaryTree<E> right() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.right;
		return result;

	}

	/**
	 *
	 * @param rootData the new data for the root
	 *
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {
		E oldValuE = root.data;
		root.data = rootData;
		return oldValuE;

	}

	/**
	 *
	 * @param n
	 * @return true in n has no children
	 */
	private boolean isLeaf(Node n) {
		if (n.left == null && n.right == null) {
			return true;
		}
		return false;
	}

	/**
	 *
	 * @param n
	 * @return true in n has at least one child
	 */
	private boolean isInternal(Node n) {
		if (n.left != null || n.right != null) {
			return true;
		}
		return false;
	}

	public int countElement(E element) {
		return countElement1(root, element);
	}
	
	private int countElement1(Node n, E element) {
		int counter = 0;
		if (n == null) {
			return 0;
		}
		if (n.data.equals(element)) {
			counter++;
		}
		counter += countElement1(n.left, element) + countElement1(n.right, element);
		return counter;
	}
	
	public int value() {
		return value1(root);
	}
	
	private int value1(Node n) {
				if (n.left == null && n.right == null) {
				return Integer.parseInt((String) n.data);
			} else {
				if (n.data.equals("+")) {
					return value1(n.left) + value1(n.right);
				} else {
					return value1(n.left) * value1(n.right);
				}
			}
		
			
			
		
		
	}

	/**
	 *
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	private int size(Node n) {
		if (n == null) {
			return 0;
		} else {
			return (size(n.left) + 1 + size(n.right));

		}
	}

	public int height() {
		return height(root);
	}

	private int height(Node n) {
		if (n == null) {
			return 0;
		} else {
			return 1 + Math.max(height(n.left), height(n.right));
		}
	}

	private void printPreorder(Node n) {
		if (n == null) {
			return;
		}
		System.out.print(n.data + " ");
		printPreorder(n.left);
		printPreorder(n.right);
	}

	public void printPreorder() {
		printPreorder(root);
	}

	private void printInorder(Node n) {
		if (n == null) {
			return;
		}
		printInorder(n.left);
		System.out.print(n.data + " ");
		printInorder(n.right);
	}

	public void printInorder() {
		printInorder(root);
	}

	private void printPostorder(Node n) {
		if (n == null) {
			return;
		}
		printPostorder(n.left);
		printPostorder(n.right);
		System.out.print(n.data + " ");
	}

	public void printPostorder() {
		printPostorder(root);
	}

	public double averagesum() {
		return (double) sum() / size();
	}

	public int sum() {
		return sum(root);
	}

	private int sum(Node n) {
		int root;
		int total;
		if (n == null) {
			return 0;
		} else {
			root = (int) n.data;
			total = sum(n.left) + sum(n.right);
			return root + total;

		}

	}

	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}
