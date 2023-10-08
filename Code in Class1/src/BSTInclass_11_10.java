//import Prep.BST;

import java.util.LinkedList;
import java.util.Queue;

public class BSTInclass_11_10 {
    public static void main(String[] args) {
         BST bst = new BST();
//         bst.addNode(  12, "Apples" );
//         bst.addNode(  8, "Bananas" );
//        bst.addNode(  6, "Carrots" );
//        bst.addNode(  19, "Donut" );
//        bst.addNode(  20, "Eggs" );
//        bst.addNode(  25, "Eggs" );
         bst.addNode(  22, "Apples" );
         bst.addNode(  31, "Bananas" );
        bst.addNode(  24, "Carrots" );
        bst.addNode(  16, "Donut" );
        bst.addNode(  48, "Eggs" );

        bst.inOrderTrav( bst.root );
        System.out.printf("\n---- PreOrder ----");
        bst.preOrderTrav(bst.root);
        System.out.printf("\n---Smallest ----");
     bst.SmallestNumber(bst.root);
        System.out.printf("\n---Recursion---");
        System.out.printf("\n Tree Sum:%s", addBST(bst.root));
    System.out.printf("\n---NoRecursion---");
        System.out.printf("\n Tree Sum:%s", addBSTNoRecur(bst.root));


//        BSTNode b = bst.findNode( 58 );
//        System.out.printf("Node:%s", b.toString());

//        BSTNode b2 = bst.findNode( 580 );
//        System.out.printf("Node:%s", b2.toString());

//         bst.addNode(  35, "Executive Aid" );
//         bst.addNode(  15, "Office Manager" );


    }
    public static int addBST( BSTNode root){
//        go through BST and add up all the keys
        if (root == null) return 0;
        return (root.key + addBST(root.leftChild) + addBST(root.rightChild));
    }
    public static int addBSTNoRecur( BSTNode root){
        int sum = 0;
        Queue<BSTNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            BSTNode cur = que.poll(); // return and remove front of queue
            sum += cur.key;
            if (cur.leftChild != null){
                que.add(cur.leftChild);

            }
            if (cur.rightChild != null){
                que.add(cur.rightChild);
            }
        }
        return sum;
    }
}
