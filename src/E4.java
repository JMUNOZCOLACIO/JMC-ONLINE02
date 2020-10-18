import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class E4 {
    public static void main(String[] args){
        int numero1, numero2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduca el segundo numero: ");
        numero2 = teclado.nextInt();
        
        if(numero1 > numero2){
            int i = numero1 - numero2;
            System.out.println("Resta: " + i);
        } else if (numero1 < numero2){
            int i = numero1 + numero2;
            System.out.println("Suma: " + i);
        } else {
            int i = numero1 * numero2;
            System.out.println("Multiplicacion: " + i);
        }
    }
}

