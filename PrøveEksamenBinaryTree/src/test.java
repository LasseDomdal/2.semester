

public class test {

	public static void main(String[] args) {
		
		BinaryTree<String> tal4 = new BinaryTree<String>("4");
		BinaryTree<String> tal2 = new BinaryTree<String>("2");
		BinaryTree<String> valueplusleft = new BinaryTree<String>("+", tal2, tal4);
		BinaryTree<String> tal7 = new BinaryTree<String>("7");
		BinaryTree<String> valuestjerne = new BinaryTree<String>("*", valueplusleft, tal7);
		
		BinaryTree<String> tal8 = new BinaryTree<String>("8");
		BinaryTree<String> tal3 = new BinaryTree<String>("3");
		BinaryTree<String> valueplusright = new BinaryTree<String>("+", tal3, tal8);
		
		
		BinaryTree<String> valueroot = new BinaryTree<String>("+", valuestjerne, valueplusright);
		
//		valueroot.printInorder();
		
//		System.out.println(valueroot.countElement("+"));
		
		System.out.println(valueroot.value());
	}

}
