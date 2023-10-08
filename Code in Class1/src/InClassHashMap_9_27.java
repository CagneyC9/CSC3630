import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Set;

public class InClassHashMap_9_27 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> prices = new LinkedHashMap<>();
        prices.put("Apples", 16.99);
        prices.put("Bananas", 12.99);
        prices.put("Hot Dogs", 15.99);

        if (prices.containsKey("Apples")) {
            System.out.printf("Yes we have apples at: %s", prices.get("Apples"));
        } else {
            System.out.printf("\n Not got apples");

        }
        Set<String> myKeys = prices.keySet();
        //        Price increase on Bananas
        Double p = prices.get("Bananas");
        p = p+ 3;
        prices.put("Bananas", p);
        for (String key : prices.keySet()){
           Double price = prices.get(key);
            System.out.printf("\nItem: %s price: %s", key, price);
        }
LinkedHashMap<Integer, String> parts = new LinkedHashMap<>();
        parts.put(1234, "Hammer");
        parts.put(3333, "Saw");
    }
}
