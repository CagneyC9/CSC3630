import com.sun.source.util.Trees;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class inClass_9_27 {
    public static void main(String[] args) {
        HashSet<Integer> myNumbs = new HashSet<>();
        HashSet<Double> prices = new HashSet<>();
        HashSet<String> names = new HashSet<>();

        TreeSet<String> MyOtherNames = new TreeSet<>();
        LinkedHashSet<String> mylinkers = new LinkedHashSet<>();
        myNumbs.add(22);
        myNumbs.add(44);
        myNumbs.add(1);

        if (myNumbs.contains(44)){
            System.out.printf("\n Yes we got 44");

        } else {
            System.out.printf("\n No Got it");
        }
        for (int n : myNumbs ){
            System.out.printf("\n n:%a", n);
        }




    }
}

