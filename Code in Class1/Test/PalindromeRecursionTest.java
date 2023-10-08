import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeRecursionTest {

        @Test
        public void TestSimple() {
            String s = "aba";
            assertTrue(InClass_Palidrome_9_13.isPalinRecur(s));
        }
        @Test
        public void TestEvenChar() {
            String s = "abba";
            assertTrue(InClass_Palidrome_9_13.isPalinRecur(s));
        }
        @Test
        public void TestNotPali() {
            String s = "abc";
            assertFalse(InClass_Palidrome_9_13.isPalinRecur(s));
        }
        @Test
        public void TestEmpty() {
            String s = "";
            assertTrue(InClass_Palidrome_9_13.isPalinRecur(s));
        }
        @Test
        public void TestOne() {
            String s = "a";
            assertTrue(InClass_Palidrome_9_13.isPalinRecur(s));
        }
    }

