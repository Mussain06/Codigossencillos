/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosvideo;

import java.util.Scanner;
public class CalculadoraFloat {
    static Scanner entrada;
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        double resultado = 0;
        System.out.println("Ingrese un número para escoger una opción: ");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Elevar al cuadrado");
        System.out.println("5- Raiz cuadrada");
        System.out.println("Ingrese su número: ");
        int opcion = entrada.nextInt();
        double numero = 0;
        double numero2 = 0;
        if(opcion == 1){
        System.out.println("Ingrese el primer número: ");
        numero = entrada.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        numero2 = entrada.nextDouble();
        resultado = numero + numero2;
        }
        if(opcion == 2){
        System.out.println("Ingrese el primer número: ");
        numero = entrada.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        numero2 = entrada.nextDouble();
        resultado = numero - numero2;
        }
        if(opcion == 3){
        System.out.println("Ingrese el primer número: ");
        numero = entrada.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        numero2 = entrada.nextDouble(); 
        resultado = numero * numero2;
        }
        if(opcion == 4){
        System.out.println("Ingrese el primer número: ");
        numero = entrada.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        numero2 = entrada.nextDouble();
        resultado = Math.pow(numero, numero2);
        }
        if(opcion == 5){
        System.out.println("Ingrese el primer número: ");
        numero = entrada.nextDouble();
        resultado = Math.sqrt(numero);
        }
        System.out.println(resultado);
    }
}
