/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author ledes
 */
public class Main {
    public static void main(String[] args) {
            
        Persona persona1 = new Persona ();
        persona1.setNombre("Juan");
        persona1.setEdad(25);
        System.out.println("nombre: " + persona1.getNombre() + " edad: " + persona1.getEdad());
    }
}
