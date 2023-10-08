public class DoubleLL10_27 {
    class Node {
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
            this.next = null;
            this.previous = null;

        }
    }

    Node head, tail = null;

    public void addNode(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = null;
            tail.previous = null;
//                It's the first node
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void printNodes() {
        Node current = head;
        System.out.printf("\n ---- Showing the nodes ----");
        int ct = 0;
        while (current != null) {
            System.out.printf("\nCt:%s Item:%s", ++ct, current.item);
            current = current.next;
        }
    }

    public void printNodesReverse() {
        Node current = tail;
        System.out.printf("\n ---- Showing the nodes in reverse----");
        int ct = 0;
        while (current != null) {
            System.out.printf("\nCt:%s Item:%s", ++ct, current.item);
            current = current.previous;
        }
    }

    public int PopTail() {
//        ToDo: Remove the last item
//        Return -99 if not there
//        Else return the vlaue of the last item
        int retVal = -99;
        if (head == tail && head != null) {
            System.out.printf("\n Flag1");
            return -99;
        } else if (head == null) {
            System.out.printf("\nFlag2");
            retVal = head.item;
            head = null;
            tail = null;
            return retVal;
        } else {
            System.out.printf("\nFlag3");
            retVal = tail.item;
            tail = tail.previous;
            tail.next = null;

        }
        return retVal;
    }
}


