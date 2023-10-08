public class InClass11_10BSTClass {
    public InClass11_10BST.BSTNode root = null;
    public void inOrderTrav(InClass11_10BST.BSTNode focusNode){
        if (focusNode != null){
            inOrderTrav(focusNode.leftChild);
            System.out.printf("\n Node:%s Val:%s", focusNode.key, focusNode.name);
            inOrderTrav(focusNode.rightChild);
        }
    }
public InClass11_10BST.BSTNode findNode(int key){
//        Return null or the node
    InClass11_10BST.BSTNode focusNode = root;

    while (focusNode.key != key){
        if(key < focusNode.key){
            focusNode = focusNode.leftChild;

        } else {
           focusNode = focusNode.rightChild;
        }
        if(focusNode==null){
            return null;
        }
    }
    return focusNode;
}
    public void addNode(int key, String name) {
        InClass11_10BST.BSTNode newNode = new InClass11_10BST.BSTNode(key, name);
        if (root == null) {
            root = newNode;
        } else {
//            We already got a root
            InClass11_10BST.BSTNode focusNode = root;
            InClass11_10BST.BSTNode parent;
            int loopCt = 0;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
//                    gonna go left
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
//                        leftChild has no children
//                        Set parent to NewNode
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
//                    gonna go right
                        focusNode = focusNode.rightChild;
                        if (focusNode == null) {
//                        rightChild has no children
//                        Set parent to NewNode
                            parent.rightChild = newNode;
                            return;
                        }
                    }
                }
            }
        }
    }

