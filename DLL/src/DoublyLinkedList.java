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

    private insertFirst(int data) {
        
    }

    public void insertAtStart(int data) {
        if (isEmpty()) {
            insertFirst(data);
            return;
        }
        Node current = head;
        head = new Node(data);
        current.previous = head;
        head.next = current;
    }

    public void insertLast(int data) {
        if (isEmpty()) {
            insertFirst(data);
            return;
        }
        Node lastNode = null;
        while (true) {
            lastNode = head.next;
            if (lastNode.next == null) {
                break;
            }
        }
        lastNode.next = new Node(data);
        lastNode.next.previous = lastNode;
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