/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosvideo;

import java.util.Scanner;
public class Blancoinutil {
    static Scanner entrada;
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        String operacion = entrada.nextLine();
        char condicion = 0;
        int numero = 0; 
        String nCadena = "";
        char letra = ' ';
        int i = 0;
        while(true){
        letra = operacion.charAt(i);
        if(letra == 'X'||letra == '+' || letra == '-' || letra == '/'){
            condicion = letra;
        break;
        }
        nCadena = nCadena + letra;
        i++;
        }
        double resultado = 0;
        numero = Integer.parseInt(nCadena);
        String nCadena2 = operacion.substring(i+1);
        int numero2 = Integer.parseInt(nCadena2);
        double fNumero2 = (double) numero2;
        double fNumero = (double) numero;
        switch(condicion){
            case 'X': 
                resultado = fNumero2 * fNumero;
            break;
            case '+': 
                resultado = fNumero + fNumero2;
            break;
            case '-':
                resultado = fNumero - fNumero2;
            break;
            case '/': 
                resultado = fNumero/fNumero2;
            break;
        }
        System.out.println(resultado);
    }
}
