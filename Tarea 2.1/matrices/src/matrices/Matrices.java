/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

/**
 *
 * @author ledes
 */
public class Matrices {

    
    public static void main(String[] args) {
        
        int[][] matriz = {
        
            {1,2,3},
            {4,5,6}, 
            {7,8,9}
        };
        
        System.out.println("Recorriendo con bucle for anidado");
        for (int i= 0; i< matriz.length; i++) {
            for (int j= 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nRecorriendo con bucle forEach:");
        for (int[] fila : matriz ) {
        for (int elemento : fila) {
            System.out.println(elemento + " ");
        }
            System.out.println();
        }
    }
    
}
