public class MinHeap {


	public static void main(String[] args) {
		
		Tree tree = new Tree();

		tree.addNode("bbb");
		tree.addNode("aaa");
		tree.addNode("ccc");
		tree.addNode("ddd");
		tree.addNode("eee");
		tree.addNode("fff");
		tree.addNode("ggg");
		tree.addNode("hhh");

		System.out.println(tree.root.leftNode.leftNode.leftNode);

	}

}
