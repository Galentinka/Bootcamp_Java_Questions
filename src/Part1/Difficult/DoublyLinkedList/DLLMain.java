package Part1.Difficult.DoublyLinkedList;

public class DLLMain {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("First list:");
        list.printList();

        list.addFirst(5);
        list.addFirst(1);
        System.out.println("List after adding two more Nodes:");
        list.printList();

        list.delete(20);
        System.out.println("List after deleting 20:");
        list.printList();
    }
}




