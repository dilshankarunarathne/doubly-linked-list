public class DoublyLinkedList {
    Node head;
    int size;

    public DoublyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void insertAtStart() {
        // Code goes here...
    }

    public void insertLast() {
        // Code goes here...
    }

    public void insertAt() {
        // Code goes here...
    }

    public void deleteFirst() {
        // Code goes here...
    }

    public void deleteLast() {
        // Code goes here...
    }

    public void deleteAt() {
        // Code goes here...
    }

    public void countNodes() {
        // Code goes here...
    }

    public void show() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		while(current != null) {
			//Prints each node by incrementing the pointer.

			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}