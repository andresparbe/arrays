package matriz_unitaria;

import java.util.Scanner;
/*
 * progama q inserta 1 en el array que sea el mismo 
 * numero de fila y columna y 0 en el resto
 * @author parra	26-02-2024
 */
public class Uno {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el tamaño de la tabla cuadrada
        System.out.println("Ingrese un valor para el tamaño de la tabla:");
        int n = sc.nextInt(); // Variable para almacenar el tamaño de la tabla cuadrada
        
        int[][] tabla = new int[n][n]; // Crear un array 2D (matriz) de tamaño n x n
        
        // Llenar la matriz con 1 en la diagonal principal y 0 en otros lugares
        for(int i = 0; i < tabla.length; i++) {
            for(int c = 0; c < tabla[i].length; c++) {
                if(i == c) { // Si el índice de fila es igual al índice de columna
                    tabla[i][c] = 1; // Establecer el valor en 1
                } else {
                    tabla[i][c] = 0; // Establecer el valor en 0
                }
            }
        }
        
        // Imprimir la matriz
        for(int i = 0; i < tabla.length; i++) {
            System.out.println(" ");
            for(int c = 0; c < tabla[i].length; c++) {
                System.out.print(tabla[i][c] + " - "); // Imprimir cada elemento de la matriz
            }
        }
        
        // Cerrar el scanner para evitar fugas de recursos
        sc.close();
    }
}
