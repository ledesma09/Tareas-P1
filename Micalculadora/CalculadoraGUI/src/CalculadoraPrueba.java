/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ledes
 */
public class CalculadoraPrueba {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        double resultado = cal.sumar(3.5, 6.5);
        System.out.println("resultado = " + resultado );
        
        
        double result = cal.ConvertirFarenheit(50.25);
        System.out.println("resultado = " + result );
}
}