import java.util.ArrayList;

public class InClass_12_1DriveHashMapGraph {
    public static void main(String[] args) {
        InClass_12_1HashMapGraph g = createGraph();

        showTheConnections(g, "Mo");
    }

    private static void showTheConnections(InClass_12_1HashMapGraph g, String node) {
        System.out.printf("\n The connections for N:%s are", node);
//        ArrayList<String> connections = g.GetConnections(node);
//        for(String c : connections){
//            System.out.printf("\n C:%s", c);
//        }
    }

    private static InClass_12_1HashMapGraph createGraph() {
        InClass_12_1HashMapGraph g = new InClass_12_1HashMapGraph();
        g.AddVertex("Mo");
        g.AddVertex("Larry");
        g.AddVertex("Curly");
        g.AddVertex("Shemp");

//        ---- now add connections
        g.AddEdge("Larry", "Mo");
        g.AddEdge("Larry", "Curly");
        g.AddEdge("Curly", "Shemp");


        return g;
    }
}
