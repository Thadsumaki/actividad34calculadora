/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package actividad34;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author magec
 */
public class CalculadoraUnitTest {
    
    @Test(timeout=1)
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals("Adición inválida",18,calc.sumar(10, 8));
    }
    
}
