//import static org.junit.Assert.*;
//
//import com.sun.org.apache.xpath.internal.operations.Or;
//import lib.FileIOV2;
//import org.junit.Assert;
//import org.junit.Test;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;

//public class TestOrder {
//    @Test
//    public void TestGetID(){
//        int n = -20;
//        String inNum = "Blah";
//        int ret = InClass_9_8Recur1.FactorialRecur(n);
//        ArrayList<String> Yo = OrderManager.getAllOrderId();
//        assertEquals(1, ret);


    //    @Test
//    public void TestGetID() {
//        int n = -20;
//        String inNum = "Blah";
//        int ret = InClass_9_8Recur1.FactorialRecur(n);
//        ArrayList<String> Yo = OrderManager.findOrderItems();
//        assertEquals(1, ret);
//
//    }
//    @Test

//    public void test_Main(){
////        This test reads the file and puts a new order with the ID of 9999 and part number of 444
//        String fName = "Data/order_status.csv";
//        HashMap<String, Integer> Order1 = new HashMap<>();
//        FileIOV2 fio = new FileIOV2(fName);
//        Order1.put("9999", 444);
//        boolean ret = true;
//        assertTrue(OrderManager1.IgotThisOrder(9999));
//    }

//    @Test
//    public void test_Find() {
////        This find test scans the hash map to see if there is an order with the id of choice
//        HashMap<String, Integer> Order = new HashMap<>();
//        Order.put("1233", 500 );
//        assertTrue(OrderManager1.getAllOrderId("1233"));
//    }//
////    @Test
////    public void test_State() {
//////        This test will test the state of the order that has OID 1233 and partnum 1
////        HashMap<String, Integer> Order = new HashMap<>();
////        Order.put("1233", 1);
////        OrderManager1.GetState("Shipping");
////    }




//    @Test
//    public void test_Update() {
////        This updates the key and checks to see if it works
//        HashMap<String, Integer> Order = new HashMap<>();
//        Order.put("1233", 44);
//        Order.put("1233", 45);
//
//        OrderManager1.Update(1233, 45, "Shipped");
////    }
////    @Test
//    public void test_add() {
////        This puts a key and value into the hashmap i created and tests it
//        HashMap<String, Integer> Order = new HashMap<>();
//        Order.put("1233", 44);
//        OrderManager1.(44);
//    }
//}


//    @Test
//    public void test_add1() throws FileNotFoundException {
//        HashMap<String, Integer> Order = new HashMap<>();
//        Order.put("1233", 44);
//        assertTrue(OrderManager.findOrderItems());
//    }

//    @Test
//    public void test_add2(){
//        OrderManager.getOrdersByState(1234)
//    }
//
//    }



