import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class InClass_hashSet_922 {
    public static void main(String[] args) {
//        No order
//        HashSet<String > names = new HashSet<>();
//        Insertion Order
        LinkedHashSet<String > names = new LinkedHashSet<>();
//        Alphabetical Order
//        TreeSet<String > names = new TreeSet<>();

        names.add("Jack");
        names.add("Jill");
        names.add("James");
        names.add("Jackie");
        names.add("Jack");

        System.out.printf("Size: %s", names.size());
        for(String name : names){
            System.out.printf("\n Name: %s", name);
        }
        names.remove("Jill");
        if (names.contains("Jill")){
            System.out.printf("\n Yep she's there");
        }

    }
}
