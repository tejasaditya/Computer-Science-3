public class TreeNode
{
    TreeNode left;
    int value;
    TreeNode right;
    TreeNode parent;

    public TreeNode(int value) {
        this.value = value;
    }

    TreeNode getLeft(){
        return this.left;
    }

    TreeNode getRight(){
        return this.right;
    }

    TreeNode getParent(){
        return this.parent;
    }

    int getValue(){
        return this.value;
    }

    void setValue(int value){
        this.value = value;
    }

    void setRight(TreeNode node){
        this.right = node;
    }

    void setLeft(
            TreeNode node){
        this.left = node;
    }

    void setParent(TreeNode node) {
        this.parent = node;
    }
}