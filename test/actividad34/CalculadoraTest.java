package actividad34;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculadoraTest {
    public CalculadoraTest() {
    } 
    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
    }
    @After
    public void tearDown() {
    }
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int x = 1;
        int y = 5;
        Calculadora instance = new Calculadora();
        int expResult = 6;
        int result = instance.sumar(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     @Test
    public void testDividir() {
        System.out.println("dividir");
        double x = 10.0;
        double y = 2.0;
        double delta = 0.0001;
        Calculadora instance = new Calculadora();
        double expResult = 5.0;
        double result = instance.dividir(x, y);
        assertEquals(expResult, result, delta);
    }

 }
