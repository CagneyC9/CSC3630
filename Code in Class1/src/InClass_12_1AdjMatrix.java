import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class InClass_12_1AdjMatrix {
    public static void main(String[] args) {
        int[][] AdjMatrix = getAdjMatrix();
        String[] nodes = setNodeNames();

        String startNode = getStartNode(nodes);
//        System.out.printf("Got Start==>:%s", startNode);
        int index = findThisNode(startNode, nodes);
        System.out.printf("\nIndex=: %s", index);
        if (index == -1) {
            System.out.printf("\n Sorry node is not  found:%s", startNode);
        } else {
            System.out.printf("\nShowing connection form start:%s", startNode);
            int[] TheRow = AdjMatrix[index];
            showConnections(startNode, TheRow, nodes);
        }
    }

    private static void showConnections(String startNode, int[] TheRow, String[] nodes) {
        int pos = 0;
        for (int nodeIndex : TheRow) {
            if (nodeIndex == 1) {
                try{
                    String name = nodes[pos];
                    System.out.printf("\n => %s", name);
                } catch ( Exception e){
                    System.out.printf("\nDrat ... that didnot work:%s", pos);
                }
            }
            pos++;
        }
    }

    private static int findThisNode(String startNode, String[] nodes) {
        int ret = -1;
        int index = 0;
        for (String item : nodes) {
            if (startNode.equalsIgnoreCase(item)) {
                return index;
            }
            index++;
        }
        return ret;
    }

    private static String getStartNode(String[] n) {
        String startNode = "";
//        Arrays.sort(n);
        Scanner s = new Scanner(System.in);
        String oStr = "";
        String cm = "";
        for (String item : n) {
            oStr += cm + item;
            cm = ", ";
        }
        System.out.printf("Enter a start node: %s ->", oStr);
        String retItem = s.nextLine();
        return retItem;
    }

    private static String[] setNodeNames() {
        String[] nodes = {
                "Seattle", "San Francisco", "Los Angeles", "Denver",
                "Kansas City", "Chicago", "Boston",
                "New York", "Atlanta", "Miami", "Dallas", "Houston"
        };
        return nodes;
    }

    private static int[][] getAdjMatrix() {
        int[][] adjacencyMatrix = {
                {0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0}, // Seattle
                {1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, // San Francisco
                {0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, // Los Angeles
                {1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0}, // Denver
                {0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0}, // Kansas City
                {1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0}, // Chicago
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, // Boston
                {0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0}, // New York
                {0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1}, // Atlanta
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1}, // Miami
                {0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1}, // Dallas
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0}  // Houston
        };
        return adjacencyMatrix;
    }

}
