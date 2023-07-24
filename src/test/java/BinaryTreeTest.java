package src.test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import src.main.java.BinaryTree;

public class BinaryTreeTest {
    @Test
    public void testAdd() {

    }

    @Test
    public void testContainsNode() {

    }

    @Test
    public void testCreateBinaryTree() {

    }

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = new BinaryTree();
        bt = bt.createBinaryTree();

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }

    @Test
    public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {
        BinaryTree bt = new BinaryTree();
        bt = bt.createBinaryTree();
        assertTrue(bt.containsNode(9));
        bt.delete(9);
        assertFalse(bt.containsNode(9));
    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    // TODO - Finish this test.
    @Test
    public void testDepthFirstSearch() {
        BinaryTree bt = new BinaryTree();
        bt = bt.createBinaryTree();

        bt.traverseInOrder(bt.getRootNode());
        String log = systemOutRule.getLog();
        System.out.println(log);
        assertEquals("3", log.charAt(0));
        assertEquals("4", systemOutRule.getLog());
        assertEquals("5", systemOutRule.getLog());
        assertEquals("6", systemOutRule.getLog());
        assertEquals("7", systemOutRule.getLog());
        assertEquals("8", systemOutRule.getLog());
        assertEquals("9", systemOutRule.getLog());
    }
}
