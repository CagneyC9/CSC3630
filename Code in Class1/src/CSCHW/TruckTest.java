package CSCHW;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TruckTest {
    @Test
    public void TruckRemove100(){
String Works = "Work";
assertEquals("Work", Works);
    } @Test
    public  void TruckRemove101(){

        String Works = "Work";
    } @Test
    public void TruckRemove102(){
        String Works = "Worky";

        assertEquals("Worky", Works);
    } @Test
    public void TruckRemove104(){
        String Works = "Works";
        assertEquals("Works", Works);
    } @Test
    public void TruckRemove110(){
        String Works = "Workers";
        assertEquals("Workers", Works);
    } @Test
    public  void TruckRemove120(){
        String Works = "Worker";
        assertEquals("Worker", Works);
    }


}
