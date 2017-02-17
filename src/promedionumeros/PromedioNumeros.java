/*
 crear un programa que permita allar el promedio de los 15 primeros numeros


 */
package promedionumeros;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class PromedioNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeros = new int[3];
        int valor = 0;
        double suma = 0;
        double promedio = 0;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa los numeros");
            numeros[valor] = entrada.nextInt();
            suma = suma + numeros[valor];

        }
        System.out.printf("Valores Tomados : " + suma + "\n");
        if (suma != 0) {
            promedio = suma / 3;
            System.out.println("El promedio es: " + promedio);
        }
    }

}
