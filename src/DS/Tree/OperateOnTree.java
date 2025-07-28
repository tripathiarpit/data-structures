package DS.Tree;

public class OperateOnTree {
    public static void main(String[] args) {
        BTreeNode root = TreeUtil.populateTree();
       // System.out.println("\n In Order Traversal");
       // BTreeNode.traverseInOrderDFS(root);
        //System.out.println("\n BFS Traversal");
       // BTreeNode.traverseTreeBFS(root);
      // Integer maxSum =  BTreeNode.findMaxSum(root);
        //System.out.println("Max Sum is"+ maxSum);
        Integer heightOfBinaryTree = BTreeNode.heightOfBinaryTree(root);
        System.out.println("Height of Binary Tree:"+ heightOfBinaryTree);

    }
}
