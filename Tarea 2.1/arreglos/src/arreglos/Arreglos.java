/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

/**
 *
 * @author ledes
 */
public class Arreglos {

    
    public static void main(String[] args) {
        // 1- Declarara e inicializar 
        
        int[] numeros = {10, 25, 32, 44};
        
        // 2. recorrer 
        
       for (int i = 0; i < numeros.length; i++) {
           System.out.println(numeros[i]);
       }
       
        System.out.println("El tercer elemento es: " + numeros[2]);
        
        
        numeros[1] = 50;
        System.out.println("El arreglos modificado: ");
        
        for (int i=0; i <numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}
