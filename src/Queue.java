public class Queue
{
   Node head;
   Node tail;

   public Queue(Node node){
   this.head = node;
   this.tail = node;
   }

  void deQueue()
  {
      Node newTail = tail.getPrev();
      System.out.println(tail.getValue());
      tail.setPrev(null);
      tail = newTail;
      tail.setNext(null);
  }
  void enQueue(Node node)
  {
      Node oldHead = head;
      head = node;
      head.setNext(oldHead);
      oldHead.setPrev(node);
  }

  int queuePeek()
  {
      return tail.getValue();
  }
}
