/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad34;

/**
 *
 * @author magec
 */
public class DecimalBinario2 {

    public static void main(String[] args) {
        int numero = 55;
        System.out.println("---> Decimal a Binario ");
        long binario = conversor(numero);
        System.out.println(numero + " en binario es: " + binario);
    }

    public static long conversor(int n) {
        long numeroBinario = 0;
        int resto, i = 1, paso = 1;

        while (n != 0) {
            resto = n % 2;
            System.out.println("Paso " + paso++ + ": " + n + "/2");
            System.out.println("Cociente = " + n / 2 + ", Resto = " + resto);
            numeroBinario += resto * i;
            i *= 10;
            n /= 2;
        }

        return numeroBinario;
    }
}

