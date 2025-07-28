package DS.Tree;

import java.util.ArrayList;
import java.util.List;

public class BTreeNode {
    Integer value;
    BTreeNode  leftChildNode;
    BTreeNode rightChildNode;

    BTreeNode(Integer value) {
        this.value = value;
        this.leftChildNode = null;
        this.rightChildNode = null;
    }

    private static Integer currentGlobalMaxWidth = 0;
    private static Integer currentGlobalMaxSum = Integer.MIN_VALUE;
    public static void traverseInOrderDFS(BTreeNode node) {
        if(node == null)
            return;
        traverseInOrderDFS(node.leftChildNode);
        System.out.print(node.value+",");
        traverseInOrderDFS(node.rightChildNode);
    }

    public static void traversePreOrderDFS(BTreeNode node) {
        if(node == null)
            return;
        System.out.print(node.value);
        traversePreOrderDFS(node.leftChildNode);
        traversePreOrderDFS(node.rightChildNode);
    }
    public static void traversePostOrderDFS(BTreeNode node) {
        if(node == null)
            return;
        traversePostOrderDFS(node.leftChildNode);
        traversePreOrderDFS(node.rightChildNode);
        System.out.print(node.value);
    }
    public static void traverseBfs(BTreeNode node, int level, List<List<Integer>> nodeList) {
        if(node == null)
            return;
        if(nodeList.size() <= level) {
            nodeList.add(new ArrayList<>());
        }
        nodeList.get(level).add(node.value);
        traverseBfs(node.leftChildNode, level+1, nodeList);
        traverseBfs(node.rightChildNode, level+1, nodeList);
    }
    public static void traverseTreeBFS(BTreeNode node) {
        List<List<Integer>> nodeList = new ArrayList<>();
        traverseBfs(node, 0,nodeList);
        nodeList.stream().forEach(System.out::println);
    }

    public static Integer heightOfBinaryTree(BTreeNode node) {
        if(node == null)
            return 0;
        int leftTreeHeight = heightOfBinaryTree(node.leftChildNode);
        int rightTreeHeight = heightOfBinaryTree(node.rightChildNode);
        int currentMax = Math.max(leftTreeHeight, rightTreeHeight);
        return currentMax +1;
    }
    public static Integer diameterOfBinaryTree(BTreeNode node) {
        //Width Of Binary Tree
        if(node == null)
            return 0;
        int leftTreeHeight = diameterOfBinaryTree(node.leftChildNode);
        int rightTreeHeight = diameterOfBinaryTree(node.rightChildNode);
        int currentDiameter = leftTreeHeight + rightTreeHeight +1;
        currentGlobalMaxWidth = Math.max(currentDiameter, currentGlobalMaxWidth);
        return Math.max(leftTreeHeight, rightTreeHeight)+1;
    }
    public static Integer findMaxSum(BTreeNode node){
        if(node == null){
            return 0;
        }
        Integer leftSum = Math.max(0,findMaxSum(node.leftChildNode));
        Integer rightSum =  Math.max(0,findMaxSum(node.rightChildNode));
        int currentSum = leftSum + rightSum + node.value;
        currentGlobalMaxSum = Math.max(currentSum, currentGlobalMaxSum);
        return  Math.max(leftSum, rightSum)+ node.value;
    }
}
