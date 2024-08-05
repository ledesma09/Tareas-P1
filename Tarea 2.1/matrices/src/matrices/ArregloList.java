/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;
import java.util.ArrayList;


/**
 *
 * @author ledes
 */
public class ArregloList {
    public static void main(String[] args) {
        
        ArrayList<String>[] listaNombres = new ArrayList[3];
        
        
        for (int i=0; i<listaNombres.length; i++) {
            listaNombres[i] = new ArrayList<>();
            
        }
        
        listaNombres [0].add("Juan");
        listaNombres [0].add("Maria");
        listaNombres [1].add("Pedro");
        listaNombres [1].add("Ana");
        listaNombres [2].add("Carlos");
        listaNombres [0].add("Isabel");
        
        for (int i=0; i<listaNombres.length; i++) {
                System.out.println("Lista " + (i + 1) + ":");
                for (String nombre : listaNombres[i]) {
                    System.out.println(nombre);
                }
        }
        
    }
    
}
