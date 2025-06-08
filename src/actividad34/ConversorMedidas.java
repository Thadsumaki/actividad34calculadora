/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad34;

/**
 *
 * @author magec
 */
import java.util.Scanner;

public class ConversorMedidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERSOR A CENTÍMETROS");
        System.out.println("------------------------");
        System.out.println("¿Qué medida quieres convertir?");
        System.out.println("1. Pies");
        System.out.println("2. Pulgadas");
        System.out.print("Introduce el número de la opción (1 o 2): ");
        int opcion = scanner.nextInt();

        if (opcion != 1 && opcion != 2) {
            System.out.println("Opción inválida. Debes escribir 1 o 2.");
            return;
        }

        System.out.print("Introduce el valor a convertir: ");
        double valor = scanner.nextDouble();

        double resultado = 0;
        String tipoMedida = "";

        if (opcion == 1) {
            resultado = valor * 30.48; // 1 pie = 30.48 cm
            tipoMedida = "pies";
        } else if (opcion == 2) {
            resultado = valor * 2.54; // 1 pulgada = 2.54 cm
            tipoMedida = "pulgadas";
        }

        System.out.printf("%.2f %s equivalen a %.2f centímetros.%n", valor, tipoMedida, resultado);
    }
}

