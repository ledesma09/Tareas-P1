/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author ledesma
 */
public class Tv {

    /**
     * @param args the command line arguments
     */
    

    // Atributos
    private String marca;
    private int tamaño;
    private boolean encendida;
    private int volumen;

    // Constructor
    public Tv(String marca, int tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.encendida = false; // La TV empieza apagada
        this.volumen = 10; // Volumen inicial
    }

    // Método para encender la TV
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("La TV " + marca + " se ha encendido.");
        } else {
            System.out.println("La TV " + marca + " ya está encendida.");
        }
    }

    // Método para apagar la TV
    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("La TV " + marca + " se ha apagado.");
        } else {
            System.out.println("La TV " + marca + " ya está apagada.");
        }
    }

    // Método para subir el volumen
    public void subirVolumen() {
        if (encendida) {
            volumen += 1;
            System.out.println("El volumen de la TV " + marca + " se ha subido a " + volumen + ".");
        } else {
            System.out.println("No se puede subir el volumen porque la TV " + marca + " está apagada.");
        }
    }

    // Método para bajar el volumen
    public void bajarVolumen() {
        if (encendida && volumen > 0) {
            volumen -= 1;
            System.out.println("El volumen de la TV " + marca + " se ha bajado a " + volumen + ".");
        } else if (!encendida) {
            System.out.println("No se puede bajar el volumen porque la TV " + marca + " está apagada.");
        } else {
            System.out.println("El volumen de la TV " + marca + " ya está en el mínimo.");
        }
    }
}
    
    

