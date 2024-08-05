/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automovil;

/**
 *
 * @author ledes
 */
public class Main {
    public static void main(String[] args) {
        HondaCivic miAutoMovil = new HondaCivic();
        
        miAutoMovil.setMarca("Honda");
        miAutomovil.setTipoCombustible("gasolina");
        miAutoMovil.setColor("rojo");
        miAutoMovil.setNumeroPuertas(4);
        
        System.out.println("Marca: " + miAutoMovil.getMarca());
         System.out.println("TipoCombustible: " + miAutoMovil.getTipoCombustible());
        System.out.println("Color: " + miAutoMovil.GetColor());
        System.out.println("Puertas: " + miAutoMovil.GetNumeroPuertas()); 
        
    }
    
}