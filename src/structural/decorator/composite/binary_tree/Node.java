package structural.decorator.composite.binary_tree;

public abstract class Node {
    int val;

    public Node(int val) {
        this.val = val;
    }

    public abstract void iterate();
    public abstract void addLeft (Node n);
    public abstract void addRight (Node n);
}
