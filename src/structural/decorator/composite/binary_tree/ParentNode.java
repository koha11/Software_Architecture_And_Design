package structural.decorator.composite.binary_tree;

public class ChildNode extends Node {

    Node left, right;

    public ChildNode(int val) {
        super(val);
    }

    @Override
    public void iterate() {
        left.iterate();
        System.out.print(" " + val);
        right.iterate();
    }

    @Override
    public void addLeft(Node n) {
        left = n;
    }

    @Override
    public void addRight(Node n) {
        right = n;
    }
}
