import java.security.spec.RSAOtherPrimeInfo;

public class Inclass11_22Drivefamily {
    public static void main(String[] args) {
        Inclass11_22_FamilyTree ft = configureTree();
        showAllPeople(ft);
    }


    private static void showAllPeople(Inclass11_22_FamilyTree ft) {
        for (String name : ft.Tree.keySet()){
            Inclass11_22Person p = ft.Tree.get(name);
            System.out.printf("\n P:%s ", p);
        }
    }


    private static Inclass11_22_FamilyTree configureTree() {
        Inclass11_22_FamilyTree ft = new Inclass11_22_FamilyTree();

        Inclass11_22Person bart = new Inclass11_22Person("Bart", 2020);
        ft.addPerson("Bart", bart);
        Inclass11_22Person Lisa = new Inclass11_22Person("Lisa", 2021);
        ft.addPerson("Lisa", Lisa);

        Inclass11_22Person Marge = new Inclass11_22Person("Marge", 1990);
        ft.addPerson("Marge", Marge);
        ft.addChild("Marge", Lisa);
        ft.addChild("Marge", bart);
        Inclass11_22Person Selma = new Inclass11_22Person("Selma", 1990);
        ft.addPerson("Selma", Selma);


        Inclass11_22Person Jacqueline = new Inclass11_22Person("Jacqueline", 1990);
        ft.addPerson("Jacqueline", Jacqueline);
        ft.addChild("Jacqueline", Marge);

        Inclass11_22Person Clancy = new Inclass11_22Person("Clancy", 1990);
        Clancy.spouse = Jacqueline;
        ft.addPerson("Clancy", Clancy);
        ft.addChild("Clancy", Marge);

        Marge.spouse = Clancy;
        ft.addPerson("Jacqueline", Jacqueline);

//        Add parents to the node Marge // dont think i need to do this
        Marge.addParent(Jacqueline);
        Marge.addParent(Clancy);
        ft.addPerson("Marge", Marge); // dont think i need to do this
        Selma.addParent(Jacqueline);
        Selma.addParent(Clancy);
//        ft.addPerson("Selma", Selma); // dont think i need to do this


        return ft;
    }
}
