public class LinkedList {

    Node head;
    Node tail;
    Node current;

    //   # e.g myArray = new Array(2)
    public LinkedList(Node node) {
        this.current = node;
        this.head = node;
        this.tail = node;

        //#when setting head and tail, you should check if it has prev, and next values and go to the end
    }

    void moveLeft() {
        this.current = current.getPrev();
    }

    void moveRight() {
        this.current = current.getNext();
    }

    void insertCurrent(Node node) {
       Node newNext = this.current.getNext();
        this.current.setNext(node);
        node.setPrev(this.current);
        node.setNext(newNext);
        if (node.getNext() != null) {
            node.getNext().setPrev(node);
        }
        if (this.current == tail)
        {
            tail = node;
        }
    }
    void insertEnd(Node node)
    {
        Node newNext = this.tail.getNext();
        this.tail.setNext(node);
        node.setPrev(this.tail);
        node.setNext(newNext);
        tail = node;
    }
    int getCurrentValue() {
        return this.current.getValue();
    }
    Node getCurrentNode(){
        return this.current;
    }
    void deleteNode()
    {
        this.current.getNext().setPrev(this.current.getPrev());
        this.current.getPrev().setNext(this.current.getNext());
        this.current.setNext(null);
        this.current.setPrev(null);
    }
    void printList()
    {
        Node printCurrent = head;
        while(printCurrent != null)
        {
            System.out.print(","+printCurrent.getValue());
            printCurrent = printCurrent.getNext();
        }
    }
}