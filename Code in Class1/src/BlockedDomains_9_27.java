import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

import lib.FileIOV2;
public class BlockedDomains_9_27 {
    //    We want to get the data
//    Prompt the user for the data
//    Check if it is blocked
    public static void main(String[] args) {
        String fName = "Data/blockedDomains.txt";
        ArrayList<String> inLines = getBlockedDomains(fName);
    System.out.printf("Size: %s", inLines.size());
        LinkedHashSet<String> bDomains = convertToHash(inLines);
        System.out.printf("Size: %s", bDomains.size());
        Boolean keepGoing = true;
        while (keepGoing){
            String uIn = getUserInput();
            if (uIn.equalsIgnoreCase("STOP")){
                keepGoing = false;
                break;
            }
            if( bDomains.contains(uIn)) {
                System.out.printf("\n That no good %s", uIn);
            } else{
                System.out.printf("\n That OK: %s", uIn);
            }
        }
        showMeTheList( bDomains);

    }

    private static void showMeTheList(LinkedHashSet<String> bDomains) {
        for (String d : bDomains){
            System.out.printf("\n Domain: %s", d);
        }
    }

    private static String getUserInput() {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter domain to check (or STOP): ");
        return s.nextLine();
    }

    private static LinkedHashSet<String>  convertToHash(ArrayList<String> inLines) {
        LinkedHashSet<String> bDom = new LinkedHashSet<>();
        for(String line :inLines)

        {
            bDom.add(line);

        }
        return bDom;
    }



    private static ArrayList<String> getBlockedDomains(String fName) {
    FileIOV2 fio = new FileIOV2(fName);
    try {
        fio.setFileData();
    }catch (Exception e) {
        System.out.printf("\n fName: %s problem", fName);
        System.out.printf("\n Exception: s", e.getMessage());
    }
    ArrayList<String > retLines = fio.getFileData();
            return retLines;
    }
}
