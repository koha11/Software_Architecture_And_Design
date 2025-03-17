package structural.decorator.composite.binary_tree;

public class LeafNode extends Node {

    public LeafNode(int val) {
        super(val);
    }

    @Override
    public void iterate() {
        System.out.print(" " + val);
    }

    @Override
    public void addLeft(Node n) {

    }

    @Override
    public void addRight(Node n) {

    }
}
