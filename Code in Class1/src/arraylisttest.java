import java.util.ArrayList;

public class arraylisttest {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(1.1);
        prices.add(1.2);
        prices.add(1.3);
        prices.add(1.4);


        for (int i = 0; i < prices.size(); i++)
        System.out.printf("%s %s %s", prices, i, prices.get(2));
    }
}
