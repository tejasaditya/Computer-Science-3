public class BinarySearchTree
{
    TreeNode head;
    TreeNode parent;

    //constructor to initialize a BST with a single value
    // also tracks the parent of each node
   public BinarySearchTree(int value){
     this.head = new TreeNode(value);
     this.parent = this.head;
   }

   // find the desired value and return it back
   TreeNode search(TreeNode root, int value)
    {
        if (root == null || root.getValue() == value) // if the node is null, return null and if the value matches then return the node
        {
            return root;
        }
        else if (root.getValue() > value)  //if node value is more than desired value, call search function recursively on left child
        {
            return search(root.left,value);
        }
        else //else call search function recursively on right child
        {
            return search(root.right,value);
        }
    }

    // call recInsert on the head and the value given
    void insert(int value)
    {
        recInsert(head,value);
    }

    //insert a value into the tree
    void recInsert(TreeNode root, int value)
    {
        //test code for previous method implementation
//        if (root == null) {
//            System.out.println("Add new Node");
//            root = new TreeNode(value);
//            root.setParent(parent);
//        }
        if (value < root.getValue()) // if insert value is less than current term, move to the left leaf
       {
           // test code from previous method implementation
//           this.parent = root;
//           System.out.println(this.parent.getValue());
           if (root.left == null) //if left root is non-existent, then create one with the given value
           {
               root.left = new TreeNode(value);
               root.left.setParent(root);
           }
           else // if left child exist, call recInsert on the left child
           {
               recInsert(root.left, value);
           }
       }
       else if (value > root.getValue()) // if insert value is more than current term, move to the right leaf
       {
//           this.parent = root;
           if (root.right == null) //if right root is non-existent, then create one with the given value
           {
               root.right = new TreeNode(value);
               root.right.setParent(root);
           }
           else //if right child exist, call recInsert on the left child
           {
               recInsert(root.right, value);
           }
       }
    }

    // delete a specific value
    void delete(int value)
    {
        //find node to be deleted
        TreeNode root = search(head, value);

        // if node has only right child, copy it into the node and delete child
        if (root.left == null && root.right != null) {
            root.setValue(root.right.getValue());
            root.right.setParent(null);
            root.setRight(null);
        }

        //if node has only left child, copy it into the node and delete child
        else if (root.right == null && root.left != null) {
            root.setValue(root.left.getValue());
            root.left.setParent(null);
            root.setLeft(null);
        }

        // if node has no child, find the parent and declare the child null
        else if(root.left == null && root.right == null)
        {
            System.out.println("Case three");
            if (root.getValue() < root.parent.getValue())
            {
                root.parent.setLeft(null);
            }
            else if (root.getValue() > root.parent.getValue())
            {
                root.parent.setRight(null);
            }
            else{
                System.out.println("Exiting case three");
            }

        }
        // if node has both left and right child, replace with min value on the right tree and delete that node
        // by calling the minReplaceValue function
        else if(root.left != null && root.right != null)
        {
            root.setValue(minReplaceValue(root.right));
        }
    }

    // find the least value on the right side tree of the node to be deleted
    // and then delete the node containing the value
    int minReplaceValue(TreeNode targetNode)
    {
        int minValue = targetNode.getValue();
        while(targetNode.left != null)
        {
            minValue = targetNode.left.getValue();
            targetNode = targetNode.left;
        }
        delete(minValue);
        return minValue;
    }

   // call the recPrintTree on the head
   void printTree()
    {
        recPrintTree(head);
    }

    // print the BST depth size
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
