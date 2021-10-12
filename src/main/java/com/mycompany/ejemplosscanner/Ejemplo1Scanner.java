
package com.mycompany.ejemplosscanner;

import java.util.Scanner;


public class Ejemplo1Scanner {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Se crea un objeto Scanner 
        String nombre; 
        double radio; 
        int n; 
        System.out.println("Introduzca su nombre: "); 
        nombre = teclado.nextLine(); //leer un String 
        System.out.println("El nombre digitado es : " +nombre); 
        System.out.println("Introduzca el radio de la circunferencia: \n"); 
        radio = teclado.nextDouble(); //leer un double 
        System.out.println("Longitud de la circunferencia: \n" + 2*Math.PI*radio); 
        System.out.println("Introduzca un número entero: \n"); 
        n = teclado.nextInt(); //leer un entero 
        System.out.println("El cuadrado es: \n" + Math.pow(n,2)); 
    }
   
}
