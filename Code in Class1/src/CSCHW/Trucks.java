package CSCHW;

import lib.FileIOV2;
import org.apache.kafka.common.protocol.types.Field;

import java.io.FileNotFoundException;
import java.util.*;

public class Trucks {
    public static void main(String[] args) throws FileNotFoundException {
//        The goal is to use file.io to access the file truckOrder
//        Then
        String fName = "data/truckOrder.txt";
        FileIOV2 fio = new FileIOV2(fName);
        fio.setFileData();
        ArrayList<String> TruckLines = fio.getFileData();
//        System.out.printf("\n len:%s", TruckLines.size());
//        System.out.printf("\nThe File", TruckLines);
//        System.out.printf("\n ->Size: %s", TruckLines.size());
//        ArrayList<String> hi = new ArrayList<>();

        System.out.printf("");
        Deque<TruckObject> TruckStack = new ArrayDeque<>();
        
    
//        Scanner E = new Scanner(TruckLines);
//        for (Integer item : TruckStack) {
//            System.out.printf("\nItem:%s", item);
//        }

//        ArrayList<TruckObject> Dog = CreateItems(TruckLines);

//       Removetrucks();

    }
    Deque<Integer> TestDeque = new ArrayDeque<>();



//    This class was unable to run correclty, but the thought process behind it was if I was able to get the TruckID(first token of the
//    truckOrder.txt) then I could take those values and label them as the trucks in order by having them pushed in order.
//    The Deque should have the ID's pushed automatically by using the first token, but I was unable to achieve that, so theoretically
//    The user inputs which truckID they want to remove and if it is equal to the truck on the top, then it is popped, otherwise
//    the program tells them which one they have to remove first
//    The Deque is returned
    public static Deque<Integer> Removetrucks() {
        Deque<Integer> TruckStack = new ArrayDeque<>();
        TruckStack.push(101);
        TruckStack.push(102);
        TruckStack.push(104);
        TruckStack.push(110);
//        Changed the second 100 to a 115 id
        TruckStack.push(115);
        TruckStack.push(120);
        TruckStack.push(100);
        Scanner input = new Scanner(System.in);
        int TruckID = input.nextInt();
        System.out.printf("\n------Choose another truck to remove------");
        System.out.printf("\nEnter TruckID to remove([100, 101, 102, 104, 110, 120]) or NotInteger");
        System.out.printf("The truck you are removing is", TruckID);
        System.out.printf("\n------Truck Order------");
        System.out.printf("\nTruckID: 101 TruckZip: 60007 TruckPackages: 12");
        System.out.printf("\nTruckID: 102 TruckZip: 60018 TruckPackages: 14");
        System.out.printf("\nTruckID: 104 TruckZip: 60604 TruckPackages: 10");
        System.out.printf("\nTruckID: 110 TruckZip: 60606 TruckPackages: 12");
        System.out.printf("\nTruckID: 115 TruckZip: 60620 TruckPackages: 9");
        System.out.printf("\nTruckID: 120 TruckZip: 60629 TruckPackages: 5");
        System.out.printf("\nTruckID: 100 TruckZip: 60000 TruckPackages: 3");
        int x = TruckStack.size()-1;
        if(TruckID == TruckStack.peek()){
            TruckStack.pop();

        }else {
            System.out.printf("You need to get get this truck out first", TruckStack.peek());
        }

        return TruckStack;
    }
//The point of this is to get the data in truckOrder.txt to relate to the object TruckObject in threeparts, the TruckID, TruckZip,
//    and TruckPackages. The data is split by commas and the most important part to take away is the TruckID since it is guaranteeed
//    to be unique for each truck. By using the parsed int at index[0] we can then use it in the remove method by sorting a deque
//    by adding each line and then removing it if it is the last truck or else, it cannot be removed

    public static ArrayList<TruckObject> CreateTruckItems(ArrayList<String> TruckLines) {
        ArrayList<TruckObject> Truckitems = new ArrayList<>();
        boolean firstLine = true;
        int ct = 0;
        for (String line : TruckLines) {
            ct++;
            if (firstLine) {
                firstLine = false;
                continue;
            }
            String[] toks = line.split(",");
            try {
                int TruckID = Integer.parseInt(toks[0]);
                int TruckZip = Integer.parseInt(toks[1]);
                int TruckPackages = Integer.parseInt(toks[2]);
                Truckitems.add(new TruckObject(TruckID, TruckZip, TruckPackages));
            } catch (Exception e) {
                System.out.printf("\n oooooooooooooPPPPPPPSSSSS Help DO SOMETHING!");
                System.out.printf(" ct: %s", ct);
                System.exit(1);

            }
        }
        return Truckitems;
    }

    public static Deque<TruckObject> GetTruckItems(ArrayList<String> TruckLines, int field) {
        Deque<TruckObject> TruckItems = new ArrayDeque<>();
        String[] toks;
        for (String line : TruckLines) {
            toks = line.split(",");
            if (field > toks.length - 1) {
                throw new IndexOutOfBoundsException("W0w field too big" + field);
            }
            String item = toks[field];
        }

        return TruckItems;
    }
}

