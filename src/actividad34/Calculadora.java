/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad34;
/**
 *
 * @author magec
 */
public class Calculadora {

    public int sumar(int x, int y) {
            return x + y;
    }
    
    public double dividir(double x, double y) {
            return x / y;
    }
    
    public long factorial(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return (x * factorial(x-1));
        }
    }
}