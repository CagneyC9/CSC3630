import java.util.ArrayList;

public class Inclass11_22Person {
    String name;
    int birthyear;
    ArrayList<Inclass11_22Person> children = new ArrayList<>();
    ArrayList<Inclass11_22Person> parent = new ArrayList<>();
    Inclass11_22Person spouse = null;

    public Inclass11_22Person (String name, int birthyear){
        this.name = name;
        this.birthyear = birthyear;
    }

    public String getName() {
        return name;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public ArrayList<Inclass11_22Person> getChildren() {
        return children;
    }

    public ArrayList<Inclass11_22Person> getParent() {
        return parent;
    }

    public Inclass11_22Person getSpouse() {
        return spouse;
    }
    public void addParent(Inclass11_22Person p){
        this.parent.add(p);
    }
    public void addChild(Inclass11_22Person p){
        this.children.add(p);
    }
    public void setSpouse(Inclass11_22Person p){
        this.spouse = p;
    }
    @Override
    public String toString() {
        String spouse = null;
        if (this.spouse != null) spouse = this.spouse.name;
        return "Inclass11_22Person{" +
                "name='" + name + '\'' +
                ", birthyear=" + birthyear +
                ", children=" + children.size() +
                ", parent=" + parent.size() +
                ", spouse=" + spouse +
                '}';
    }
}
