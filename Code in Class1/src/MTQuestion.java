package HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MTQuestion {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> carsColors = getCarsAndColors();
        String color = "Black";
        ArrayList<String> byColor = getCarsOfColor(carsColors, color);
        showOutput(byColor, color);
    }

    private static void showOutput(ArrayList<String> byColor, String color) {
//        The idea here was to have a hashmap and the ndetect which cars have a certain colors then do a for list and print out the
//        key of the car that has the color
//        I commented it out since it interferes with my other code

//        HashMap<String, ArrayList<String>> incolors = new HashMap<>();
//        ArrayList<String> rbwb = new ArrayList<String>(Arrays.asList("Red", "Blue", "White", "Black"));
//        incolors.put("Accord", rbwb);
//        ArrayList<String> bw = new ArrayList<String>(Arrays.asList("Black", "White"));
//        incolors.put("Encore", bw);
//        ArrayList<String> brb = new ArrayList<String>(Arrays.asList("Blue", "Red", "Black"));
//        incolors.put("Camry", bw);
//        ArrayList<String> br = new ArrayList<String>(Arrays.asList("Red", "Green"));
//        incolors.put("Tacoma", bw);
//        ArrayList<String> wbr = new ArrayList<String>(Arrays.asList("White", "Blue", "Red"));
//        incolors.put("Corolla", bw);
//        String color = "Black";
//        for (String key : carsColors.keySet()) {
//            System.out.printf("\nKey:%s ", key);
//            ArrayList<String> ColorChecker = incolors.get(key);
//            ArrayList<String> CarColor = incolors.get(key);
//            if (ColorChecker.contains("Black")) {
//        System.out.printf("These cars have color:%s", color);
//                for(item: incolors){
//        System.out.printf("Car", key);
//                CarColor.add(key);
//
//            }
//            return CarColor;
//        }

//        for(String Color : )
        // Output the cars by color like the following:
        //These cars have color:Black
        //  Car:Tacoma
        //  Car:Encore
        //  Car:Camry
        //  Car:Accord
        //  Car:Corolla
    }

    private static ArrayList<String> getCarsOfColor(HashMap<String, ArrayList<String>> carsColors, String inColor) {
//        This is a hashmap to access all the cars and their associated array list with the key of what car it is. This code aims to
//        loop through this Hashmap and then detect if it has the certain color being searched for and displaying it. I am only getting
//        one key and one color back and it will not let me add an arraylist
        HashMap<String, ArrayList<String>> incolors = new HashMap<>();
        ArrayList<String> rbwb = new ArrayList<String>(Arrays.asList("Red", "Blue", "White", "Black"));
        incolors.put("Accord", rbwb);
        ArrayList<String> bw = new ArrayList<String>(Arrays.asList("Black", "White"));
        incolors.put("Encore", bw);
        ArrayList<String> brb = new ArrayList<String>(Arrays.asList("Blue", "Red", "Black"));
        incolors.put("Camry", bw);
        ArrayList<String> br = new ArrayList<String>(Arrays.asList("Red", "Green"));
        incolors.put("Tacoma", bw);
        ArrayList<String> wbr = new ArrayList<String>(Arrays.asList("White", "Blue", "Red"));
        incolors.put("Corolla", bw);
        String color = "Black";
        for (String key : incolors.keySet()) {
            System.out.printf("\nKey:%s ", key);
            ArrayList<String> ColorChecker = incolors.get(key);
            ArrayList<String> CarColor = incolors.get(key);
            if (ColorChecker.contains("Black")) {
                System.out.printf("\nThis car has the color black", key);
                CarColor.add(key);

            }
            return CarColor;
        }

        // ToDo: Write this method that
        //        1. Compares inColor with the carsColors data structure
        //        Return: all cars that match the inColor color
        //        For Example,
        //               1.if inColor is "Green" it would return in the ArrayList of Tacoma
        //               2. If inColor is "Red" then return an arrayList of Camry, Accord
        return null;
    }

    private static HashMap<String, ArrayList<String>> getCarsAndColors() {
        HashMap<String, ArrayList<String>> carColors = new HashMap<>();
        ArrayList<String> rbwb = new ArrayList<String>(Arrays.asList("Red", "Blue", "White", "Black"));
        carColors.put("Accord", rbwb);
        ArrayList<String> bw = new ArrayList<String>(Arrays.asList("Black", "White"));
        carColors.put("Encore", bw);
        ArrayList<String> brb = new ArrayList<String>(Arrays.asList("Blue", "Red", "Black"));
        carColors.put("Camry", bw);
        ArrayList<String> br = new ArrayList<String>(Arrays.asList("Red", "Green"));
        carColors.put("Tacoma", bw);
        ArrayList<String> wbr = new ArrayList<String>(Arrays.asList("White", "Blue", "Red"));
        carColors.put("Corolla", bw);

        return carColors;
    }
}
