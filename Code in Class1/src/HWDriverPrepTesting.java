import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HWDriverPrepTesting {
    public static void main(String[] args) {
        HWGraph g = createGraph();
        printGraph( g );
        Set<String> keys = g.getKeys();
        String startCity = "Chicago";
        String layOver = getLayOverCity( keys, startCity);
        Vertex v = g.getThisVertex( startCity, layOver);
        System.out.printf("\n The connections from %s with layover in %s distance (%s) are:", startCity, v.label, v.weight);

        showConnections( g, v );
    }

    private static void printGraph(HWGraph g) {
        for (String citys : g.getKeys()) {
            ArrayList<Vertex> vertex = g.getConnections(citys);
            System.out.printf("\n\nNode: %s is connected to:", citys);
            if (citys == "Orlando") {
                System.out.printf("\nNo Outgoing flights from %s", citys);
            }

            for (Vertex connections : vertex) {
                System.out.printf("\t\t\n%s with weight: %s", connections.label, connections.weight);

            }

        }

    }
    private static String getLayOverCity(Set<String> keys, String startCity) {
        Scanner sc = new Scanner(System.in);
        Set<String> newSet = new HashSet<>();
        for (String string: keys) {
            if (!string.equalsIgnoreCase(startCity)){
                newSet.add(string);
            }
        }
        System.out.printf("\nSelect a layover city from %s to %s",startCity, newSet);
        String layoverCity = sc.nextLine();


        if (layoverCity.contains("Orlando")){
            System.out.printf("\nTry Again Please");
            return getLayOverCity(keys,startCity);
        }
        if (layoverCity.contains("Houston")){
            System.out.printf("\nTry Again Please");
            return  getLayOverCity(keys, startCity);
        }
        if(keys.contains(layoverCity)){
            return layoverCity;
        }


        return getLayOverCity(keys,startCity);
    }
    private static void showConnections(HWGraph g, Vertex layOverVertex) {
        Vertex v = layOverVertex;
        String layoverCityConnections = v.label;
        int layoverCityDist = v.weight;

        ArrayList<Vertex> vertex = g.getConnections(layoverCityConnections);
        for(Vertex connections : vertex) {
            System.out.printf("\t\t\n%s Distance from connection: %s Total Distance %s", connections.label, connections.weight, connections.weight+layoverCityDist);

        }

    }

    private static HWGraph createGraph() {
        HWGraph g = new HWGraph();

        g.addVertex("Chicago");
        g.addVertex("New York");
        g.addVertex("Houston");
        g.addVertex("Orlando");
        g.addVertex("Dallas");
        g.addVertex("Atlanta");


        g.addEdge("Chicago", new Vertex("New York", 790));
        g.addEdge("Chicago", new Vertex("Atlanta", 718));
        g.addEdge("Chicago", new Vertex("Dallas", 968));

        g.addEdge("New York", new Vertex("Houston", 1647));
        g.addEdge("New York", new Vertex("Orlando", 1080));

        g.addEdge("Houston", new Vertex("Orlando", 967));

        g.addEdge("Dallas", new Vertex("Orlando", 1120));
        g.addEdge("Dallas", new Vertex("Houston", 239));


        g.addEdge("Atlanta", new Vertex("New York", 870));
        g.addEdge("Atlanta", new Vertex("Dallas", 781));
        g.addEdge("Atlanta", new Vertex("Orlando", 438));



        return g;

    }
}