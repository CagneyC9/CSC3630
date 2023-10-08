import java.util.ArrayList;

public class ShoppingList_9_6 {
    ArrayList<Item> shoppingList = new ArrayList<>();

    public ShoppingList_9_6(ArrayList<Item> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public ShoppingList_9_6() {

    }

    public void addItem(String name, int ct, boolean gotIt) {
        int indx = NameIsThere(name);
        if (indx != -1) {
            shoppingList.remove(indx);
            Item nItem = new Item(name, ct);
            shoppingList.add(nItem);
            //do something
        } else {
            Item item = new Item(name, ct);
            shoppingList.add(item);

        }
    }

    public int NameIsThere(String inName) {
        int theIteminx = -1;
        int ct = 0;
        for (Item item : shoppingList) {
            if (item.getName().equals(inName)) {
                theIteminx = ct;
                break;
            }
            ct++;
        }
        return theIteminx;
    }

    public void showList() {
        for (Item item : shoppingList) {
            System.out.printf("\nItem:%s Ct:%s", item.getName(),
                    item.getCt());
        }
    }

    public int getSize() {
        return shoppingList.size();
    }

    public boolean removeItem(String inItem) {
        boolean gotIt = false;
        int ct = 0;
        for (Item item : shoppingList) {
            if (item.getName().equals(inItem)) {
                shoppingList.remove(ct);
                gotIt = true;
                break;
            }
            ct++;
        }
        return gotIt;
    }

    public  ArrayList<Item> getItems(boolean gotIt) {
//        Declares "ShoppingItem"
        ArrayList<Item> ShoppingItem = new ArrayList<>();
//        Iterates through each item in shopping list
        for (Item item : shoppingList) {
// Uses our getter to create our arraylist
            {if (item.isGotIt() == gotIt)
//                I am using the add class here to add an item to my array
                ShoppingItem.add(item);
            }
        }
        // Todo: return an ArrayList of item that
//        //      match the gotIt true or false value.
//        //      For example if set to True, then return
//        //      an ArrayList of Item with .
        return new ArrayList<Item>();
    }

    public boolean renameItem(String origName, String newName) {
//        Setting a boolean value named new name since we will give it new name
//        if needed
        boolean NewName = false;
//        Iterates through shopping list
        for (Item item : shoppingList)
//        Checks if the item is the original name string
        {if (item.getName() == origName)
//  I'm using the setname class here to set the item into the new name
                {item.setName(newName);

                NewName = true;
            }
        }
        return NewName;
    }
}
class Item {
    private String name;
    private int ct;
    private boolean gotIt;
    // This is the gotIt attribute

    public Item(String name, int ct) {
        this.name = name;
        this.ct = ct;
        this.gotIt = isGotIt();
//        Setting it
    }

    public boolean isGotIt() {
        return gotIt;
    }
//    Getting it

    public void setGotIt(boolean gotIt) {
        this.gotIt = gotIt;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCt() {
        return ct;
    }
    public void setCt(int ct) {
        this.ct = ct;
    }
    @Override
    public String toString() {
        return "Item :" +
                "name='" + name + '\'' +
                ", ct=" + ct;
    }
}
