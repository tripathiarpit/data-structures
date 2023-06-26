package tree;

public class InOrderTraversal {
    public void traverserInorder(TreeNode node) {
        if(node==null) {
            return;
        }
        traverserInorder(node.leftNode);
        System.out.print(node.data);
        traverserInorder(node.rightNode);
    }

    public static void main(String[] args) {
        TreeNode  treeNode = new TreeNode(1);
        treeNode.rightNode = new TreeNode(2);
        treeNode.leftNode = new TreeNode(3);
        treeNode.leftNode.leftNode = new TreeNode(5);
        treeNode.leftNode.rightNode = new TreeNode(6);
        treeNode.rightNode.leftNode = new TreeNode((7));
        treeNode.rightNode.rightNode = new TreeNode(8);
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        inOrderTraversal.traverserInorder(treeNode);
    }
}
