package Part1.Difficult.StackUsingLinkedList;

import java.util.EmptyStackException;

public class Stack {

    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {

        Node newNOde = new Node(data);
        newNOde.next = top;
        top = newNOde;
        size++;
    }

    public int pop() {

        if (!isEmpty()) {
            int temp = top.data;
            top = top.next;
            size--;
            return temp;
        }
        throw new EmptyStackException();
    }

    public int peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void print() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Node current = top;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
