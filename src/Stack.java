public class Stack
{
    Node head;
    Node tail;

    public Stack(Node node){
        this.head = node;
        this.tail = node;
}
    void stackPush(Node node)
    {
        Node oldHead = head;
        head = node;
        head.setNext(oldHead);
    }

    void stackPop()
    {
        Node newHead = head.getNext();
        System.out.println(head.getValue());
        head.getNext().setPrev(null);
        head = newHead;
    }

    int stackPeek()
    {
        return head.getValue();
    }
}
