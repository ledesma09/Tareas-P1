/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author ledesma
 */
public class Prueba {
    public static void main(String[] args) {
        // Crear 3 instancias de la clase Tv
        Tv tv1 = new Tv("Samsung", 55);
        Tv tv2 = new Tv("LG", 65);
        Tv tv3 = new Tv("Sony", 50);

        // Asignar valores a los atributos (ya se asignan en el constructor)

        // Invocar cada uno de los métodos
        System.out.println("\nPruebas con la TV1:");
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();

        System.out.println("\nPruebas con la TV2:");
        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();

        System.out.println("\nPruebas con la TV3:");
        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
    }
}
