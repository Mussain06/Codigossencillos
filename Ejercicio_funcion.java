/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejerciciios;

/**
 *
 * @author mhussain06
 */
import java.util.Scanner;
public class Ejercicio_funcion {
    static Scanner entrada;
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        int casoPrueba = entrada.nextInt(); entrada.nextLine();
        for(int i = 1; i <= casoPrueba; i++){
        casodePrueba();
        }
    }
    private static void casodePrueba(){
        String ecuacion = entrada.nextLine();
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int i = 0;
        char letra = ' ';
        String primerNumero = "";
        String sgundoNumero = "";
        String tercerNumero = "";
        while(letra != 'x'){
            letra = ecuacion.charAt(i);
            if(letra != 'x'){
            primerNumero += letra;
            }
            i++;
        }
        if(ecuacion.length() >= i){
        i = i+2;
        sgundoNumero = "";
        letra = ecuacion.charAt(i);
        while(letra != 'x'){
            letra = ecuacion.charAt(i);
            if(letra != 'x'&&letra != '+'){
            sgundoNumero += letra;
            }
            i++;
        }
        }
        if(ecuacion.length() >= i){
            i++;
        tercerNumero = "";
        while(i < ecuacion.length()){
            letra = ecuacion.charAt(i);
            if(letra != 'x'){
            tercerNumero += letra;
            }
            i++;
        }
        }
        int n1 = Integer.parseInt(primerNumero);
        int n2 = Integer.parseInt(sgundoNumero);
        int n3 = Integer.parseInt(tercerNumero);
        n3 = n3 - numero2;
        int resultado1 = (-(n2)+ (int) Math.sqrt(Math.pow(n2, 2)-4*n1*n3))/2*n1;
        int resultado2 = (-(n2) - (int) Math.sqrt(Math.pow(n2, 2)-4*n1*n3))/2*n1;
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
