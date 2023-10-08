
import lib.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;

public class InClass_OrderProcessor_9_20 {
    public static void main(String[] args) throws FileNotFoundException {
        String fName = "Data/order_status.csv";
        FileIOV2 fio = new FileIOV2(fName);
        fio.setFileData();
        ArrayList<String> OrderData = fio.getFileData();
        System.out.printf("\n len:%s", OrderData.size());
        ArrayList<Order> items = createOrderItems(OrderData);
        System.out.printf("HEllo", items);
        System.out.printf("\n GOT %s structured items", items.size());
        OrderManager1 om = new OrderManager1();
//        ArrayList<Order> retItems = om.(1234);
//        System.out.printf("\n Got items for 1234: size: %s", retItems.size());
//        ArrayList<Order> retItems2 = om.(12345);
//        System.out.printf("\n Got items for 12345: size: %s", retItems2.size());
//        if (om.gotThisOrder(1234)) {
//            System.out.printf("\n Got Order 1234");
//        } else System.out.printf("\n No got 1234");

        OrderData.add("It's a nice day, but it's getting chilly");
//        String fName2 = "Data/myNewFile.txt";
        FileIOV2 fio2 = new FileIOV2(fName);
        fio2.writeFileData(OrderData);

    }
//
//
    private static ArrayList<Order> createOrderItems(ArrayList<String> OrderData) {
        ArrayList<Order> oitems = new ArrayList<>();
//        order_id;line_id;partNum;quantity;shipping_status;value
//        1233;1;4;2;shipped;500
        boolean firstLine = true;
        int ct = 0;
        for (String line : OrderData) {
             ct++;
            if (firstLine) {
                firstLine = false;
                continue;
            }
            String[] toks = line.split(";");
            try {
                int oId = Integer.parseInt(toks[0]);
                int lId = Integer.parseInt(toks[1]);
                int pId = Integer.parseInt(toks[2]);
                int quant = Integer.parseInt(toks[3]);
                String status = toks[4];
                double value = Double.parseDouble(toks[5]);
                oitems.add(new Order(oId, lId, pId, quant, status, value));
            } catch (Exception e) {
                System.out.printf("\n oooooooooooooPPPPPPPSSSSS Help DO SOMETHING!");
                System.out.printf(" ct: %s", ct);
                System.exit(1);

            }

        }
        return oitems;
    }
}
