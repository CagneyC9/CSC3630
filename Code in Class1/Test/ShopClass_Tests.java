//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.assertEquals;
//
//public class ShopClass_Tests {
//    @Test
//    public void creationTest() {
//        ArrayList<Item> shoppingList = new ArrayList<>();
//        shoppingList.add(new Item("Banana", 12));
//        ShoppingList_9_6 sl = new ShoppingList_9_6(shoppingList);
//
//
//        assertEquals(1, sl.getSize());
//
//
//    }
//
//    @Test
//    public void addRemoveTest() {
//        ArrayList<Item> shoppingList = new ArrayList<>();
//        shoppingList.add(new Item("Banana", 2));
//        shoppingList.add(new Item("Chicken", 4));
//        shoppingList.add(new Item("Pizza", 6));
//        ShoppingList_9_6 sl = new ShoppingList_9_6(shoppingList);
//        sl.removeItem("Chicken");
//        assertEquals(2, sl.getSize());
//    }
//    @Test
//    public void nameIsThereTest1() {
//        ArrayList<Item> shoppingList = new ArrayList<>();
//        shoppingList.add(new Item("Banana", 2));
//        shoppingList.add(new Item("Chicken", 4));
//        shoppingList.add(new Item("Pizza", 6));
//        ShoppingList_9_6 sl = new ShoppingList_9_6(shoppingList);
////        sl.removeItem("Chicken");
////        int ct = sl.nameIsThere("Chicken");
//        assertEquals(1, sl.nameIsThere("Chicken"));
//    }
//@Test
//    public void nameIsNotThereTest1() {
//        ArrayList<Item> shoppingList = new ArrayList<>();
//        shoppingList.add(new Item("Banana", 2));
//        shoppingList.add(new Item("Chicken", 4));
//        shoppingList.add(new Item("Pizza", 6));
//        ShoppingList_9_6 sl = new ShoppingList_9_6(shoppingList);
////        sl.removeItem("Chicken");
////        int ct = sl.nameIsThere("Chicken");
//        assertEquals(-1, sl.nameIsThere("Blah"));
//    }
//
//}
