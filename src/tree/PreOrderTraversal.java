package tree;

public class PreOrderTraversal {
    public void traverserPreorder(TreeNode node) {
        if(node==null) {
            return;
        }
        System.out.print(node.data);
        traverserPreorder(node.leftNode);
        traverserPreorder(node.rightNode);

    }

    public static void main(String[] args) {
        TreeNode  treeNode = new TreeNode(1);
        treeNode.rightNode = new TreeNode(2);
        treeNode.leftNode = new TreeNode(3);
        treeNode.leftNode.leftNode = new TreeNode(5);
        treeNode.leftNode.rightNode = new TreeNode(6);
        treeNode.rightNode.leftNode = new TreeNode((7));
        treeNode.rightNode.rightNode = new TreeNode(8);
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.traverserPreorder(treeNode);
    }

}
