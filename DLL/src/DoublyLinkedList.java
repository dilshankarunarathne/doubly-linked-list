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

    public void insertAtStart(int data) {
        Node current = head;
        head = new Node(data);
        current.previous = head;
        head.next = current;
    }

    public void insertLast() {
        if ()
        Node lastNode = null;
        while (true) {
            lastNode = head.next;
            if (lastNode.next == null) {
                break;
            }
        }

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
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}