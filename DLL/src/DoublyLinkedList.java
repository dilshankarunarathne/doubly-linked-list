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

    private void insertFirst(int data) {
        head = new Node(data);
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

    public void insertAt(int data, int index) {
        Node nodeAtPos = head;
        int currentPos = 1;
        while (true) {
            if (index<1 || index>size) {
                throw new IndexOutOfBoundsException("position " + index + "is out of bounds.")
            }
            if (currentPos == index) {
                Node newNode = new Node(data);
                nodeAtPos.previous.next = newNode;
                newNode.previous = nodeAtPos.previous;
                newNode.next = nodeAtPos;
                nodeAtPos.previous = newNode;
                return;
            }
            nodeAtPos = nodeAtPos.next;
            currentPos++;
        }
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
        System.out.println(size);
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