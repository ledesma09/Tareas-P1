/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil;

/**
 *
 * @author ledes
 */
public class AutoMovil {

    // atributos de la clase 
    
    private String Marca; 
    private String TipoCombustible; 
    private int NumeroPuertas; 
    private String Color; 
    
    
    // Constructor de mi clase 
    public AutoMovil(){
        System.out.println("Constructor de AutoMovil");
    }
    
    // Los 4 Metodos de mi clase cpn getters y setters 
    
    public String getMarca() {
        return Marca; 
    }
    
      public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    public String getTipoCombustible() {
        return TipoCombustible; 
    }
    
      public void setTipoCombustible(String TipoCombustible) {
        this.TipoCombustible = TipoCombustible;
    }
    
    public int GetNumeroPuertas() {
        return NumeroPuertas; 
    }
  
      public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }
    
    public String GetColor() {
        return Color; 
    }
    
      public void setColor(String Color) {
        this.Color = Color;
    }
      
      // metodos 
       public void Marca() {
        System.out.println("La marca es Honda");
    }
       
      public void TipoCombustible() {
        System.out.println("Este carro usa gasolina premium");
      }
}
