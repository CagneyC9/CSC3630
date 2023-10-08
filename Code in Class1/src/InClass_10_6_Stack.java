import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class InClass_10_6_Stack{
    public static void main(String[] args) {
        Stack<String> myShopList = new Stack<>();
        myShopList.push("Apples");
        myShopList.push("Banana");
        myShopList.push("Cake");
        myShopList.push("Donut");

        String top = myShopList.pop();
        System.out.printf("\n Top:%s", top);
        System.out.printf("\n Size:%s", myShopList.size());
        myShopList.push("Eggs");
        System.out.printf("\n Peek new top:%s", myShopList.peek());
        System.out.printf("\n Size:%s", myShopList.size());
        showStack(myShopList);
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Ayoo");
    }

    private static void showStack(Stack<String> myShopList) {
        System.out.printf("--------------------------------");
        for ( String item: myShopList){
            System.out.printf("\nItem:%s", item);
        }
        Iterator value = myShopList.iterator();
// Displaying the values
// after iterating through the stack
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
