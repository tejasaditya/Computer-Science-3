public class BSTTest
{
    public static void main(String args[])
    {
        BinarySearchTree tree = new BinarySearchTree(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(40);
        tree.insert(20);
        tree.insert(60);
        tree.insert(80);
        tree.insert(10);
        tree.insert(45);
        tree.delete(40);
        tree.printTree();

    }
}
