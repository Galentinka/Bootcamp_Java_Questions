package Part1.Difficult.StackUsingLinkedList;

public class StackUsingLinkedList {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after pushes:");
        stack.print();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop:");
        stack.print();

    }
}
