


//import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;


public class DriveAncestry {
    public static void main(String[] args) {
        FamilyTree ft = configureTree();
        TreeMap<String, Person> treeEntries = ft.getAllPeople();


        //HashMap<String, Person> treeEntries = configureTree();

//        This shows the original tree before adding the person
        showAllPeople(treeEntries);
        ft = AddNewPerson(ft);   // ToDO Add Maggie born 2021 with Bart and lisa siblings
        // and homer and Marge (Mom and dad)

//        This shows the tree with the person added, most likely Maggie, but any person could be made
        System.out.printf("\n ------------------- All people with Maggie");
        TreeMap<String, Person> treeEntries2 = ft.getAllPeople();
        showAllPeople(treeEntries2);
        String name = "Jackie";
        System.out.printf("\n --- Showing Direct Descendants of %s ", name);
        ShowDirectDescendants(name, ft);
        name = "Abbey";
        System.out.printf("\n ---Showing Direct Descendants of %s ", name);
        ShowDirectDescendants(name, ft);
        name = "Lisa";
        System.out.printf("\n ---- Showing Direct Descendants of %s ", name);
        ShowDirectDescendants(name, ft);

        name = "Mona";
        System.out.printf("\n ---- Showing Direct Descendants of %s ", name);
        ShowDirectDescendants(name, ft);

        name = "Homer";
        System.out.printf("\n ---- Showing Siblings of %s ", name);
        ShowMySiblings(name, ft);
        name = "Maggie";
        System.out.printf("\n ---- Showing Siblings of %s", name);
        ShowMySiblings(name, ft);

        name = "Bart";
        System.out.printf("\n ---- Showing Siblings of %s ", name);
        ShowMySiblings(name, ft);

//        showThisPersonsTree(treeEntries, "Marge");


    }

    //       This method shows the siblings of the person specified
    private static void ShowMySiblings(String person, FamilyTree ft) {
//        Person NewPerson = new Person( person, 1991 );
//        ft.addPerson(person, NewPerson );
//        Person NewPerson2 = new Person( person, 1991 );
//        ft.addPerson(person, NewPerson2 );
//        Person NewPerson3 = new Person( person, 1991 );
//        ft.addPerson(person, NewPerson2 );
//            NewPerson.addParent(NewPerson2);
//            NewPerson.addParent(NewPerson3);


//        This gets the person from the family tree, from the person parameter and then gets the siblings from
//        the first parent of the target person since we are not focused on step siblings etc.
        Person TestPerson = ft.getThisPerson(person);
        ArrayList<Person> Parents = new ArrayList<>();
        Parents = TestPerson.getParent();
//        System.out.printf("\nThis is a test:%s", TestPerson);
//        System.out.printf("\nThis is a test2:%s", Parents);
        System.out.printf("\n Target Person:%s", TestPerson.name);
        ArrayList<Person> Siblings = new ArrayList<>();
        Siblings = Parents.get(0).getChildren();

        int i = 0;
//        If they have siblings then it loops through and prints their name and checks for
//        The original name of the testperson because they cannot be their own sibling
        if (Siblings != null) {
            for (i = 0; i < Siblings.size(); i++) {
                Person Sibling = Siblings.get(i);
                if (Sibling.name != TestPerson.name) {
                    System.out.printf("\nSibling %s ", Sibling.name);
//                    System.out.printf("\nSibInfo%s", Sibling);
                }
            }
//            Otherwise if they do not have a sibling, the get printed out this
        } else {
            System.out.printf("They have no siblings ");
        }


//           int i = 0;
//        if(NewPerson.parent != null){
//           ArrayList<Person> Parents = new ArrayList<>();
//           Parents = NewPerson.parent;
//              ArrayList<Person> Children = new ArrayList<>();
//            for ( i=0; i< Parents.size(); i++){
//                Person MainParent = Parents.get(i);
//                     Children = MainParent.getChildren();
//                System.out.printf("\nChildren of this parent %s are ", Children);
//            }
        return;
    }

    // ToDo:
    // Output all of the siblings of this person. That is someone who shares a mother or father
    // For example if Person is Marge you would show Marge, Patty and Selma

    // This message returns who the target person is married to and all of their children, not including children in law from marrying
    private static ArrayList<Person> ShowDirectDescendants(String ancestor, FamilyTree ft) {
        // ToDo: Write this method that shows the direct descendant
        Person TestPerson = ft.getThisPerson(ancestor);
//        System.out.printf("\nTestPerson%s", TestPerson);
        ArrayList<Person> Descendants = new ArrayList<>();
//        System.out.printf("Spouse %s", TestPerson.spouse);
//        String SpouseName = Spouse.name;

//        Checks if they have a spouse and if they do then lists them
        if (TestPerson.spouse != null) {
            Person Spouse1 = TestPerson.spouse;
            System.out.printf("\n%s is married to %s ", TestPerson.name, Spouse1.name);
        } else {
            System.out.printf("\n%s is not married", TestPerson.name);
        }

//        This creates an Arraylist of the person's children and if they have at least one child start looping through
//        and if their child has a child then loop through again and then go back
        Descendants = TestPerson.children;
        int i = 0;
        if (Descendants.size() >= 1) {
            System.out.printf("\nDescendants: ");
            for (i = 0; i < Descendants.size(); i++) {
                Person TheDescendant = Descendants.get(i);
                System.out.printf("\n%s", TheDescendant.name);
                ArrayList<Person> ChildDescendents = new ArrayList<>();
                ChildDescendents = TheDescendant.children;
                if (ChildDescendents.size() >= 1) {
                    for (i = 0; i < ChildDescendents.size(); ) {

                        Person ChildDescend = ChildDescendents.get(i);
                        System.out.printf("\n%s", ChildDescend.name);
                        i++;
                    }
                }
            }
//            If they have no descendants then this is displayed
        } else {
            System.out.printf("\n They have no descendants");

        }
        return null;
    }


//        FamilyTree DescendantTree = new FamilyTree();
//        Person MainSimpson = new Person("DefaultName", 2000);
//        DescendantTree.addPerson("DefaultName", MainSimpson);
//        MainSimpson.name = ancestor;
//
//        ArrayList<Person> Ancestry = new ArrayList<>();
//        Ancestry = MainSimpson.getChildren();
//        return Ancestry;

//        Bruh[1]


    // For example, if anester="Jackie" it would show:
    //    Jackie married to Clancy
    //     Patty
    //     Selma
    //     Marge
    //       Bart
    //       Lisa


    private static FamilyTree AddNewPerson(FamilyTree ft) {
//        This creates a Scanner to get the information about the person being added
        Scanner AddPerson = new Scanner(System.in);
        System.out.printf("\nEnter the name: ");
        String Name = AddPerson.nextLine();
        System.out.printf("Enter the year of birth: ");
        while (!AddPerson.hasNextInt()) {
            System.out.println("That's not a number!");
            AddPerson.nextInt(); // this is important!
        }
        Integer Year = AddPerson.nextInt();
        System.out.printf("Enter the father: ");
        String Father = AddPerson.nextLine();
        System.out.printf("Enter the mother: ");
        String Mother = AddPerson.nextLine();
//        Person TheMother = ft.getThisPerson(Mother);
        System.out.printf("Enter the spouse: ");
        String Spouse = AddPerson.nextLine();
//        Person TheSpouse = ft.getThisPerson(Spouse);
        Integer BirthYear = (Year);

//        System.out.printf("Person is:%s ", Name + Year + Father + Mother + Spouse);
//        Person NewPerson = new Person(Name, BirthYear);
//        NewPerson.name =
//        ft.addPerson("NewPerson", NewPerson);
//        ArrayList<Person> Parents = new ArrayList<>();
//        Person MaggieFather = ft.getThisPerson(Father);
//        ft.addParent("Maggie", MaggieFather);
//        ft.getAllPeople();

//        This creates the new person using our scanner inputted data
//        This also grabs the people related to Maggie
//        Simple checks to see if the fields entered are null or not
        Person NewPerson = new Person(Name, BirthYear);
        ft.addPerson(Name, NewPerson);
        Person NewFather = ft.getThisPerson(Father);
        if (NewFather != null) {
            ft.addParent(Name, NewFather);
            ft.addChild(NewFather.name, NewPerson);
        }
        Person NewMother = ft.getThisPerson(Mother);
        if (NewMother != null) {
            ft.addParent(Name, NewMother);
            ft.addChild(NewMother.name, NewPerson);
        }
//        Last Check for spouse
        Person TheirSpouse = ft.getThisPerson(Spouse);
        if (TheirSpouse != null) {
            NewPerson.spouse = TheirSpouse;
            TheirSpouse.spouse = NewPerson;
        }


//      This displays all the information inputted which looks neat and also
//        alerts you of all the data added to the new person
        System.out.printf("\nThe person you have added is %s ",Name);
        System.out.printf("\nTheir birth year is %s ",Year);
        System.out.printf("\nTheir father is %s ",Father);
        System.out.printf("\nTheir mother is %s ",Mother);
        System.out.printf("\nTheir spouse is %s ",Spouse);
//        ft.addParent("Maggie", Homer)
//        ft.addParent("Homer", Homer);


//        Parents.add(TheMother);
//        Parents.add(TheFather);
//        NewPerson.getParent();
//        System.out.printf("\n %s", NewPerson.getParent());
//        System.out.printf("\n %s", Parents);


    // ToDo: Prompt the user for new person:
    //    Name and year birth
    //    Mom and Dad
    //    Spouse
    //   Add this person to the tree

        return ft;
}


    private static void showAllPeople(TreeMap<String, Person> treeEntries) {
        for (String name : treeEntries.keySet()) {
            Person m = treeEntries.get(name);
            System.out.printf("\n%s", m.toString());
        }
    }

    private static void showThisPersonsTree(HashMap<String, Person> treeEntries, String searchPerson) {
        System.out.printf("\n =--------------");
        if (treeEntries.containsKey(searchPerson)) {
            Person targetPerson = treeEntries.get(searchPerson);
            boolean gotMoreToDo = true;
            while (gotMoreToDo) {
                gotMoreToDo = false;

            }
        } else {
            System.out.printf("\n The Person:%s does not exist", searchPerson);
        }
        for (String name : treeEntries.keySet()) {
            Person m = treeEntries.get(name);
            System.out.printf("\n%s", m.toString());
        }
    }


    private static FamilyTree configureTree() {
        // ToDo: Configure tree for Homers side of the family
        FamilyTree ft = new FamilyTree();
//        ft.addPerson( );
        Person nullPerson = null;
        Person nullSpouse = null;

        ArrayList<Person> nullChildrenList = new ArrayList<>();
        ArrayList<Person> nullParentList = new ArrayList<>();

        // Bart and Lisa and maggie
        Person Bart = new Person("Bart", 2020);
        ft.addPerson("Bart", Bart);
        Person Lisa = new Person("Lisa", 2021);
        ft.addPerson("Lisa", Lisa);
        Person Marge = new Person("Marge", 1990);
        Person Homer = new Person("Homer", 1991);
        Homer.spouse = Marge;
        ft.addPerson("Homer", Homer);
        Marge.spouse = Homer;
        ft.addPerson("Marge", Marge);

        ft.addParent("Bart", Homer);
        ft.addParent("Lisa", Homer);
        ft.addParent("Bart", Marge);
        ft.addParent("Lisa", Marge);
        ft.addChild("Marge", Lisa);
        ft.addChild("Marge", Bart);
        ft.addChild("Homer", Lisa);
        ft.addChild("Homer", Bart);

        // Lets add Marges Sisters
        Person Selma = new Person("Selma", 1991);
        ft.addPerson("Selma", Selma);
        Person Patty = new Person("Patty", 1992);

        ft.addPerson("Patty", Patty);

        Person Clancy = new Person("Clancy", 1960);
        Person Jackie = new Person("Jackie", 1961);
        Clancy.spouse = Jackie;
        Jackie.spouse = Clancy;
        ft.addPerson("Clancy", Clancy);
        ft.addPerson("Jackie", Jackie);

        ft.addChild("Clancy", Patty);
        ft.addChild("Clancy", Selma);
        ft.addChild("Clancy", Marge);

        ft.addChild("Jackie", Patty);
        ft.addChild("Jackie", Selma);
        ft.addChild("Jackie", Marge);

        ft.addParent("Marge", Clancy);
        ft.addParent("Marge", Jackie);
        ft.addParent("Patty", Clancy);
        ft.addParent("Patty", Jackie);
        ft.addParent("Selma", Clancy);
        ft.addParent("Selma", Jackie);
//        Let's add Homer's Family
//        Homer parents
        Person Mona = new Person("Mona", 1960);
        Person Abraham = new Person("Abraham", 1961);
        Mona.spouse = Abraham;
        Abraham.spouse = Mona;
        ft.addPerson("Mona", Mona);
        ft.addPerson("Abraham", Abraham);

//        Homer siblings(step-siblings)
        Person Herbert = new Person("Herbert", 1991);
        ft.addPerson("Herbert", Herbert);
        Person Abbey = new Person("Abbey", 1992);
        ft.addPerson("Abbey", Abbey);
//        How they are related (children)

        ft.addChild("Mona", Homer);
        ft.addChild("Mona", Abbey);
        ft.addChild("Mona", Herbert);
        ft.addChild("Abraham", Homer);
        ft.addChild("Abraham", Herbert);
        ft.addChild("Abraham", Homer);
//        (Parents)
        ft.addParent("Homer", Mona);
        ft.addParent("Homer", Abraham);
        ft.addParent("Herbert", Abraham);
        ft.addParent("Abbey", Abraham);
        ft.addParent("Herbert", Mona);
        ft.addParent("Abbey", Mona);

        return ft;
    }


}

