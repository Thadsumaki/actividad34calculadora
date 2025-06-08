/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad34;

/**
 *
 * @author magec
 */
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        long x = calculadora.factorial(10);
        System.out.println("x! = "+ x);
    }
}
