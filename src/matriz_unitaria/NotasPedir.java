package matriz_unitaria;

import java.util.Scanner;
/*
 * progama q inserta notas en un array bidi
 * y lo recorre buscando el 10 en esa asignatura
 * @author parra	26-02-2024
 */
public class NotasPedir {

    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner sc = new Scanner(System.in);

        // Declarar una matriz para almacenar las notas
        double[][] notas = new double[5][3]; // Matriz de 5 filas y 3 columnas

        // Solicitar al usuario que ingrese las notas para cada alumno y cada módulo
        for (int i = 0; i < notas.length; i++) {
            System.out.println("");
            System.out.println("Dar valores al alumno " + (i + 1)); // Indicar la fila actual
            System.out.println("");
            for (int c = 0; c < notas[i].length; c++) {
                System.out.println("Nota de la asigntatura " + (c + 1)); // Indicar la columna actual
                notas[i][c] = sc.nextDouble(); // Leer y almacenar la nota en la posición correspondiente
            }
        }

      
        // Recorrer la matriz para encontrar módulos con nota 10 para cada alumno
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i + 1)); // Indicar el alumno actual
        	int ultimaNota=-1;

            for (int c = 0; c < notas[i].length; c++) {
                if (notas[i][c] == 10) { // Verificar si la nota es 10 y la copia en una variable

                	ultimaNota=c;
                }

            }
            if(ultimaNota!=-1) {
            	System.out.println("Módulo con nota 10: " + (ultimaNota + 1)); // Indicar el módulo con nota 10
            }
            else {
            	System.out.println("No hay ningun modulo con nota 10");// En caso de no encontrar un 10
            }
        }

        // Cerrar el objeto Scanner para liberar recursos
        sc.close();
    }
}

