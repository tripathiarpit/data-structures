package tree;

public class PostOrderTraversal {
    public void traverserPostorder(TreeNode node) {
        if (node == null) {
            return;
        }
        traverserPostorder(node.leftNode);
        traverserPostorder(node.rightNode);
        System.out.print(node.data);
    }

    public static void main(String[] args) {
        TreeNode  treeNode = new TreeNode(1);
        treeNode.rightNode = new TreeNode(2);
        treeNode.leftNode = new TreeNode(3);
        treeNode.leftNode.leftNode = new TreeNode(5);
        treeNode.leftNode.rightNode = new TreeNode(6);
        treeNode.rightNode.leftNode = new TreeNode((7));
        treeNode.rightNode.rightNode = new TreeNode(8);
        PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
        postOrderTraversal.traverserPostorder(treeNode);
    }


}
