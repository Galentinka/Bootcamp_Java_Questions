package Part1.Difficult.BinarySearchTree;

public class BinaryMain {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(50);
        tree.add(25);
        tree.add(75);
        tree.add(10);
        tree.add(30);
        tree.add(60);
        tree.add(65);
        tree.add(80);
        tree.add(85);
        tree.add(1);
        tree.add(100);

        tree.delete(50);
        tree.traverse();

    }
}
