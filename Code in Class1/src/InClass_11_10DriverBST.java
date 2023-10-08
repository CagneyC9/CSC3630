public class InClass_11_10DriverBST {
    public static void main(String[] args) {
        InClass11_10BSTClass bst = new InClass11_10BSTClass();
        bst.addNode(50, "Apples");
        bst.addNode(25, "Bananas");
        bst.addNode(35, "Carrot");
        bst.addNode(56, "Donut");
        bst.addNode(58, "Eggs");

        bst.inOrderTrav(bst.root);

       InClass11_10BST.BSTNode b = bst.findNode(58);
        System.out.printf("\nNode:%s ", b);

        InClass11_10BST.BSTNode b2 = bst.findNode(580);
        System.out.printf("\nNode:%s ", b2);
    }
}
