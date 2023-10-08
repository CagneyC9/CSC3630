import java.util.ArrayList;
import java.util.HashMap;

public class InClass_12_1HashMapGraph {
    public HashMap<String, ArrayList<String>> GraphMap = new HashMap<>();

    public void AddVertex(String  label){
        ArrayList<String> items = new ArrayList<>();
        GraphMap.put(label, items);
    }
    public void RemoveVertex(String label){

    }
    public void AddEdge(String label1, String label2){
        GraphMap.get(label1).add(label2);
        GraphMap.get(label2).add(label1);
    }
    public void GetConnections(String label){
        GraphMap.get(label);
    }
}
