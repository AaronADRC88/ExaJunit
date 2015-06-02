

package mcd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculoTest {
    
    public CalculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

 
    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 = 10;
        int num2 = 4;
        Calculo instance = new Calculo();
        String expResult = "2";
        String result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result,0);
        
    }
    
}
