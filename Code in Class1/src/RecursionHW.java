import java.util.ArrayList;
import java.util.Arrays;

public class RecursionHW {
    public static void main(String[] args) {
//        This creates our ArrayList of numbs and sets it with the Array class of "aslist"
        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.add(1);
        numbs.add(3);
        numbs.add(5);
        numbs.add(7);
        numbs.add(10);
        System.out.printf("numbs:%s", numbs);
        int sum = 0;
        int i;
        for (i = 0; i < numbs.size(); i++) {
            sum += numbs.get(i);
        }
        System.out.printf("This is the sum:%s", sum);
//        This makes sum the return value of the method getSum and then will print it out as the
//        sum of how many values are in the array


        System.out.printf("\n -------------");
        String inString = "balldddddddddddddddddddddddddddddddd";
        char tok = 'd';
        int loc = inString.length() - 1;
        int sum2 = 0;
        int ct = 0;
        int n = 0;
//        This accesses the method of getHowMany and extracts the count of how many characters
//        were found in the given string inString
        ct = getHowMany(inString, tok, loc, n);
        System.out.printf("\n get how many ct: %s", ct);
    }

    public static int getHowMany(String inString, char tok, int loc, int n) {
//                String item = ;
        if (loc == 0) {
            return n;
        }
        if (inString.charAt(loc) == tok) {
            n += 1;
            return getHowMany(inString, tok, loc - 1, n);
        }

        return getHowMany(inString, tok, loc - 1, n);
    }
}



//    static int getSumRecur(int n) {
//        if (n < 1) return n;
//        if (n == 1) {
//            return 1;
//        } else {
//            return n + getSumRecur(n - 1);
//        }
//
//    }
