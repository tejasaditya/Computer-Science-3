public class NodeListTest {

    public static void main(String args[])
    {
        Node firstNode = new Node(17);
        LinkedList mainList = new LinkedList(firstNode);
        Node secondNode = new Node(18);
        mainList.insertCurrent(secondNode);
        Node thirdNode = new Node(19);
        mainList.insertEnd(thirdNode);
        System.out.println(mainList.getCurrentValue());
        mainList.printList();

        Stack mainStack = new Stack(firstNode);
        mainStack.stackPush(secondNode);
        mainStack.stackPush(thirdNode);
        mainStack.stackPop();

        Queue mainQueue = new Queue(firstNode);
        mainQueue.enQueue(secondNode);
        mainQueue.enQueue(thirdNode);
        mainQueue.deQueue();

    }
}