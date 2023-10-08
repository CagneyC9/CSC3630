import java.util.ArrayList;
import java.util.Arrays;

public class stringmanager {
    private String[] myStringList;

    public stringmanager(String[] myStringList) {
        this.myStringList = myStringList;
    }

    public int homeManyOfThis(char inChar) {
        int ct = 0;
        for (String item : myStringList) {
            for (int i = 0; i < item.length(); i++) {
                if (item.charAt(i) == inChar) {
                    ct++;
                }
            }
        }
        return ct;
    }
    ArrayList<Integer> numbs = new ArrayList<>(100);


    public int countOlderThan(int inYear) {
        int ct = 0;
        for (String actor : myStringList) {
            String[] toks = actor.split(";");
            try {

                int bd = Integer.parseInt(toks[3]);
                if (bd > inYear) {
                    ct++;
                }

            } catch (Exception e) {
                System.out.printf("\n Illegal Line:%s", actor);
            }
        }
        return 0;
    }
    public int numBornBefore(int InYear) {
        int ct = 0;
        for (String actor : myStringList)
        try {
            {

                String[] toks = actor.split(";");
                int bd = Integer.parseInt(toks[3]);
                if (bd < InYear) {
                    ct++;
                }
            }
            } catch (Exception e) {
            System.out.printf("\n This actor is Illegal:%s", actor);
        }


        return ct;
    }

}


