//
//import jdk.jshell.Snippet;
//import org.apache.kafka.common.protocol.types.Field;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Scanner;
//
//
//public class OrderManager {
//    static HashMap<String, Double> OrderList = new HashMap<>();
//
//    public OrderManager(HashMap items) {
//    }
//
////    public static boolean IgotThisOrder(int id) {
////        HashSet<Order> retOrder = new HashSet<>();
////        for (Order items : retOrder) {
////
////        }
////        // ToDo: Write this method to return O(1) if the id is in the order set
////        //
////        return false;
////    }
//
//    public static HashMap<Order, Double> IgotThisOrder(int oId) {
//        HashMap<Order, Double> retOrderItem = new HashMap<>();
//        //boolean firstLine = true;
//        for (Order o : retOrderItem.keySet()) {
//            if (o.getOrder_id() == oId) {
//                retOrderItem.put(o, o.getValue());
//            } else {
//                return retOrderItem;
//            }
//        }
//        // ToDo: Write this method to return O(1) if the id is in the order set
//        return retOrderItem;
//    }
//
//    public static HashMap<Order, Double> GetState(String inState) {
//        HashMap<Order, Double> TheOrder = new HashMap<>();
//        //boolean firstLine = true;
//        for (Order orders : TheOrder.keySet()) {
//            String Status = orders.getStatus();
//            System.out.printf("Status:%s", Status);
//        }
//
//        return TheOrder;
//    }
//
//    // ToDo: Write a method
//    public static boolean Update(int OrderItemId, int lineId, String newStatus) {
//        String allData = "";
//        boolean found = false;
//        try {
//
//            File file = new File("order_status.csv");
//            Scanner sc = new Scanner(file);
//            sc.nextLine();
//            while (sc.hasNext()) {
//                String line = sc.nextLine();
//                String[] data = line.split(";");
//                if (OrderItemId == Integer.parseInt(data[0]) && lineId == Integer.parseInt(data[1])) {
//                    data[2] = newStatus;
//                    found = true;
//                }
//                line = String.join(";", data);
//                allData += line + "\n";
//
//            }
//
//
//            public static HashMap<String, Double> Order2 AddOrderId() {
//
//                //
//                public static boolean AddItemToOrder ( int OrderId, int partNum, newStatus){
//                    HashSet<String> AddToMyOrder = new HashSet<>();
//                    AddToMyOrder.add("9990");
//                    AddToMyOrder.add("9991");
//                    AddToMyOrder.add("9992");
//                    AddToMyOrder.add("9993");
//
//                    //ToDo:  Search through the orders for OrderNumer and partNum. If it exists
//                    //       add the quantity to the exsiting order. However if its status is shipped do not
//                    //       add it and return false.
//                    // If the orderNumer and partNum is not found then add the order and set lineNumb to 1, and
//                    //         status to "new"
//
//                    // For example, if the following is the exisiting orders
//                    //1233;1;4;2;shipped;500
//                    //1236;1;2;2;shipped;500
//                    //1236;2;2;1;shipped;200
//                    //1236;3;4;1;picked;4200
//                    //1236;4;1;1;shipped;600
//                    // and your call this method with the following:
//                    //  orderId=1236 partNum=4 and quantity=2
//                    // change the last order:
//                    // from
//                    //1236;4;1;1;shipped;600
//                    // to:
//                    //1236;4;1;3;shipped;600
//                    // Example2
//                    //  if the method is called with orderId=4444 partNum=4 and quantity=2
//                    //  Then add a new order with status new
//
//                    return true;
//                }
//            } catch(FileNotFoundException String e;
//            e){
//                throw new RuntimeException(e);
//            }
//
//
//            public static void AddOrderId () {
//                String[] toks;
//                for (String line : OrderList) {
//                    toks = line.split(",");
//
//                }
//                String item = toks[0];
//                if (!OrderList.containsKey(item)) {
//                    OrderList.put(item, 1.00);
//                } else {
//                    double ct = OrderList.get(item);
//                    ct += 1;
//                    OrderList.put(item, ct);
//                }
//                return Order;
//            }
//
//        }
//    }
//}
//
//
//
