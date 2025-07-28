package DS.Tree;

import com.sun.source.tree.Tree;

public class TreeUtil {
    public static BTreeNode TEST_NODE;
    public static BTreeNode populateTree(){
        BTreeNode root = new BTreeNode(5);
        root.leftChildNode = new BTreeNode(12);
        root.rightChildNode = new BTreeNode(13);
        root.leftChildNode.leftChildNode = new BTreeNode(7);
        root.leftChildNode.rightChildNode = new BTreeNode(14);

        root.rightChildNode.rightChildNode = new BTreeNode(2);
        root.rightChildNode.rightChildNode.rightChildNode = new BTreeNode(87);
//
//        root.leftChildNode.leftChildNode.leftChildNode = new BTreeNode(17);
//        root.leftChildNode.leftChildNode.rightChildNode = new BTreeNode(23);
//
//        root.leftChildNode.rightChildNode.leftChildNode = new BTreeNode(27);
//        root.leftChildNode.rightChildNode.rightChildNode = new BTreeNode(3);
//
//        root.rightChildNode.rightChildNode.leftChildNode = new BTreeNode(8);
//        root.rightChildNode.rightChildNode.rightChildNode = new BTreeNode(11);
        TEST_NODE = root;
        return root;
    }
}
