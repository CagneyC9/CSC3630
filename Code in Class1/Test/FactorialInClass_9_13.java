import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialInClass_9_13 {
    @Test
    public void RecursionSunnyDay() {
        int n = 5;
        int ret = InClass_9_8Recur1.FactorialRecur(n);
        assertEquals(120, ret);
        System.out.printf("I bet this'll be 120: %s", ret);
    }

    @Test
    public void TestZero() {
        int n = 0;
        String inNum = "Blah";
        int ret = InClass_9_8Recur1.FactorialRecur(n);
        assertEquals(1, ret);
    }

    @Test
    public void TestOne() {
        int n = 1;
        String inNum = "Blah";
        int ret = InClass_9_8Recur1.FactorialRecur(n);
        assertEquals(1, ret);
    }

    @Test
    public void TestTwo() {
        int n = 2;
        String inNum = "Blah";
        int ret = InClass_9_8Recur1.FactorialRecur(n);
        assertEquals(2, ret);
    }

    @Test
    public void TestNegative() {
        int n = -20;
        String inNum = "Blah";
        int ret = InClass_9_8Recur1.FactorialRecur(n);
        assertEquals(1, ret);
    }
//    @Test
//    public void TestTooBig(){
//        int n = 32;
//        String inNum = "Blah";
//        int ret = InClass_9_8Recur1.FactorialRecur( n);
//        assertEquals(-2147483648, ret);
//    }
}
