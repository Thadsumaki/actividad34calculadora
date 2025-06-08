/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad34;

/**
 *
 * @author magec
 */
public class DecimalBinario {

    public static String aBinario(int n) {
        if (n < 2) {
            return String.valueOf(n);
        }
        return aBinario(n / 2) + String.valueOf(n % 2);
    }

    public static void main(String[] args) {
        System.out.println(aBinario(101));
    }
}

