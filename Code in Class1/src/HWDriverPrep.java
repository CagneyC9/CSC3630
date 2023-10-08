import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HWDriverPrep {
    public static void main(String[] args) {
        HWGraph g = createGraph();
        printGraph(g);
        Set<String> keys = g.getKeys();
        String startCity = "Chicago";
        String layOver = getLayOverCity(keys, startCity);
        Vertex v = g.getThisVertex(startCity, layOver);
        System.out.printf("\n The connections from Start: %s with layover N: %s are (%s):", startCity, v.label, v.weight);

        showConnections(g, v);
    }


    //ToDo: Write This Method
    // What: This method should accept a constructuted graph and output the complete graph
    //    It should show the node and each connection to the node.
    private static void printGraph(HWGraph g) {
        for (String city : g.getKeys()) {
            ArrayList<Vertex> vertex = g.getConnections(city);
            for (Vertex connections : vertex) {
                System.out.printf("\nNode: %s is connected to:", city);
                if (city == "Orlando") {
                    System.out.printf("\nNo Cities");
                }
                System.out.printf(" %s with weight: %s", connections.label, connections.weight);

            }

        }

    }

    //ToDo: Write This Method
    // What:  This method should show all the keys that are NOT the startCity
    //        and prompt the user for a layover city.
    // Returns: the city that the user input
    private static String getLayOverCity(Set<String> keys, String startCity) {
        Scanner Scan = new Scanner(System.in);
        Set<String> citySet = new HashSet<>();
        for (String cities : keys) {
            if (cities != startCity) {
                citySet.add(cities);
            }
        }
        System.out.printf("\nChoose a layover city from the following options: %s to %s", startCity, citySet);
        String CityList = Scan.nextLine();
        if ("New York".equals(CityList) || "Atlanta".equals(CityList) || "Orlando".equals(CityList)
                || "Dallas".equals(CityList) || "Houston".equals(CityList)) {
            if (CityList.contains("Orlando")) {
                System.out.printf("\nThis is not a layover city");
                return getLayOverCity(keys, startCity);
            }
            if (CityList.contains("Houston")) {
                System.out.printf("\nThis is not a layover city");
                return getLayOverCity(keys, startCity);
            }
            if (keys.contains(CityList)) {
                return CityList;
            }
            return getLayOverCity(keys, startCity);
        } else {
            System.out.printf("This input is invalid, try again");
            return getLayOverCity(keys, startCity);
        }
    }

    // ToDo: Write this method
    // What: This method inputs the graph (g) and the layoverVertex.
    // Output: All of the cities connected to the layover vertex, their distance and total distance from Chicago
    // E.g.,
    // The connections from Start:Chicago with layover N:New York are (790):
    //      Name:Houston Distance:1647 Total Distance:2437
    //     Name:Orlando Distance:1080 Total Distance:1870
    private static void showConnections(HWGraph g, Vertex LayOverCity) {
        Vertex Node = LayOverCity;
        String layoverCityConnections = Node.label;
        int LayoverWeight = Node.weight;

        ArrayList<Vertex> MyConnections = g.getConnections(layoverCityConnections);

        for (Vertex connections : MyConnections) {
            System.out.printf("\n  Start City: Chicago to Layover City %s:" +
                            " %s Layover to Destination after layover city: %s Total Distance: %s",
                    connections.label, LayoverWeight, connections.weight, connections.weight + LayoverWeight);

        }

    }
    //Todo: Write this method
    // Create the directed graph shown in the problem. Properly construct it to connect all node
    // Returns: The properly connected HWGraph

//    To create the graph I created a new graph by making a new object of HWGraph
//    I had to make my vertices which I sorted by how many edges they had and labeled it as the starting city
//    to the directed city with the weight(distance) of the travel

    private static HWGraph createGraph() {
        HWGraph MyGraph = new HWGraph();

        MyGraph.addVertex("Chicago");
        MyGraph.addVertex("Atlanta");
        MyGraph.addVertex("Dallas");
        MyGraph.addVertex("New York");
        MyGraph.addVertex("Houston");
        MyGraph.addVertex("Orlando");

        MyGraph.addEdge("Chicago", new Vertex("Dallas", 968));
        MyGraph.addEdge("Chicago", new Vertex("Atlanta", 718));
        MyGraph.addEdge("Chicago", new Vertex("New York", 790));

        MyGraph.addEdge("Atlanta", new Vertex("Dallas", 781));
        MyGraph.addEdge("Atlanta", new Vertex("Orlando", 438));
        MyGraph.addEdge("Atlanta", new Vertex("New York", 870));

        MyGraph.addEdge("Dallas", new Vertex("Houston", 239));
        MyGraph.addEdge("Dallas", new Vertex("Orlando", 1120));

        MyGraph.addEdge("New York", new Vertex("Houston", 1647));
        MyGraph.addEdge("New York", new Vertex("Orlando", 1080));

        MyGraph.addEdge("Houston", new Vertex("Orlando", 967));

        return MyGraph;
    }
}