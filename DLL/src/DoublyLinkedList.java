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
        size = 1;
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
        size++;
    }

    public void insertLast(int data) {
        if (isEmpty()) {
            insertFirst(data);
            return;
        }
        Node lastNode = head;
        while (true) {
            if (lastNode.next == null) {
                break;
            }
            lastNode = lastNode.next;
        }
        lastNode.next = new Node(data);
        lastNode.next.previous = lastNode;
        size++;
    }

    public void insertAt(int data, int position) {
        if (position<1) {
            insertAt(data, size + position);
        }
        if (position>size) {
            throw new IndexOutOfBoundsException("position " + position + "is out of bounds.");
        }
        if (position == 1) {
            Node prevHead = head;
            head = new Node(data);
            prevHead.previous = head;
            head.next = prevHead;
            size++;
            return;
        }
        Node currentNode = head;
        int currentPos = 1;
        while (true) {
            if (currentPos == position) {
                Node newNode = new Node(data);
                currentNode.previous.next = newNode;
                newNode.previous = currentNode.previous;
                newNode.next = currentNode;
                currentNode.previous = newNode;
                size++;
                return;
            }
            currentNode = currentNode.next;
            currentPos++;
        }
    }

    public void deleteFirst() {
        head = head.next;
        head.previous = null;
        size--;
    }

    public void deleteLast() {
        Node lastNode = head;
        int currentPos = 1;
        while (true) {
            if(currentPos == size) {
                lastNode.previous.next = null;
                size--;
                return;
            }
            lastNode = lastNode.next;
            currentPos++;
        }
    }

    public void deleteAt(int position) {
        if (position<1 || position>size) {
            throw new IndexOutOfBoundsException("position " + position + "is out of bounds.");
        }
        Node currentNode = head;
        int currentPos = 1;
        while (true) {
            if (currentPos == position) {
                currentNode.previous.next = currentNode.next;
                currentNode.next.previous = currentNode.previous;
                size--;
                return;
            }
            currentNode = currentNode.next;
            currentPos++;
        }
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
        System.out.println();
	}
}