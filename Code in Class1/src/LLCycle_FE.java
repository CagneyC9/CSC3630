

import java.util.ArrayList;
import java.util.HashSet;

public class LLCycle_FE {
    public static void main(String[] args) {
        Node head = buildLL();
        // Given the above linked list write the 2 methods below (removeDuplicates and showLL)
        System.out.printf("\n  --------- ");
        // This method will remove any duplicate LL nodes (that is, with the same color)
        head = removeDuplicates(head);
        // This method will show the LL
        showLL(head);

    }

    public static Node removeDuplicates(Node head) {
        System.out.printf("\n--------- No Duplicates ----------");
        // Walk through the linkedList and remove any nodes with the same color.
        // For example, if the nodes had color name Red, Blue, Red you would
        // return a linked list of only Red and Blue
        Node CurrentNode = head;
        ArrayList<String> Colors = new ArrayList<>();
        while (CurrentNode != null) {
            for (int i = 0; i < Colors.size(); i++) {
                if (CurrentNode.color == Colors.get(i)) {
                    if (CurrentNode.next != null) {
                        CurrentNode = CurrentNode.next;
                    } else {
                        return head;
                    }
                }
            }
            System.out.printf("\n Current Node: %s", CurrentNode.color);
            Colors.add(CurrentNode.color);
            CurrentNode = CurrentNode.next;
        }
        return head;
    }

    private static void showLL(Node head) {
        System.out.printf("\n---------Printed List----------");
        Node CurrentNode = head;
        while (CurrentNode != null) {
            System.out.printf("\n Current Node: %s", CurrentNode.color);
            CurrentNode = CurrentNode.next;
        }
    }

    private static Node buildLL() {
        // Use this code to create your LL
        Node head = new Node("Red", null);

        Node n2 = new Node("Blue", null);
        head.next = n2;

        Node n3 = new Node("Green", null);
        n2.next = n3;

        Node n4 = new Node("Yellow", null);
        n3.next = n4;

        Node n5 = new Node("Blue", null);
        n4.next = n5;

        Node n6 = new Node("Yellow", null);
        n5.next = n6;
        return head;
    }

    public static class Node {
        // Used this Node for a LL node
        public String color;
        public Node next;

        public Node(String color, Node next) {
            this.color = color;
            this.next = next;
        }
    }
}
