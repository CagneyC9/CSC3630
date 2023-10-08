public class drivestringmanager {
    public static void main(String[] args) {
        String[] inString = {"Apples", "PeanutButter", "pinaclep"};
        stringmanager sm = new stringmanager(inString);
        System.out.printf("\n ct=%s", sm.homeManyOfThis( 'p'));
        String[] actors = new String[5];
        actors[0] = "Jerry;Sienfield;960;1954";
        actors[1] = "Tyler;Perry;600;1960";
        actors[2] = "Tom;Cruise;560;1962";
        actors[3] = "George;Clooney;500;1962";
        actors[4] = "Robert;DiNiro;500;1943";
        stringmanager sm2 = new stringmanager(actors);
        System.out.printf("\n CT Younger than:%s", sm2.numBornBefore(1962) );
//        actors[5] = "John;wayne;50;western"; // Error
        System.out.printf("\n CT:%s", sm2.countOlderThan(1962));
    }

    }
