/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automovil;

/**
 *
 * @author ledes
 */

// aca cree la clase que hereda de automovil 
public class HondaCivic extends AutoMovil {
    public HondaCivic () {
        super();
        System.out.println("Constructor de HondaCivic");
    }
    
    // aqui sobreescribo dos metodos 
    
    @Override 
    public void Marca() {
        System.out.println("La marca es Honda");
    }
    
    @Override 
     public void TipoCombustible() {
        System.out.println("Este carro usa gasolina premium");
    }
    
}
