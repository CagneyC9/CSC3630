import lib.DBAbstract;

import java.util.ArrayList;
import java.util.HashMap;

public class InClass_DBStuff_10_4 {
    public static void main(String[] args) {
        String pwFile = "input/pw.txt";
        String dbName = "45.55.136.114:3306/csc3610";
//        csc3610 is the name of the database
//        the numbers are the database: scanning for 3306 on the network
        DBAbstract db = new DBAbstract(dbName, pwFile);
//        Method to get to cars in the database
//        HashMap<String, Auto> autos = getDataFromDB( db );
        HashMap<String, ArrayList<Auto>> autos = getDataFromDB2( db );
//        Hashmap string is key, value is auto
        System.out.printf("\n Did this work?------------");
//        for( String key : autos.keySet()) {
//            Auto a = autos.get(key);
//            System.out.printf("\n Auto:%s", autos.get(key).toString());
//        }
        for( String key : autos.keySet()) {
           ArrayList<Auto> cars = autos.get(key);
                for (Auto car : cars) {
                    System.out.printf("\n Auto:%s", autos.get(key).toString());
                }
            }
        }
        String qKey = "Hona:Accord";
//        if (autos.containsKey(qKey)){
//            System.out.printf("\n ------------------ Auto:%s", autos.get(qKey).toString());
//
//        } else {
//            System.out.printf("\n Don't got no key:%s", qKey);
//        }
//
//
//        System.out.printf("Did this work?");

//    }

    //        Connection to databse
    private static HashMap<String,Auto> getDataFromDB(DBAbstract db) {
//        Sql command
        String sql = "Select  make, model,  description, car_condition, color from cars order by make";
//        Returns array list
        ArrayList<String> carStrRows = db.doQueryAL( sql );
        HashMap<String, Auto> retData = new HashMap<>();
//        Let's try to show it
//        Goes through the file and prints all the rows
        for(String row : carStrRows){
//            System.out.printf("\nRow:%s", row);
            String[] toks = row.split(";");
            Auto a = new Auto( toks[0], toks[1], toks[2], toks[3], toks[4]);
//            We want to look up by make model, the first two pieces, custom key combines the two
            String key = toks[0] + ':' + toks[1];
            retData.put(key,a);

        }

        return retData;
    }
//    Arraylist for multiple
    private static HashMap<String, ArrayList<Auto>> getDataFromDB2(DBAbstract db) {
//        Sql command
        String sql = "Select  make, model,  description, car_condition, color from cars order by make";
//        Returns array list
        ArrayList<String> carStrRows = db.doQueryAL( sql );
        HashMap<String, ArrayList<Auto>> retData = new HashMap<>();
        for(String row : carStrRows){
//            System.out.printf("\nRow:%s", row);
            String[] toks = row.split(";");
            Auto a = new Auto( toks[0], toks[1], toks[2], toks[3], toks[4]);
//            We want to look up by make model, the first two pieces, custom key combines the two
            String key = toks[0] + ':' + toks[1];
//            If statement checks if the auto is there and if it is not there
            if ( retData.containsKey(key)){
                ArrayList<Auto> autos = retData.get(key);
                      autos.add(a);
                      retData.put(key, autos);
            } else {
                ArrayList<Auto> autos = new ArrayList<>();
                autos.add(a);
                retData.put(key, autos);
            }

        }

        return retData;
    }
}
