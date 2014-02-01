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
					minHeapify(parent);
					return;
				} else if (parent.rightNode == null) {
					parent.rightNode = newNode;
					minHeapify(parent);
					return;

				}

				if (parent.leftNode.leftNode == null
						|| parent.leftNode.rightNode == null) {
					parent = parent.leftNode;
				} else {
					parent = parent.rightNode;
				}
			}
		}
	}

	public void minHeapify(Node focus) {
		Node leftNode = focus.leftNode;
		Node rightNode = focus.rightNode;

		Node smallest = focus;

		if (leftNode != null && leftNode.word.compareTo(focus.word) < 0) {
			smallest = leftNode;
		}

		if (rightNode != null && rightNode.word.compareTo(focus.word) < 0) {
			smallest = rightNode;
		}

		if (smallest.word.compareTo(focus.word) != 0 && focus.leftNode != null
				&& focus.rightNode != null) {

			String temp = focus.word;
			focus.word = smallest.word;
			smallest.word = temp;

			minHeapify(smallest);
		}

	}
}
