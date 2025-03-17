package structural.decorator.composite.binary_tree;

public class MainBinaryTree {
    public static void main(String[] args) {
        Node root = new ParentNode(10);
        Node leftNode = new ParentNode(5);
        Node rightNode = new ParentNode(15);

        Node leafNode1 = new LeafNode(1);
        Node leafNode2 = new LeafNode(20);
        Node leafNode3 = new LeafNode(8);
        Node leafNode4 = new LeafNode(12);

        root.addLeft(leftNode);
        root.addRight(rightNode);

        rightNode.addRight(leafNode4);
        rightNode.addLeft(leafNode3);
        leftNode.addRight(leafNode1);
        leftNode.addLeft(leafNode2);

        root.iterate();
//        rightNode.iterate();
//        leftNode.iterate();
    }
}
