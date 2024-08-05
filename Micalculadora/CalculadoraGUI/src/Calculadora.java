/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ledes
 */
public class Calculadora {
    public double sumar(Double valor1, Double valor2) {
        return valor1 + valor2; 
    } 
    
    public double restar(Double valor1, Double valor2) {
        return valor1 - valor2; 
    } 
    
    public double multiplicar (Double valor1, Double valor2) {
        return valor1 * valor2; 
    } 
    
    public double dividir (Double valor1, Double valor2) {
        return valor1 / valor2; 
    } 
    
    public double ConvertirFarenheit (Double valorFarenheit) {
            return (valorFarenheit - 32) * 5/9; 
    }
}
