import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class OrderManager1 {
    ArrayList<Order> orders = new ArrayList<>();
    HashSet<Integer> OrdersHash = new HashSet<>();
    HashMap<Integer, ArrayList<Order>> FindOrders = new HashMap();

    HashMap<String, ArrayList<Order>> OrderState = new HashMap();

    public OrderManager1() {
    }

    public void addOrder(Order o) {
        orders.add(o);
        OrdersHash.add(o.getOrder_id());
        if (FindOrders.containsKey(o.getOrder_id())) {
            ArrayList<Order> Orderz = FindOrders.get(o.getOrder_id());
            Orderz.add(o);
            FindOrders.put(o.getOrder_id(), Orderz);
        } else {
            ArrayList<Order> NoId = new ArrayList<>();
            NoId.add(o);
            FindOrders.put(o.getOrder_id(), NoId);
        }

        if (OrderState.containsKey(o.getStatus())) {
            ArrayList<Order> Orderz = OrderState.get(o.getStatus());
            Orderz.add(o);
            OrderState.put(o.getStatus(), Orderz);
        } else {
            ArrayList<Order> NoId = new ArrayList<>();
            NoId.add(o);
            OrderState.put(o.getStatus(), NoId);
        }
    }

    public boolean gotThisOrder(int id) {
        // ToDo: Write this method to return O(1) if the id is in the order set
        //
        if (OrdersHash.contains(id)) {
            return true;
        }
        return false;
    }

    public ArrayList<Order> findOrders(int oId) {
        // ToDo: Rewrite this method to operation O(1) instead of O(n)
        if (FindOrders.containsKey(oId)) {
            ArrayList<Order> Orderz = FindOrders.get(oId);

            return Orderz;
        }

        return null;
    }

    public ArrayList<Order> getOrdersByState(String inState) {
        //ToDo: Rewrite this method to be more efficent and use a hash
        if (OrderState.containsKey(inState)) {
            ArrayList<Order> Orderz = OrderState.get(inState);

            return Orderz;
        }

        return null;
    }

    //boolean firstLine = true;
//        for (Order o : orders) {
//            if (o.getStatus().equals(inState)) {
//                retOrder.add(o);
//            }
//        }
//        return retOrder;


    // ToDo: Write a method
    public boolean updateThisOderLineId(int orderId, int lineId, String newStatus) {
        //ToDo: find the orderId and lineId that matches the input and
        //      set status to newStatus.
        // For example:
        //     updateThisOrderLineId( 1233, 1, "staged" )
        // Whould update this this item:
        // From:
        //       1233;1;4;2;shipped;500
        // TO:
        //       1233;1;4;2;staged;500
        // Returns: True -> If the proper item  is found and updated
        //          False -> if cannot find the item OR newStatus is NOT
        //                    new, staged, shipped, picked or delivered.
        return false;
    }

    public ArrayList<Integer> getAllOrderId() {
        ArrayList<Integer> orders = new ArrayList<>();
        for (int i = 0; i < OrdersHash.size(); i++) {
//            if (OrdersHash
        }
//    }
        // ToDo: Return arrayList of all the unique orderIds
 return orders;

}

        //
        public boolean AddItemToOrder ( int OrderId, int partNum, int quantity){
            return true;
            //ToDo:  Search through the orders for OrderNumer and partNum. If it exists
            //       add the quantity to the exsiting order. However if its status is shipped do not
            //       add it and return false.
            // If the orderNumer and partNum is not found then add the order and set lineNumb to 1, and
            //         status to "new"


            // For example, if the following is the exisiting orders
            //1233;1;4;2;shipped;500
            //1236;1;2;2;shipped;500
            //1236;2;2;1;shipped;200
            //1236;3;4;1;picked;4200
            //1236;4;1;1;shipped;600
            // and your call this method with the following:
            //  orderId=1236 partNum=4 and quantity=2
            // change the last order:
            // from
            //1236;4;1;1;shipped;600
            // to:
            //1236;4;1;3;shipped;600
            // Example2
            //  if the method is called with orderId=4444 partNum=4 and quantity=2
            //  Then add a new order with status new

        }
    }

