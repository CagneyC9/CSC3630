package HW;

import java.util.*;
import java.util.Deque;

public class MTQuestionDeque {
    public static void main(String[] args) {
        String myString = "AAABCCCDEEEFGAAAA";
        // ToDo: Write the following method
        StringBuilder revString = reverseStringNoDups(myString);
        // The expected output is
        // The String AAABCCCDEEEFGAAAA is GFEDCBA reversed without dupplicate characters
        System.out.printf("\n The String %s is %s reversed without duplicates", myString, revString.toString());
    }

    private static StringBuilder reverseStringNoDups(String myString) {
    Deque<Character> Reversal = new ArrayDeque<Character>();
//I wanted to change the String to a list of characters that I could seperate and put in, in the reverse order and then use a
//Hash set in order to have separate values because hash sets always have unique elements
// , although I was not able to reverse the string


        // push every character of the given string into the stack
        char[] charList = myString.toCharArray();
        for (int i = 0; i < myString.length(); i++) {
            Reversal.push(charList[myString.length()-(i+1)]);
        }


        int ct = 0;

        while (!Reversal.isEmpty())
        {
            // assign each popped character back to the character array
            charList[ct++] = Reversal.pop();
        }
        HashSet<String> List = new HashSet<>();
//        List.add(charList);

        // convert the character array into a string and return it
        return new StringBuilder(String.valueOf(charList));
    }

}


//        char[] reverseString = new char[myString.length()];
//        // Declare a stack of type Character
//
//        Deque<Character> Reversal = new ArrayDeque<Character>();
//
//        // Traverse the String and push the character one by
//        // one into the Stack
//        for (int i = 0; i < myString.length(); i++) {
//            // push the character into the Stack
//            Reversal.push(myString.charAt(i));
//        }
//
//        // Now Pop the Characters from the stack until it
//        // becomes empty
//
//        int i = 0;
//        while (!Reversal.isEmpty()) { // popping element until
//            // stack become empty
//            // get the character from the top of the stack
//            reverseString[i++] = Reversal.pop();
//        }
//        // return string object
//        return new StringBuilder(new String(reverseString));
//    }


//        char[] revString = new char [myString.length()];
//        for (int i = 0; i < myString.length(); i++) {
//            Reversal.push(myString.charAt(i));
//            int ct = 0;
//            while (!Reversal.isEmpty()) {
//                revString[i++] = Reversal.pop();
//            }
//            return new StringBuilder(new String(myString));
//        }
//
//        return null;
//    }



        //Use a deque to reverse the order of the input string
        // Also remove duplicate characters as you place them
        // on the deque. (You can use an additional data structure if
        // needed.) Only use the deque as a stack (with the
        // stack methods).
        // Return a StringBuilder object with the solution.
        //



