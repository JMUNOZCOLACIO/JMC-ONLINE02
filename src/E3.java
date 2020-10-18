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
public class E3 {
    public static void main(String[] args){
        int numero1, numero2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        numero2 = teclado.nextInt();
        
        if (numero1 > numero2){
            System.out.println(numero1 + " es el numero mas alto");
        } else if (numero1 == numero2){
            System.out.println(numero1 + " y " + numero2 + " son el mismo numero");
        } else {
            System.out.println(numero2 + " es el numero mas alto");
        }
        
    }
}
