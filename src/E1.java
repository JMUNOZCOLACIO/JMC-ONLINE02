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
public class E1 {
    public static void main(String[] args) {
        int numero1;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un numero: ");
        numero1 = teclado.nextInt();
        
        if (numero1 >= 0){
            System.out.println("El numero " + numero1 + " es positivo");
        } else {
            System.out.println("El numero " + numero1 + " es negativo");
        }
    }
}
