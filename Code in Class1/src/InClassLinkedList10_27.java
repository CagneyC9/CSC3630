import java.util.Queue;

public class InClassLinkedList10_27 {
    public static void main(String[] args) {
        System.out.printf("\nStarting ...");
        DoubleLL10_27 dll = new DoubleLL10_27();
        dll.addNode(12 );
        dll.addNode(15 );
        dll.addNode(25 );
        dll.printNodes();
        dll.printNodesReverse();
        int popItem = dll.PopTail();
        System.out.printf("\n Popped:%s", popItem);
        dll.printNodes();

       DoubleLL10_27 dll2 = new DoubleLL10_27();
       dll2.addNode(12);
       int popItem2 = dll2.PopTail();
        System.out.printf("New popped:%s", popItem2);
//        Queue<Integer> myQueue = new


    }
}
