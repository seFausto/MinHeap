import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TreeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void AddNodesToTree() {
		
		Tree tree = new Tree();

		
		tree.addNode("ddd");
		tree.addNode("ccc");
		tree.addNode("eee");
		tree.addNode("fff");
		tree.addNode("ggg");
		tree.addNode("hhh");
		tree.addNode("aaa");
		tree.addNode("bbb");
		
		
		String actual = tree.root.word;
		String expected = "aaa";
		Assert.assertEquals("Values are not equal", expected, actual);
		
	}

}
