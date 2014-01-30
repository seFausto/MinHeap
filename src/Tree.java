public class Tree {

	Node root;

	public void addNode(String word) {

		Node newNode = new Node(word);

		if (root == null) {
			root = newNode;
		} else {

			Node parent = root;

			while (true) {
				if (parent.leftNode == null) {
					parent.leftNode = newNode;
					return;
				} else {
					if (parent.rightNode == null) {
						parent.rightNode = newNode;
						return;
					}

				}

				if (parent.leftNode.leftNode == null
						|| parent.leftNode.rightNode == null) {
					parent = parent.leftNode;
				} else {
					if (parent.rightNode.leftNode == null
							|| parent.rightNode.rightNode == null) {
						parent = parent.rightNode;
					}
					else
						parent = parent.leftNode.leftNode;
				}
			}
		}

	}

}
