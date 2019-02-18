public class BinarySearchTree
{
    TreeNode head;
    TreeNode parent;

   public BinarySearchTree(int value){
     this.head = new TreeNode(value);
     this.parent = new TreeNode(value);
   }

   TreeNode search(TreeNode root, int value)
    {
        if (root.getValue() > value)
        {
            return search(root.left,value);
        }
        if (root.getValue() < value)
        {
            return search(root.right,value);
        }
        return root;
    }

    void insert(int value)
    {
        recInsert(head,value);
    }
    void recInsert(TreeNode root, int value)
    {
        if (root == null) {
            root = new TreeNode(value);
            root.setParent(parent);
        }
        if (value < root.getValue())
       {
           parent = root;
           root.setLeft(root.left);
           recInsert(root.left, value);
       }
       if (value > root.getValue())
       {
           parent = root;
           root.setRight(root.right);
           recInsert(root.right, value);
       }
    }

    void delete(int value)
    {
        TreeNode root = search(head, value);
        if (root.left == null && root.right != null) {
            root.setValue(root.right.getValue());
            root.right.setParent(null);
            root.setRight(null);
        }
        else if (root.right == null && root.left != null) {
            root.setValue(root.left.getValue());
            root.left.setParent(null);
            root.setLeft(null);
        }
        else if(root.left == null && root.right == null)
        {
            root.setParent(null);
            root = null;
        }
        else if(root.left != null && root.right != null)
        {
            root.setValue(minReplaceValue(root.right));
            delete(minReplaceValue(root.right));
        }
    }

    int minReplaceValue(TreeNode targetNode)
    {
        int minValue = targetNode.getValue();
        while(targetNode.left != null)
        {
            minValue = targetNode.left.getValue();
            targetNode = targetNode.left;
        }
        return minValue;
    }

    void printTree()
    {
        recPrintTree(head);
    }

    void recPrintTree(TreeNode root)
    {
        if (root != null)
        {
            System.out.println(root.getValue());
            recPrintTree(root.left);
            recPrintTree(root.right);
        }
    }
}
