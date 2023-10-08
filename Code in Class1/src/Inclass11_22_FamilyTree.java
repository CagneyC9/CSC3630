import java.util.ArrayList;
import java.util.HashMap;

public class Inclass11_22_FamilyTree {
    HashMap<String, Inclass11_22Person> Tree = new HashMap<>();

    public void addPerson(String name, Inclass11_22Person p) {
        Tree.put(name, p);
    }

//    public void addChild(String parent, ArrayList<Inclass11_22Person> children) {
//        if (Tree.containsKey(parent)) {
//            Inclass11_22Person p = Tree.get(parent);
//            p.children = children;
//            Tree.put(parent, p);
//        }
//    }

    public Inclass11_22Person GetPerson(String person) {
        if (Tree.containsKey(person)) {
            return Tree.get(person);

        }
        return null;
    }

    public boolean addChild(String parent, Inclass11_22Person child) {
        if (Tree.containsKey(parent)) {
            Inclass11_22Person p = Tree.get(parent);
            p.addChild(child);
            Tree.put(parent, p);
            return true;
        }
        return false;
    }
    public HashMap<String, Inclass11_22Person> getAllPeople(){
        return null;
    }
}
//        Inclass11_22Person p = (this.GetPerson(parent));
//        if (p != null) {

