import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class GraphWeightedFE {
    HashMap<String, ArrayList<Node>> graph = new HashMap<>();

    public boolean addNode(String nName) {
        ArrayList<Node> MyEdges = new ArrayList<>();
        this.graph.put(nName, MyEdges);
//        for (String CopyCheck : this.graph.keySet()){
//            if (CopyCheck == nName){
//                System.out.printf("\nNo workie");
//                return false;
//            }
//        }

        // ToDo: Write this method that adds the String nName to this.graph
        //     Returns True when added successfully
        //             False is String already exists in the graph as a key
        return true;
    }

    public boolean addEdge(String source, String destName, int weight) {
        Node destNode = new Node(destName, weight);
        this.graph.get(source).add(destNode);
//        System.out.printf("\nStart city:%s, Destination City:%s, The Distance:%s", source, destNode.Name, destNode.weight);


        // ToDo: Complete this method that adds the node to the vertix with String Source
        //          Returns: True if added successfully
        //          Returns False if the vertex source does not exist in the graph


        return true;
    }

    public void printGraph() {

//        System.out.printf("GraphNodes", graphNodes);
        for (String City : graph.keySet()) {
            ArrayList<Node> Example = graph.get(City);
            for (Node Connections : Example) {

                System.out.printf("\nVertex: %s", City);
                System.out.printf("\nNode: %s Distance: %s", Connections.Name, Connections.weight);

                ;
//             Example.get(City)
            }
        }

    }
    // 'ToDo: Write this method that outputs the graph
    //          in the format shown in the ppt slids

    public boolean gotRoute(String startCity, String endCity) {
        boolean routeExists = false;
        ArrayList<Node> Example = graph.get(startCity);

        for (Node Routes : Example) {
            if (endCity == Routes.Name) {
                return true;
            }
//            } else if (Routes.Name != null) {
//                String NewstartCity = Routes.Name;
//                String SameEndCity = endCity;
//                gotRoute(NewstartCity, SameEndCity);
//
//
//            }
        }
        return routeExists;


    }
    // ToDo: Starts at startCity and determine if there is a path from
    //      startCity to endCity
    // ToDo: Returns True if there is a path from startCity to endCity
    //         false if there is not a path

}

class Node {
    String Name;
    int weight;

    public Node(String name, int weight) {
        this.Name = name;
        this.weight = weight;
    }
}