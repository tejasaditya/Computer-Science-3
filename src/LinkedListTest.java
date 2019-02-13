public class LinkedListTest{

    public static void main(String args[])
    {
        Node firstNode = new Node(17);
       // System.out.println(firstNode.getValue());
        LinkedList mainList = new LinkedList(firstNode);
       // System.out.println(mainList.getCurrentValue());
        Node secondNode = new Node(18);
        mainList.insertCurrent(secondNode);
        Node thirdNode = new Node(19);
        mainList.insertEnd(thirdNode);
        System.out.println(mainList.getCurrentValue());
        mainList.printList();

    }
}