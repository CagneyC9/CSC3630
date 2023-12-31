public class BST {
  public BSTNode root = null;
  public void inOrderTrav( BSTNode focusNode ) {
      if ( focusNode != null ){
          inOrderTrav( focusNode.leftChild);
          System.out.printf("\n Node:%s Val:%s", focusNode.key, focusNode.name);
          inOrderTrav( focusNode.rightChild);
      }
  }
    public void preOrderTrav( BSTNode focusNode ) {
        if ( focusNode != null ){
            inOrderTrav( focusNode.leftChild);
            System.out.printf("\n Node:%s Val:%s", focusNode.key, focusNode.name);
//            inOrderTrav( focusNode.rightChild);
        }
    }
    public void SmallestNumber( BSTNode focusNode ) {
        if ( focusNode != null ){
            SmallestNumber(focusNode.leftChild);
            if (focusNode.leftChild == null)
            System.out.printf("\n Node:%s Val:%s", focusNode.key, focusNode.name);
            return;

//            inOrderTrav( focusNode.rightChild);
        }
    }
  public BSTNode findNode( int key ){
      // Return null or the node
      BSTNode focusNode = root;
      while ( focusNode.key != key ){
          if ( key < focusNode.key){
              focusNode = focusNode.leftChild;
          } else {
              focusNode = focusNode.rightChild;
          }
          if ( focusNode == null ){
              return null;
          }
      }
      return focusNode;
  }

  public void addNode( int key, String name){
      BSTNode newNode = new BSTNode( key, name);
      if( root == null ){
          root = newNode;
      } else {
          // we already got a root
          BSTNode focusNode = root;
          BSTNode parent = root;
          int loopCt = 0;
          while( true ){
              parent = focusNode;
              if ( key < focusNode.key ){
                  // gonna go left
                  focusNode = focusNode.leftChild;

                  if ( focusNode == null ){
                      // leftChild has no children
                      // Set parent to newNode
//                      System.out.printf("\n TO the left CT:% focus:%s",
//                              loopCt++, parent.key);
                      parent.leftChild = newNode;
                      return;
                  }
              } else {
                  // got to go right
                  focusNode = focusNode.rightChild;
//                  System.out.printf("\n TO the right CT:% focus:%s",
//                          loopCt++, focusNode.key);
                  if ( focusNode == null ){
                      // rughtChild has no children
                      // Set parent to newNode
                      parent.rightChild = newNode;
                      return;
                  }
              }
          }
      }
  }

}