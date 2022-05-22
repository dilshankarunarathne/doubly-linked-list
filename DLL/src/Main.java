public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtStart(5);
        list.insertAtStart(7);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(1);
        list.insertLast(2);
        list.insertAtStart(9);
        list.insertAtStart(11);


        
        list.insertAt(21, 1);
        list.insertAt(27, 3);
        list.insertLast(56);
        list.insertAt(27, -1);
        list.show();        // output: 11 21 9 27 7 5 4 3 1 2 56
        list.countNodes();    // output: 11

        list.deleteAt(4);
        list.deleteLast();
        list.deleteFirst();
        list.show();        // output: 21 9 27 5 4 3 1 2
        list.countNodes();    // output: 8
    }

}