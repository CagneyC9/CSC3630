package InClassWeek7;

import java.util.*;

public class InClass10_11 {
    public static void main(String[] args) {
        Deque< String > myD = new ArrayDeque<>();
        Deque< String > myD2 = new LinkedList<>();


        HashMap<String, ArrayList<Auto>> autos = new HashMap<>();


        String deleteThese = "Red";
        Auto newAuto = new Auto("Chevy", "Accord", "good", "good", "blue");
        String a = "Chevy";
        if (autos.containsKey(a)) {
            ArrayList<Auto> chevies = autos.get(a);
//            ArrayList<Auto> newChevies = deleteThisColor(deleteThese, chevies);
//            autos.put(a, newChevies);
        }

//        Add the new chevy accord
        if (autos.containsKey(a)) {
            ArrayList<Auto> chevies = autos.get(a);
            chevies.add(newAuto);
            autos.put(a, chevies);
        }
        final String b = "Chevy";
        for (int i = 0; i < autos.size(); i++) {
            for (int j = 0; j < b.length(); j++) {
                System.out.printf("\n Blah");
            }
        }
    }
}
