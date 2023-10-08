import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RecursionHWTest {
    @Test
    public void ZeroTest() {
        int n = 0;
        int n1 = 0;
        ArrayList<Integer> numbs = new ArrayList(
                Arrays.asList()
        );
        int ret = RecursionHW.getSum(numbs, n, n1);
        assertEquals(0, ret);
    }@Test
    public void OneTest() {
        int n = 1;
        int n1 = 1;
        ArrayList<Integer> numbs = new ArrayList(
                Arrays.asList(1)
        );
        int ret = RecursionHW.getSum(numbs, n, n1);
        assertEquals(1, ret);
    }@Test
    public void TwoTest() {
        int n = 2;
        int n1 = 2;
        ArrayList<Integer> numbs = new ArrayList(
                Arrays.asList(1, 2)
        );
        int ret = RecursionHW.getSum(numbs, n, n1);
        assertEquals(2, ret);
    }
    @Test
    public void NotFound() {
        String inString = "Purple Apples str pretty Pleasing p";
        char tok = 'z';
        int ct = 0;
        int loc = 0;
        int n1 = 2;
        ArrayList<Integer> numbs = new ArrayList(
                Arrays.asList(1, 2)
        );
        int ret = RecursionHW.getHowMany(inString, tok, ct,loc);
        assertEquals(0, ret);
    }
    @Test
    public void Found() {
        String inString = "Purple Apples str pretty Pleasing p";
        char tok = 's';
        int ct = 0;
        int loc = 0;
        int n1 = 2;
        ArrayList<Integer> numbs = new ArrayList(
                Arrays.asList(1, 2)
        );
        int ret = RecursionHW.getHowMany(inString, tok, ct,loc);
        assertEquals(3, ret);
    }@Test
    public void NotFoundNumber() {
        String inString = "Purple Apples str pretty Pleasing p";
        char tok = 5;
        int ct = 0;
        int loc = 0;
        ArrayList<Integer> numbs = new ArrayList(
                Arrays.asList(1, 2)
        );
        int ret = RecursionHW.getHowMany(inString, tok, ct,loc);
        assertEquals(0, ret);
    }

}
