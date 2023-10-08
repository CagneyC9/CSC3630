import lib.FileIOV2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class SurveySummary_9_29 {
    public static void main(String[] args) {
        String fName = "data/surveyResults.txt";
        FileIOV2 fio = new FileIOV2(fName);
        ArrayList<String> inLines = null;
        try {
            fio.setFileData();
            inLines = fio.getFileData();
        } catch (Exception e) {
            System.out.printf("\nOOOOOOOOOOOOO CANT OPEN AHHHHH HELP: %s", fName);
            System.out.printf("\nMsg: %s", e.getMessage());
            System.exit(1);
        }
//        System.out.printf("\n ->Size: %s", inLines.size());
        int Field = 0;
        LinkedHashMap<String, Integer> theCounts = CountItems( inLines, Field);
        showCounts(theCounts);
        System.out.printf("\n-----------------------------");
        int Field2 = 1;
        LinkedHashMap<String, Integer> theCounts2 = CountItems( inLines, Field2);
        showCounts(theCounts2);
    }

    private static void showCounts(LinkedHashMap<String, Integer> theCounts) {
        for(String key : theCounts.keySet()){
            System.out.printf("\n For K:%s C:%s", key, theCounts.get(key));
        }
    }

    private static LinkedHashMap<String, Integer> CountItems(ArrayList<String> inLines, int field) {
        LinkedHashMap<String, Integer> theCounts = new LinkedHashMap<>(100);
        String[] toks;
        for (String line : inLines) {
            toks = line.split(",");
            if (field > toks.length - 1) {
                throw new IndexOutOfBoundsException("W0w field too big" + field);
            }
            String item = toks[field];
            if (!theCounts.containsKey(item)){
                theCounts.put( item, 1);
            } else {
                int ct = theCounts.get(item);
                ct += 1;
                theCounts.put( item, ct);
            }
        }

        return theCounts;

    }
}
