

public class DriveLinkedListNode1_10_25 {

    public static void main(String[] args) {
        LinkedListNode1 ll = new LinkedListNode1();
        ll.addNode("Apple");
        ll.addNode("Baker");
        ll.addNode("Charlie");
        ll.addNode("Dog");
        if (ll.isItInThere("Baker")) {
            System.out.printf("\n Yes to Baker");
        }
            System.out.printf("\n This size:%s", ll.getSize());
            Node1 n = ll.removeThisItem(("Charlie"));
            System.out.printf("\n Node:%s size:%s", n.value, ll.getSize());
            Node1 theNode = ll.getLLHead();
            int i=0;
            while(theNode != null){
                System.out.printf("\n i:%s, val:%s", ++i, theNode.value);
                theNode = theNode.next;
            }





    }
}
